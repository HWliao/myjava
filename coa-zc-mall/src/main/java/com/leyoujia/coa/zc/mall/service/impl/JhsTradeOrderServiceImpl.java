package com.leyoujia.coa.zc.mall.service.impl;

import api.leyoujia.platform.hr.output.EmpModel;
import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.leyoujia.coa.common.mybatis.MybatisUtil;
import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.constant.CommodityConst;
import com.leyoujia.coa.zc.client.mall.constant.OrderConst;
import com.leyoujia.coa.zc.client.mall.domain.*;
import com.leyoujia.coa.zc.client.mall.exception.OrderCreateException;
import com.leyoujia.coa.zc.mall.dao.erp.IErpWorkerDAO;
import com.leyoujia.coa.zc.mall.dao.erp.IJhsTradeOrderDAO;
import com.leyoujia.coa.zc.mall.dao.erp.auto.*;
import com.leyoujia.coa.zc.mall.dao.erp.entity.*;
import com.leyoujia.coa.zc.mall.domain.mall.CommodityDomain;
import com.leyoujia.coa.zc.mall.manager.mall.ICommodityManager;
import com.leyoujia.coa.zc.mall.manager.mall.IOrderManager;
import com.leyoujia.coa.zc.mall.manager.nhr.INhrManager;
import com.leyoujia.coa.zc.mall.service.IJhsCommodityExchangeCodeService;
import com.leyoujia.coa.zc.mall.service.IJhsCommodityService;
import com.leyoujia.coa.zc.mall.service.IJhsTradeOrderService;
import com.leyoujia.coa.zc.mall.util.MallDataVersionUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.mybatis.dynamic.sql.render.RenderingStrategy;
import org.mybatis.dynamic.sql.where.WhereDSL;
import org.mybatis.dynamic.sql.where.render.WhereClauseProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Nonnull;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import static com.leyoujia.coa.zc.client.mall.constant.CommodityConst.*;
import static com.leyoujia.coa.zc.client.mall.constant.MallUserTypeConst.LEYOUJIA_MALL;
import static com.leyoujia.coa.zc.client.mall.constant.OrderConst.*;
import static com.leyoujia.coa.zc.client.mall.exception.OrderCreateException.*;
import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsTradeOrderDynamicSqlSupport.ofrom;
import static com.leyoujia.coa.zc.mall.dao.erp.auto.JhsTradeOrderDynamicSqlSupport.status;
import static com.leyoujia.coa.zc.mall.util.MallCheckUtil.checkCeateOrder;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

/**
 * 订单service
 *
 * @author l
 * @since 2019/7/26
 */
@Service
public class JhsTradeOrderServiceImpl implements IJhsTradeOrderService {
  private static final Logger LOGGER = LoggerFactory.getLogger(JhsTradeOrderServiceImpl.class);
  @Autowired
  private IJhsTradeOrderAutoDAO jhsTradeOrderAutoDAO;
  @Autowired
  private IJhsCommodityTextkAutoDAO jhsCommodityTextkAutoDAO;
  @Autowired
  private IJhsTradeOrderDAO jhsTradeOrderDAO;
  @Autowired
  private IJhsCommodityDictAutoDAO iJhsCommodityDictAutoDAO;
  @Autowired
  private IJhsCommodityService jhsCommodityService;
  @Autowired
  private ICommodityManager iCommodityManager;
  @Autowired
  private INhrManager iNhrManager;
  @Autowired
  private IJhsCommodityAutoDAO jhsCommodityAutoDAO;
  @Autowired
  private IOrderManager orderManager;
  @Autowired
  private IJhsCommodityExchangeCodeService exchangeCodeService;
  @Autowired
  private IErpWorkerDAO iErpWorkerDAO;
  @Autowired
  private IJhsMedicalExaminerAutoDAO iJhsMedicalExaminerAutoDAO;
  @Autowired
  private IJhsTradeOrderChildAutoDAO iJhsTradeOrderChildAutoDAO;

  @Override
  public List<JhsTradeOrder> listByWorkerAndStatus(String workerId, List<Integer> statuses) {
    if (StringUtils.isBlank(workerId) || CollectionUtils.isEmpty(statuses)) {
      return null;
    }
    return this.jhsTradeOrderAutoDAO.selectByExample().where(JhsTradeOrderDynamicSqlSupport.workerId, isEqualTo(workerId)).and(status, isIn(statuses)).build().execute();
  }

