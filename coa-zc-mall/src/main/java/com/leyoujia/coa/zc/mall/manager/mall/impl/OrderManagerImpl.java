package com.leyoujia.coa.zc.mall.manager.mall.impl;

import api.leyoujia.platform.hr.output.EmpModel;
import com.alibaba.dubbo.config.annotation.Reference;
import com.jjshome.beans.service.provider.PBeansService;
import com.jjshome.pay.bean.OrderCreateParam;
import com.jjshome.pay.bean.OrderCreateResult;
import com.jjshome.pay.service.provider.PPayOrderService;
import com.jjshome.pay.service.provider.PReserveBonusService;
import com.leyoujia.coa.zc.client.mall.constant.CommodityConst;
import com.leyoujia.coa.zc.client.mall.constant.OrderConst;
import com.leyoujia.coa.zc.client.mall.constant.SysParamConst;
import com.leyoujia.coa.zc.client.mall.domain.PayResultDto;
import com.leyoujia.coa.zc.mall.dao.erp.auto.IJhsTradeOrderAutoDAO;
import com.leyoujia.coa.zc.mall.dao.erp.auto.IJhsTradeOrderChildAutoDAO;
import com.leyoujia.coa.zc.mall.dao.erp.auto.JhsTradeOrderChildDynamicSqlSupport;
import com.leyoujia.coa.zc.mall.dao.erp.auto.JhsTradeOrderDynamicSqlSupport;
import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsTradeOrder;
import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsTradeOrderChild;
import com.leyoujia.coa.zc.mall.manager.mall.IOrderManager;
import com.leyoujia.coa.zc.mall.manager.mall.ISystemParamManager;
import com.leyoujia.coa.zc.mall.manager.nhr.INhrManager;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 订单manager实现类
 *
 * @author l
 * @since 2019/7/31
 */
@Component
public class OrderManagerImpl implements IOrderManager {
  private static final Logger LOGGER = LoggerFactory.getLogger(OrderManagerImpl.class);
  /**
   * 默认支付token
   */
  private static final String DEFAULT_PAY_TOKEN = "fab89dec-bcd1-4a0c-8885-a68a945a241b";
  /**
   * 默认支付系统
   */
  private static final String DEFAULT_PAY_SYS = "jjs_oa";

  @Autowired
  private ISystemParamManager systemParamManager;
  @Autowired
  private IJhsTradeOrderAutoDAO jhsTradeOrderAutoDAO;
  @Autowired
  private IJhsTradeOrderChildAutoDAO jhsTradeOrderChildAutoDAO;
  @Reference
  private PPayOrderService payOrderService;
  @Reference
  private PReserveBonusService reserveBonusService;
  @Reference
  private PBeansService beansService;
  @Autowired
  private INhrManager nhrManager;

  @Override
  public PayResultDto pay(JhsTradeOrder order, String payment) {
    PayResultDto payResult = new PayResultDto();
    if (order == null) {
      payResult.setCode(PayResultDto.CODE_NOT_FOUND);
      return payResult;
    }
    //获取支付token
    String payToken = this.getPayToken(payment);
    //根据支付类型调用对应支付
    if (StringUtils.equals(payment, CommodityConst.PAYMENT_CBJ) || StringUtils.equals(payment, CommodityConst.PAYMENT_LD)) {
      //乐豆与储备金方式支付
      payResult = this.payByCBJAndLD(order, payment, payToken);
    } else {
      //创建支付平台订单
      OrderCreateResult payOrder = this.createPayPlatformOrder(order, payment, payToken);
      //支付宝方式支付
      payResult = this.payByAlipayAndOlineBanking(payOrder);
    }
    payResult.setAmount(order.getTotal());
    return payResult;
  }

  /**
   * 支付宝与网银支付
   *
   * @param payOrder 支付平台订单
   * @return 支付结果
   */
  private PayResultDto payByAlipayAndOlineBanking(OrderCreateResult payOrder) {
    LOGGER.info("订单支付--支付宝支付调用支付平台， 支付平台返回参数：{}", payOrder);
    PayResultDto payResult = new PayResultDto();
    payResult.setCode(PayResultDto.CODE_PAY_FAILURE);
    if (payOrder != null && payOrder.isSuccess()) {
      payResult.setCode(PayResultDto.CODE_SUCCEED);
      payResult.setAccount(payOrder.getAcctNo());
      payResult.setPayCode(payOrder.getTradeNo());
      if (StringUtils.isBlank(payOrder.getCodeUrl())) {
        payResult.setQRCode(payOrder.getCodeUrl());
        payResult.setPayment(CommodityConst.PAYMENT_ALIPAY);
      } else {
        payResult.setAccountName(payOrder.getAcctName());
        payResult.setBank(payOrder.getAcctBank());
        payResult.setPayment(CommodityConst.PAYMENT_ONLINE_BANKING);
      }
    }
    return payResult;
  }

