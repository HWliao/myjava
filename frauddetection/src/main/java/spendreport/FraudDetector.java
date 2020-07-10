/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package spendreport;

import org.apache.flink.api.common.state.ValueState;
import org.apache.flink.api.common.state.ValueStateDescriptor;
import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.functions.KeyedProcessFunction;
import org.apache.flink.util.Collector;
import org.apache.flink.walkthrough.common.entity.Alert;
import org.apache.flink.walkthrough.common.entity.Transaction;

import java.io.IOException;

/**
 * Skeleton code for implementing a fraud detector.
 *
 * @author HWliao
 */
public class FraudDetector extends KeyedProcessFunction<Long, Transaction, Alert> {

  private static final long serialVersionUID = 1L;

  private static final double SMALL_AMOUNT = 1.00;
  private static final double LARGE_AMOUNT = 500.00;
  private static final long ONE_MINUTE = 60 * 1000;

  private transient ValueState<Boolean> flagState;

  private transient ValueState<Long> timerState;

  @Override
  public void open(Configuration parameters) {
    ValueStateDescriptor<Boolean> flagDescriptor = new ValueStateDescriptor<>("flag", Types.BOOLEAN);
    this.flagState = this.getRuntimeContext().getState(flagDescriptor);
    ValueStateDescriptor<Long> timerDescriptor = new ValueStateDescriptor<>("timer-state", Types.LONG);
    this.timerState = this.getRuntimeContext().getState(timerDescriptor);
  }

  @Override
  public void processElement(
    Transaction transaction,
    Context context,
    Collector<Alert> collector) throws IOException {

    Boolean lastTransactionWasSmall = this.flagState.value();

    if (lastTransactionWasSmall != null) {
      if (transaction.getAmount() > LARGE_AMOUNT) {
        Alert alert = new Alert();
        alert.setId(transaction.getAccountId());
        collector.collect(alert);
      }
      this.cleanUp(context);
    }

    if (transaction.getAmount() < SMALL_AMOUNT) {
      this.flagState.update(true);

      long timer = context.timerService().currentProcessingTime() + ONE_MINUTE;
      context.timerService().registerEventTimeTimer(timer);

      timerState.update(timer);
    }
  }

  @Override
  public void onTimer(long timestamp, OnTimerContext ctx, Collector<Alert> out) {
    this.flagState.clear();
    this.timerState.clear();
  }

  private void cleanUp(Context context) throws IOException {
    Long timer = this.timerState.value();
    context.timerService().deleteEventTimeTimer(timer);

    timerState.clear();
    flagState.clear();
  }
}