  @Override
  public PageInfo<OrderDto> listByWorkerAndChannel(String workerId, Integer channel, PageInfo page) {
    if (StringUtils.isBlank(workerId)) {
      return null;
    }
    //构造查询条件
    //购买者
    WhereDSL whereDsl = where(JhsTradeOrderDynamicSqlSupport.workerId, isEqualTo(workerId));
    if (channel != null) {
      //下单渠道
      whereDsl.and(ofrom, isEqualTo(channel));
    }
    //创建查询WhereClauseProvider
    WhereClauseProvider where = MybatisUtil.createWhereClauseProvider(whereDsl);
    //分页条件
    page = page == null ? new PageInfo() : page;
    //分页查询订单
    List<JhsTradeOrder> orders = this.jhsTradeOrderDAO.selectByExample(where, page.getPageSize(), page.getStartRow());
    //查询数量
    Long total = this.jhsTradeOrderDAO.countByExample(where);
    //将JhsTradeOrder转为OrderDto对象，并返回
    List<OrderDto> orderDtos = orders.stream().map(order -> orderToOrderDto(order)).collect(Collectors.toList());
    //设置分页结果
    page.setList(orderDtos);
    page.setTotal(total);
    return page;
  }

  @Override
  public OrderDetailDto getOrderDetailById(Integer orderId) {
    if (orderId == null) {
      return null;
    }
    //查询订单
    JhsTradeOrder order = this.jhsTradeOrderAutoDAO.selectByPrimaryKey(orderId);
    if (order == null) {
      return null;
    }

    //查询订单对应商品描述与使用说明
    JhsCommodityText commodityText = this.jhsCommodityTextkAutoDAO.selectOne(
      select(JhsCommodityTextDynamicSqlSupport.content, JhsCommodityTextDynamicSqlSupport.manual)
        .from(JhsCommodityTextDynamicSqlSupport.jhsCommodityText)
        .where(JhsCommodityTextDynamicSqlSupport.attachId, isEqualTo(order.getCommodityId()))
        .build().render(RenderingStrategy.MYBATIS3));

    //转为订单详情Dto
    return toOrderDetailDto(order, commodityText);
  }