  /**
   * 储备金与乐豆支付
   *
   * @param order    订单信息
   * @param payment  支付方式
   * @param payToken 支付token
   * @return 支付结果
   */
  private PayResultDto payByCBJAndLD(JhsTradeOrder order, String payment, String payToken) {
    PayResultDto payResult = new PayResultDto();
    //构建调用支付平台支付接口所需参数
    Map<String, Object> payMap = new HashMap<>();
    Map<String, Object> resultMap;
    payMap.put("token", payToken);
    payMap.put("tradeNumber", order.getOrderNo());
    payMap.put("amount", order.getTotal());
    if (StringUtils.equals(payment, CommodityConst.PAYMENT_CBJ)) {
      payMap.put("remark", "乐划算（订单号：" + order.getOrderNo() + ")");
      payMap.put("workerId", order.getWorkerId());
      payMap.put("executorId", order.getWorkerId());
      //调用支付平台储备金支付接口
      LOGGER.info("订单支付--调用储备金支付接口， 订单ID：{}，支付参数：{}", order.getId(), payMap);
      resultMap = this.reserveBonusService.toPayByReserveBonus(payMap);
    } else {
      payMap.put("acctType", 1);
      payMap.put("acctNo", order.getWorkerId());
      //调用支付平台乐豆支付接口
      LOGGER.info("订单支付--调用乐豆支付接口， 订单ID：{}，支付参数：{}", order.getId(), payMap);
      resultMap = this.beansService.toPayByBeans(payMap);
    }
    if (MapUtils.isEmpty(resultMap) || StringUtils.equals("1", MapUtils.getString(resultMap, "infoNo"))) {
      //支付失败
      LOGGER.error("订单支付--调用支付平台支付失败， 订单ID：{}，支付参数：{}", order.getId(), payMap);
      payResult.setCode(PayResultDto.CODE_PAY_FAILURE);
      return payResult;
    }

    payResult.setCode(PayResultDto.CODE_SUCCEED);
    payResult.setPayment(payment);
    return payResult;
  }

  /**
   * 为支付成功的订单更新订单、子订单和公费订单状态
   *
   * @param order   订单信息
   * @param payment 支付方式
   * @return 更新是否成功
   */
  @Override
  public boolean updateOrderForPaySuccess(JhsTradeOrder order, String payment) {
    //更新订单状态与时间
    order.setStatus(OrderConst.STATUS_PAID);
    Date now = new Date();
    order.setPayDate(now);
    order.setPayMethod(payment);
    int updateRow = this.jhsTradeOrderAutoDAO.updateByPrimaryKeySelective(order);

    boolean result = updateRow > 0 ? true : false;
    if (result) {
      //更新公费订单
      JhsTradeOrder gfOrder = new JhsTradeOrder();
      gfOrder.setPayDate(now);
      gfOrder.setPayMethod(payment);
      this.jhsTradeOrderAutoDAO.updateByExampleSelective(gfOrder)
        .where(JhsTradeOrderDynamicSqlSupport.orderNo, SqlBuilder.isEqualTo(order.getOrderNo() + OrderConst.GF_ORDER_SUFFIX))
        .build().execute();
      //更新子订单
      JhsTradeOrderChild orderChild = new JhsTradeOrderChild();
      orderChild.setStatus(OrderConst.STATUS_PAID);
      orderChild.setPayDate(now);
      orderChild.setPayMethod(payment);
      this.jhsTradeOrderChildAutoDAO.updateByExampleSelective(orderChild)
        .where(JhsTradeOrderChildDynamicSqlSupport.parentId, SqlBuilder.isEqualTo(order.getId()))
        .build().execute();
    }
    return result;
  }

  /**
   * 创建支付平台订单
   *
   * @param order    订单信息
   * @param payment  支付方式
   * @param payToken 支付token
   * @return 支付平台订单
   */
  private OrderCreateResult createPayPlatformOrder(JhsTradeOrder order, String payment, String payToken) {
    //获取创建支付平台订单所需的参数
    OrderCreateParam orderParam = this.getOrderParam(order, payToken);
    LOGGER.info("订单支付-创建支付平台订单， 参数：{}", orderParam);
    //创建支付平台订单
    return payOrderService.createOrder(orderParam);
  }

  /**
   * 获取创建支付平台订单所需的参数
   *
   * @param order    订单信息
   * @param payToken 支付token
   * @return 支付平台订单创建参数
   */
  private OrderCreateParam getOrderParam(JhsTradeOrder order, String payToken) {
    //获取参数表中的系统参数
    String system = DEFAULT_PAY_SYS;
    String sys = this.systemParamManager.getParamValue(SysParamConst.KEY_SYSTEM_OA);
    if (StringUtils.isNotBlank(sys)) {
      system = sys;
    }
    //查询购买者信息
    EmpModel emp = nhrManager.getByEmpNumber(order.getWorkerId());
    //构建参数
    OrderCreateParam orderParam = new OrderCreateParam();
    orderParam.setPayToken(payToken);
    orderParam.setOutTradeNo(order.getOrderNo());
    orderParam.setoEmpName(order.getWorkerName());
    orderParam.setoEmpNumber(order.getWorkerId());
    orderParam.setoDeptName(emp.getDeptName());
    orderParam.setoDeptNumber(emp.getDeptNumber());
    orderParam.setPayAmt(order.getTotal());
    orderParam.setSystem(system);
    return orderParam;
  }


  /**
   * 获取支付token
   *
   * @param payment 支付方式
   * @return 支付token
   */
  private String getPayToken(String payment) {
    //默认token
    String payToken = DEFAULT_PAY_TOKEN;
    //设置token的key
    String tokenKey = SysParamConst.KEY_PAY_TOKEN_DEFAULT;
    if (StringUtils.equals(payment, CommodityConst.PAYMENT_CBJ)) {
      tokenKey = SysParamConst.KEY_PAY_TOKEN_CBJ;
    } else if (StringUtils.equals(payment, CommodityConst.PAYMENT_LD)) {
      tokenKey = SysParamConst.KEY_PAY_TOKEN_SD;
    }
    //获取token
    String sysToken = this.systemParamManager.getParamValue(tokenKey);
    if (StringUtils.isNotBlank(sysToken)) {
      payToken = sysToken;
    }
    return payToken;
  }
}
