package com.leyoujia.coa.zc.mall.service.impl;

import com.leyoujia.coa.zc.mall.dao.erp.auto.IJhsOperationLogAutoDAO;
import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsOperationLog;
import com.leyoujia.coa.zc.mall.service.ITestTxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @author lhw
 * @date 2019/8/3
 */
@Service
public class TestTxServiceImpl implements ITestTxService {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private IJhsOperationLogAutoDAO iJhsOperationLogAutoDAO;

  @Transactional(value = "erpTxManager", rollbackFor = Exception.class)
  @Override
  public void insert2Log(boolean exception) {
    this.iJhsOperationLogAutoDAO.insertSelective(getLog());
    if (exception) {
      throw new RuntimeException();
    }
    this.iJhsOperationLogAutoDAO.insertSelective(getLog());
  }

  @Override
  public void insert2Log1(boolean exception) {
    this.iJhsOperationLogAutoDAO.insertSelective(getLog());
    if (exception) {
      throw new RuntimeException();
    }
    this.iJhsOperationLogAutoDAO.insertSelective(getLog());
  }

  private JhsOperationLog getLog() {
    Random random = new Random();
    int i = random.nextInt();
    this.logger.info("busId:{}", i);
    JhsOperationLog log1 = new JhsOperationLog();
    log1.setBusType(1);
    log1.setBusId(i);
    log1.setOpType("lhwtest");
    log1.setOpContent("test");
    return log1;
  }
}