  @Transactional(value = "erpTxManager", rollbackFor = Exception.class)
  @Override
  public OrderDetailDto createOrder(@Nonnull OrderCommand command) throws OrderCreateException {
    // 参数检查
    checkCeateOrder(StringUtils.isNotEmpty(command.getUserId()), "用户ID不能为空!", USER_ID_INVALID);
    if (LEYOUJIA_MALL.equals(command.getFrom())) {
      checkCeateOrder(StringUtils.isNotEmpty(command.getUserName()), "用户名称不能为空!", USER_NAME_INVALID);
    }

    // 买家
    EmpModel emp = null;
    if (!LEYOUJIA_MALL.equals(command.getFrom())) {
      emp = this.iNhrManager.getByEmpNumber(command.getUserId());
      checkCeateOrder(emp != null, "找不到对应员工信息!", USER_ID_INVALID);
    } else {
      emp = new EmpModel();
      emp.setEmpNumber(command.getUserId());
      emp.setEmpName(command.getUserName());
      emp.setDeptNumber("");
      emp.setDeptName("");
    }

    CommodityDomain commodity = this.iCommodityManager.getCommodityDomain(command.getCommodityId());
    checkCeateOrder(commodity != null, "该商品不存在，不能购买！", COMMODITY_NOT_FOUND);

    // 商品状态检查
    checkCeateOrder(!commodity.isSlef(command.getUserId()), "您不能购买自己发布的商品！", COMMODITY_RSTRICTED);
    checkCeateOrder(commodity.isValidCommodity(), "只能购买已审核已上架的商品!", COMMODITY_INVALID);

    // 商品分类字典选择判断
    if (CollectionUtils.isNotEmpty(commodity.getDicts())) {
      checkCeateOrder(
        commodity.getDicts().stream().anyMatch(dict -> Objects.equals(command.getDictText(), dict.getDicttext())),
        "该商品不存在此分类！",
        COMMODITY_DICT_ERROR
      );
    } else {
      checkCeateOrder(StringUtils.isEmpty(command.getDictText()), "该商品不存在分类！", COMMODITY_DICT_ERROR);
    }

    // 虚拟类商品检查 兑换码 兑换链接
    if (commodity.isExchangeCode() || commodity.isExchangeLink()) {
      checkCeateOrder(Objects.equals(command.getTakeType(), TAKE_SELF), "虚拟卷类商品只能自取!", COMMODITY_RSTRICTED);
      checkCeateOrder(!commodity.canOnlyOne() || !this.hasAlreadyPurchased(command.getUserId(), command.getCommodityId()), "购买失败，该商品只能单次兑换!", COMMODITY_RSTRICTED);
    }
    // 体检类商品检查
    if (commodity.isMedicalExaminer()) {
      checkCeateOrder(command.getMedicalExaminer() != null, "体检人信息不能为空", COMMAND_ERROR);
      checkCeateOrder(StringUtils.isNotEmpty(command.getMedicalExaminer().getExaminerName()), "体检人姓名不能为空", COMMAND_ERROR);
      checkCeateOrder(StringUtils.isNotEmpty(command.getMedicalExaminer().getIdCard()), "体检人省份证信息不能为空", COMMAND_ERROR);
      checkCeateOrder(StringUtils.isNotEmpty(command.getMedicalExaminer().getPhoneNumber()), "体检人联系方式不能为空", COMMAND_ERROR);
      checkCeateOrder(StringUtils.isNotEmpty(command.getMedicalExaminer().getProvinceCode()) && StringUtils.isNotEmpty(command.getMedicalExaminer().getProvince()), "体检省份不能为空", COMMAND_ERROR);
      checkCeateOrder(StringUtils.isNotEmpty(command.getMedicalExaminer().getCityCode()) && StringUtils.isNotEmpty(command.getMedicalExaminer().getCityName()), "体检城市不能为空", COMMAND_ERROR);
    }
    // 服装类商品检查
    if (commodity.isCloth()) {
      checkCeateOrder(!commodity.isGfSuit() || !this.hasAlreadyPurchasedGf(command.getUserId()), "购买失败，公费工装一年只能购买一次！", COMMODITY_RSTRICTED);
      if (commodity.isSuit()) {
        // 套装 商品必须有子商品
        checkCeateOrder(commodity.hasChild(), "商品配置错误,套装类商品必须包含子商品", COMMODITY_SETTING_ERROR);
        // 套装必须要选择子商品
        checkCeateOrder(CollectionUtils.isNotEmpty(command.getStandard()), "该商品具有子商品,请选择子商品后重新购买!", COMMODITY_DICT_ERROR);

        // 检查所选子商品,是否有效
        List<OrderDictDto> standards = command.getStandard();
        List<CommodityDomain> childs = commodity.getChilds();
        for (OrderDictDto standard : standards) {
          CommodityDomain tmpC = childs.stream().filter(child -> Objects.equals(child.getCommodity().getId(), standard.getId())).findFirst().orElse(null);
          checkCeateOrder(tmpC != null, "选择了无效子商品 " + standard.getName() + " ,请重新购买!", COMMODITY_DICT_ERROR);
          checkCeateOrder(tmpC.isValidCommodity(), "选择了未上架/未审核的子商品 " + standard.getName() + " ,请重新购买!", COMMODITY_DICT_ERROR);
        }
      } else {
        // 非套装商品必须有分类
        checkCeateOrder(CollectionUtils.isNotEmpty(commodity.getDicts()), "商品配置错误,服装类商品必须包含分类字典!", COMMODITY_SETTING_ERROR);
        // 非套状必须选择分类字典
        checkCeateOrder(StringUtils.isNotEmpty(command.getDictText()), "服装类商品必须选择分类!", COMMODITY_DICT_ERROR);
        // 非套装不能选择子商品
        checkCeateOrder(CollectionUtils.isEmpty(command.getStandard()), "该商品不具有子商品,请选择重新购买!", COMMODITY_DICT_ERROR);
      }
    }

    // 购买数量校验
    if (commodity.isExchangeCode() || commodity.isExchangeLink() || commodity.isMedicalExaminer() || commodity.isSuit()) {
      // 兑换码/兑换链接/体检商品/服装套装 一次只能买一个
      checkCeateOrder(Objects.equals(command.getCount(), 1L), "该商品一次只能买一件!", COMMODITY_RSTRICTED);
    }

    // 库存/商品数量/分类字典数量 检查/更新
    if (commodity.isExchangeCode()) {
      // 兑换现有库存等于有效兑换码数减去待付款订单数量
      Long exchangeCodeNum = commodity.getExchangeCodeNum();
      Long orderNum = this.jhsTradeOrderDAO.countPendingOrderByCommodityId(command.getCommodityId(), command.getDictText(), Lists.newArrayList(STATUS_WAITIND_PAYMENT), MallDataVersionUtil.getOrderDataVersion());
      checkCeateOrder(command.getCount() <= (exchangeCodeNum - orderNum), "购买失败，兑换码库存不足！", COMMODITY_NO_STOCK);
    } else if (!commodity.isCloth()) {
      // 非服装类商品,没有库存管理的商品
      JhsCommodityDict dict = commodity.getDicts().stream().filter(d -> Objects.equals(d.getDicttext(), command.getDictText())).findFirst().orElse(null);
      if (dict != null) {
        // 带分类字典
        checkCeateOrder(command.getCount() <= dict.getCount(), "购买失败，该商品此分类数量不足，请刷新页面重试！", COMMODITY_NO_STOCK);
        // 更新分类数量
        int r = this.jhsCommodityService.updateCommodityDictCount(dict.getId(), (int) (dict.getCount() - command.getCount()));
      } else {
        // 不带分类字典
        checkCeateOrder(command.getCount() <= commodity.getCommodity().getCount(), "购买失败，该商品数量不足，请刷新页面重试！", COMMODITY_NO_STOCK);
      }
      // 更新商品数量
      int r = this.jhsCommodityService.updateCommodityCount(commodity.getCommodity().getId(), (int) (commodity.getCommodity().getCount() - command.getCount()));
    } else if (!commodity.isSuit()) {
      // 服装类非套装
      List<JhsCommodityStock> stocks = commodity.getStocks();
      stocks = CollectionUtils.isNotEmpty(stocks) ? stocks : Lists.newArrayList();
      // 找到商品对应库存
      JhsCommodityStock stock = stocks.stream().filter(s -> Objects.equals(s.getCommodityStandard(), command.getDictText())).findFirst().orElse(null);
      // 未发货订单商品数量
      Long orderNum = this.jhsTradeOrderDAO.countPendingOrderByCommodityId(command.getCommodityId(), command.getDictText(), Lists.newArrayList(STATUS_WAITIND_PAYMENT, STATUS_PAID), MallDataVersionUtil.getOrderDataVersion());
      checkCeateOrder(stock != null && (command.getCount() <= stock.getNum().longValue() - orderNum), "购买失败，该商品此分类库存不足！", COMMODITY_NO_STOCK);
    } else {
      // 服装类套装(公费套装)

      // 合并子商品选择
      Map<String, OrderDictDto> combine = Maps.newHashMap();
      List<OrderDictDto> standards = command.getStandard();
      for (OrderDictDto standard : standards) {
        String key = standard.getId() + standard.getDictText();
        OrderDictDto tmp = combine.get(key);
        if (tmp == null) {
          tmp = new OrderDictDto();
          tmp.setId(standard.getId());
          tmp.setDictText(standard.getDictText());
          tmp.setName(standard.getName());
          tmp.setCount(command.getCount().intValue());
          tmp.setGf(standard.isGf());
        } else {
          tmp.setCount(tmp.getCount() + command.getCount().intValue());
        }
        combine.put(key, tmp);
      }
      // 判断库存
      for (OrderDictDto tmp : combine.values()) {
        Long stock = commodity.getChilds().stream()
          // 找到对应子商品
          .filter(child -> Objects.equals(child.getCommodity().getId(), tmp.getId()))
          .flatMap(child -> child.getStocks().stream())
          // 找到对应分类库存
          .filter(s -> Objects.equals(s.getCommodityStandard(), tmp.getDictText()))
          .findFirst()
          .map(JhsCommodityStock::getNum)
          // 得到库存数量
          .map(BigDecimal::longValue)
          // 库存不存在为0
          .orElse(0L);

        Long orderNum = this.jhsTradeOrderDAO.countPendingOrderByCommodityId(tmp.getId(), tmp.getDictText(), Lists.newArrayList(STATUS_WAITIND_PAYMENT, STATUS_PAID), MallDataVersionUtil.getOrderDataVersion());
        checkCeateOrder(tmp.getCount() <= (stock - orderNum), "购买失败，所选子商品 " + tmp.getName() + "-" + tmp.getDictText() + " 库存不足！", COMMODITY_NO_STOCK);
      }
    }
    // 录入订单数据

    JhsTradeOrder order = new JhsTradeOrder();
    order.setOrderNo(this.getOrderNo(commodity.getCommodity().getStaffId()));
    order.setType(1);
    order.setCommodityId(commodity.getCommodity().getId());
    order.setCommodityName(commodity.getCommodity().getTitle());
    order.setPrice(commodity.getCommodity().getPrice());
    order.setCount(command.getCount().intValue());
    order.setTotal(order.getCount() * order.getPrice());
    order.setOfrom(command.getFrom());
    order.setStatus(STATUS_WAITIND_PAYMENT);
    order.setWorkerId(emp.getEmpNumber());
    order.setWorkerName(emp.getEmpName());
    order.setBuyerDeptId(emp.getDeptNumber());
    order.setBuyerDeptName(emp.getDeptName());
    order.setCreateDate(new Date());
    order.setSellerId(commodity.getCommodity().getStaffId());
    order.setSellerName(commodity.getCommodity().getStaffName());
    order.setSellerDeptId(commodity.getCommodity().getDeptId());
    order.setSellerDeptName(commodity.getCommodity().getDeptName());
    order.setIntegral(0);
    List<OrderDictDto> standard = CollectionUtils.isNotEmpty(command.getStandard()) ? command.getStandard() : Lists.newArrayList();
    order.setStandard(JSON.toJSONString(standard));
    order.setRecipients(command.getTakeWorker());
    order.setBuyerTel(command.getTakePhone());
    order.setBuyerAddress(command.getTakeAdrr());
    order.setRemarks(command.getRemark());
    order.setProvince(command.getTakeProvince());
    order.setCity(command.getTakeCity());
    order.setArea(command.getTakeArea());
    order.setShopAddr(command.getShopName());
    order.setTakeType(command.getTakeType());
    order.setPayMethod(commodity.getCommodity().getPayMethod());
    order.setDicttext(command.getDictText());
    // 重要
    order.setDataVersion(MallDataVersionUtil.getOrderDataVersion());
    order.setExchangeMethod(commodity.isExchangeCode() ? EXCHANGE_METHOD_CODE : commodity.isExchangeLink() ? EXCHANGE_METHOD_LINK : null);

    int i = this.jhsTradeOrderAutoDAO.insertSelective(order);
    checkCeateOrder(i > 0, "新增订单失败!", ORDER_CREATE_ERROR);

    // 新增体检类型信息
    if (commodity.isMedicalExaminer()) {
      JhsMedicalExaminer medicalExaminer = new JhsMedicalExaminer();
      medicalExaminer.setOrderId(order.getId());
      medicalExaminer.setExaminerName(command.getMedicalExaminer().getExaminerName());
      medicalExaminer.setExaminerIdcard(command.getMedicalExaminer().getIdCard());
      medicalExaminer.setProvinceCode(command.getMedicalExaminer().getProvinceCode());
      medicalExaminer.setProvinceName(command.getMedicalExaminer().getProvince());
      medicalExaminer.setCityCode(command.getMedicalExaminer().getCityCode());
      medicalExaminer.setCityName(command.getMedicalExaminer().getCityName());
      medicalExaminer.setPhoneNumber(command.getMedicalExaminer().getPhoneNumber());
      this.iJhsMedicalExaminerAutoDAO.insertSelective(medicalExaminer);
    }

    // 套装/公费商品订单处理处理
    double gfPrice = 0;
    double gfTotal = 0;
    if (CollectionUtils.isNotEmpty(command.getStandard())) {
      // 子商品创建子订单
      List<OrderDictDto> tmpStandards = command.getStandard();
      for (OrderDictDto tmpStandard : tmpStandards) {
        CommodityDomain child = commodity.findChild(tmpStandard.getId());
        checkCeateOrder(child != null, "选择了错误的子商品!", COMMODITY_DICT_ERROR);
        JhsTradeOrderChild childOrder = new JhsTradeOrderChild();
        BeanUtils.copyProperties(order, childOrder);
        childOrder.setParentId(order.getId());
        childOrder.setCommodityId(child.getCommodity().getId());
        childOrder.setCommodityName(child.getCommodity().getTitle());
        childOrder.setPrice(child.getCommodity().getPrice());
        childOrder.setTotal(childOrder.getPrice() * childOrder.getCount());
        childOrder.setDicttext(tmpStandard.getDictText());
        if (tmpStandard.isGf()) {
          childOrder.setOrderNo(order.getOrderNo() + GF_ORDER_SUFFIX);
          childOrder.setType(4);
          gfPrice += childOrder.getPrice();
          gfTotal += childOrder.getTotal();
        }
        this.iJhsTradeOrderChildAutoDAO.insertSelective(childOrder);
      }
    }

    if (commodity.isGfSuit()) {
      JhsTradeOrder gfOrder = new JhsTradeOrder();
      BeanUtils.copyProperties(order, gfOrder);
      gfOrder.setStatus(STATUS_GF);
      gfOrder.setType(4);
      gfOrder.setOrderNo(order.getOrderNo() + GF_ORDER_SUFFIX);
      this.jhsTradeOrderAutoDAO.insertSelective(gfOrder);
    }
    return this.getOrderDetailById(order.getId());
  }

  /**
   * 获取订单编号
   *
   * @param staffId 商品录入操作人ID
   * @return orderNo
   */
  @Nonnull
  private String getOrderNo(@Nonnull String staffId) {
    String comCode = this.iErpWorkerDAO.findComCodeByWorkerId(staffId);
    checkCeateOrder(comCode != null, "商品创建人所在公司编号不存在!", COMMODITY_SETTING_ERROR);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
    return "JHS-" + comCode + sdf.format(new Date());
  }

  private boolean hasAlreadyPurchasedGf(@Nonnull String userId) {
    String date = LocalDate.now().plusYears(-1).toString();
    List<Integer> categroyIds = Lists.newArrayList(COMMODITY_GF1, COMMODITY_GF2, COMMODITY_GF3);
    return this.jhsTradeOrderDAO.countAlreadyPurchasedGf(userId, date, categroyIds) > 0;
  }

  private boolean hasAlreadyPurchased(@Nonnull String userId, @Nonnull Integer commodityId) {
    Long count = this.jhsTradeOrderAutoDAO.countByExample()
      .where(JhsTradeOrderDynamicSqlSupport.workerId, isEqualTo(userId))
      .and(JhsTradeOrderDynamicSqlSupport.commodityId, isEqualTo(commodityId))
      .and(status, isIn(VALID_ORDER_STATUSES))
      .build()
      .execute();
    return count > 0;
  }

  @Override
  public JhsTradeOrder getOrderByOrderNo(String orderNo) {
    if (StringUtils.isBlank(orderNo)) {
      return null;
    }
    List<JhsTradeOrder> jhsTradeOrders = this.jhsTradeOrderAutoDAO.selectByExample()
      .where(JhsTradeOrderDynamicSqlSupport.orderNo, isEqualTo(orderNo))
      .limit(1)
      .build().execute();
    return jhsTradeOrders == null ? null : jhsTradeOrders.get(0);
  }

  @Override
  @Transactional(rollbackFor = Exception.class)
  public PayResultDto payOrder(Integer orderId, String payment) {
    LOGGER.info("订单支付--订单ID：{}，支付方式：{}", orderId, payment);
    PayResultDto result = new PayResultDto();
    result.setCode(PayResultDto.CODE_PAY_FAILURE);
    //查询订单
    JhsTradeOrder order = this.jhsTradeOrderAutoDAO.selectByPrimaryKey(orderId);
    //校验订单是否已存在、已付款、已处理
    Integer payCode = this.checkOrder(order);
    if (payCode >= 0) {
      LOGGER.warn("订单支付--订单状态异常，订单：{}", order);
      result.setCode(payCode);
      return result;
    }
    //查询订单对应商品
    JhsCommodity commodity = this.jhsCommodityAutoDAO.selectByPrimaryKey(order.getCommodityId());
    payCode = this.checkCommodtiy(commodity, payment, orderId);
    if (payCode >= 0) {
      result.setCode(payCode);
      return result;
    }
    //调用支付平台支付
    result = this.orderManager.pay(order, payment);
    LOGGER.info("订单支付--支付结果：{}，订单ID：{}", result, orderId);
    if (PayResultDto.CODE_SUCCEED.equals(result.getCode())
      && (StringUtils.equals(payment, CommodityConst.PAYMENT_CBJ) || StringUtils.equals(payment, CommodityConst.PAYMENT_LD))) {
      //储备金、乐豆支付后更新订单状态
      this.orderManager.updateOrderForPaySuccess(order, payment);
      //虚拟类商品将兑换码、兑换链接设置入订单
      this.orderSetVirtualProperty(order, commodity);
    }
    //将最新订单信息设置入支付结果中
    OrderDetailDto detail = this.getOrderDetailById(orderId);
    result.setOrder(detail);
    return result;
  }

  @Override
  public void orderGetExchangeCode(JhsTradeOrder order) {
    if (order == null || order.getId() == null) {
      return;
    }
    //查询有效兑换码
    JhsCommodityExchangeCode code = this.exchangeCodeService.getValid(order.getCommodityId());
    if (code != null) {
      //将该兑换码置为无效
      this.exchangeCodeService.invalidCode(code);
      //将兑换码设给订单，并更新订单状态
      order.setExchangeCode(code.getExchangeCode());
      order.setStatus(OrderConst.STATUS_SUCCEED);
      order.setReceiptDate(new Date());
      this.jhsTradeOrderAutoDAO.updateByPrimaryKeySelective(order);
    }
  }

  @Override
  public void orderGetExchangeLink(JhsTradeOrder order, String link) {
    if (order == null || order.getId() == null || StringUtils.isBlank(link)) {
      return;
    }
    //将兑换码设给订单，并更新订单状态
    order.setExchangeLink(link);
    order.setStatus(OrderConst.STATUS_SUCCEED);
    order.setReceiptDate(new Date());
    this.jhsTradeOrderAutoDAO.updateByPrimaryKeySelective(order);
  }

  /**
   * 订单设置虚拟商品的属性
   * 如兑换码、兑换链接
   *
   * @param order     订单信息
   * @param commodity 商品信息
   */
  private void orderSetVirtualProperty(JhsTradeOrder order, JhsCommodity commodity) {
    if (CommodityConst.COMMODITY_EXCHANGE_CODE.equals(commodity.getCategoryId())) {
      //兑换码类型商品，订单获取兑换码
      this.orderGetExchangeCode(order);
    }
    if (CommodityConst.COMMODITY_EXCHANGE_LINK.equals(commodity.getCategoryId())) {
      //第三方链接类型商品，订单获取兑换链接
      this.orderGetExchangeLink(order, commodity.getExchangeThirdLink());
    }
  }

  /**
   * 检查商品
   *
   * @param commodity 商品信息
   * @param payment   支付方式
   * @param orderId   订单id
   * @return 检查结果
   */
  private Integer checkCommodtiy(JhsCommodity commodity, String payment, Integer orderId) {
    if (commodity == null) {
      LOGGER.error("订单支付--未找到对应商品，订单ID：{}，商品ID：{}", orderId, commodity.getId());
      return PayResultDto.CODE_PAY_FAILURE;
    }
    //检查商品是否支持该支付方式
    if (!StringUtils.contains(commodity.getPayMethod(), payment)) {
      LOGGER.info("订单支付--不支持的支付方式，订单ID：{}，商品ID：{}，使用的支付方式：{}", orderId, commodity.getId(), payment);
      return PayResultDto.CODE_PAY_FAILURE;
    }
    //检查商品库存
    if (!this.checkStock(commodity)) {
      return PayResultDto.CODE_SHORTAGE;
    }
    //通过
    return -1;
  }

  /**
   * 检查商品库存
   * 暂时只检查了兑换码类型的商品库存
   *
   * @param commodity 商品信息
   * @return true:有库存，false:无库存
   */
  private boolean checkStock(JhsCommodity commodity) {
    boolean result = true;
    if (CommodityConst.COMMODITY_EXCHANGE_CODE.equals(commodity.getCategoryId())) {
      //校验兑换码库存
      Long num = this.iCommodityManager.countExchangeCodeNum(commodity.getId());
      if (num <= 0) {
        result = false;
      }
    }
    return result;
  }

  /**
   * 检查订单
   *
   * @param order 订单信息
   * @return 支付结果编号
   */
  private Integer checkOrder(JhsTradeOrder order) {
    if (order == null) {
      return PayResultDto.CODE_NOT_FOUND;
    }
    //订单已付款
    Integer status = order.getStatus();
    if (OrderConst.STATUS_PAID.equals(status)) {
      return PayResultDto.CODE_PAID;
    }
    //订单已处理
    if (status > OrderConst.STATUS_PAID || OrderConst.STATUS_EXPIRE.equals(status)) {
      return PayResultDto.CODE_DEALT;
    }
    return -1;
  }

  /**
   * 将JhsTradeOrder对象转为OrderDto对象
   *
   * @param order JhsTradeOrder对象
   * @return OrderDto对象
   */
  private OrderDto orderToOrderDto(JhsTradeOrder order) {
    //查询商品主图
    String image = this.jhsCommodityService.getCommodityImage(order.getCommodityId());
    //转为OrderDto对象
    return toOrderDto(order, image);
  }

  /**
   * 转为OrderDto
   *
   * @param order JhsTradeOrder
   * @param image 商品主图
   * @return OrderDto
   */
  private OrderDto toOrderDto(JhsTradeOrder order, String image) {
    OrderDto orderDto = new OrderDto();
    orderDto.setId(order.getId());
    orderDto.setOrderNo(order.getOrderNo());
    orderDto.setCommodityId(order.getCommodityId());
    orderDto.setCommodityName(order.getCommodityName());
    orderDto.setPrice(order.getPrice());
    orderDto.setCount(order.getCount());
    orderDto.setTotal(order.getTotal());
    orderDto.setOfrom(order.getOfrom());
    orderDto.setStatus(order.getStatus());
    orderDto.setWorkerId(order.getWorkerId());
    orderDto.setReceiptDate(order.getReceiptDate());
    orderDto.setPayMethod(order.getPayMethod());
    orderDto.setPaymentDate(order.getPaymentDate());
    orderDto.setStopTradeDate(order.getStopTradeDate());
    orderDto.setExchangeMethod(order.getExchangeMethod());
    orderDto.setExchangeLink(order.getExchangeLink());
    orderDto.setExchangeCode(order.getExchangeCode());
    orderDto.setImage(image);
    return orderDto;
  }

  /**
   * 将OrderDto转为OrderDetailDto
   *
   * @param order         订单信息
   * @param commodityText 商品描述信息
   * @return OrderDetailDto
   */
  private OrderDetailDto toOrderDetailDto(JhsTradeOrder order, JhsCommodityText commodityText) {
    OrderDetailDto orderDetailDto = new OrderDetailDto();
    //查询商品主图
    String image = this.jhsCommodityService.getCommodityImage(order.getCommodityId());
    orderDetailDto.setId(order.getId());
    orderDetailDto.setOrderNo(order.getOrderNo());
    orderDetailDto.setCommodityId(order.getCommodityId());
    orderDetailDto.setCommodityName(order.getCommodityName());
    orderDetailDto.setPrice(order.getPrice());
    orderDetailDto.setCount(order.getCount());
    orderDetailDto.setTotal(order.getTotal());
    orderDetailDto.setOfrom(order.getOfrom());
    orderDetailDto.setStatus(order.getStatus());
    orderDetailDto.setWorkerId(order.getWorkerId());
    orderDetailDto.setReceiptDate(order.getReceiptDate());
    orderDetailDto.setPayMethod(order.getPayMethod());
    orderDetailDto.setPaymentDate(order.getPaymentDate());
    orderDetailDto.setStopTradeDate(order.getStopTradeDate());
    orderDetailDto.setExchangeMethod(order.getExchangeMethod());
    orderDetailDto.setExchangeLink(order.getExchangeLink());
    orderDetailDto.setExchangeCode(order.getExchangeCode());
    orderDetailDto.setImage(image);
    if (commodityText != null) {
      orderDetailDto.setDescribe(commodityText.getContent());
      orderDetailDto.setManual(commodityText.getManual());
    }
    return orderDetailDto;
  }
}
