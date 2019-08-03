package com.leyoujia.coa.zc.mall.app_api;

import api.leyoujia.platform.hr.output.EmpModel;
import com.jjshome.aicp.note.AicpParamDocNote;
import com.jjshome.aicp.note.AppInterfaceControlNote;
import com.jjshome.oasys.utils.RstUtil;
import com.leyoujia.coa.zc.mall.domain.mall.AppCommodityCommand;
import com.leyoujia.coa.zc.mall.manager.nhr.INhrManager;
import com.leyoujia.coa.zc.mall.service.IJhsCommodityService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.google.common.base.Preconditions.checkArgument;
import static com.leyoujia.coa.common.precondition.BusinessPreconditins.checkBusiness;

/**
 * @author lhw
 * @date 2019/7/23
 */
@Service
public class AppApiServiceImpl {

  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Autowired
  private INhrManager iNhrManager;
  @Autowired
  private IJhsCommodityService iJhsCommodityService;

  @AppInterfaceControlNote(
    methodCode = "10001",
    vers = "v1",
    name = "查询商品列表",
    parameterType = AppCommodityCommand.class,
    IN_PARAM_DESC_NOTE = {
      @AicpParamDocNote(name = "empNo", desc = "员工工号,不传递不判断是否购买过商品", dataType = "string", required = false)
    },
    OUT_PARAM_DESC_NOTE = {
      @AicpParamDocNote(name = "commodityId", desc = "商品id", dataType = "int"),
      @AicpParamDocNote(name = "title", desc = "商品名称", dataType = "string"),
      @AicpParamDocNote(name = "categoryId", desc = "类别id", dataType = "int"),
      @AicpParamDocNote(name = "categoryName", desc = "类别名", dataType = "string"),
      @AicpParamDocNote(name = "shortName", desc = "商品短名", dataType = "string"),
      @AicpParamDocNote(name = "photoUrl", desc = "图片链接", dataType = "string"),
      @AicpParamDocNote(name = "count", desc = "商品数量", dataType = "int"),
      @AicpParamDocNote(name = "price", desc = "单价", dataType = "double"),
      @AicpParamDocNote(name = "payMethod", desc = "支付方式 2 支付宝 3 储备金 4 乐豆 2,3,4 表示支持3种支付方式", dataType = "string", required = false),
      @AicpParamDocNote(name = "exchangeCondition", desc = "商品为兑换码/兑换链接 兑换条件 1 单次兑换 2 多次兑换", dataType = "int", required = false),
      @AicpParamDocNote(name = "orderId", desc = "订单ID 已购买的商品对应的订单id 针对单次兑换的商品", dataType = "int"),
      @AicpParamDocNote(name = "orderStatus", desc = "订单状态 -1已过期, 0等待付款, 1已取消, 2已付款, 3已发货, 4买家已收货, 5交易成功", dataType = "int")
    }
  )
  public RstUtil listCommodities(AppCommodityCommand command) {
    this.logger.info("{}", command);
    String workerId = null;
    if (StringUtils.isNotEmpty(command.getEmpNo())) {
      EmpModel emp = this.iNhrManager.getEmpByEmpNo(command.getEmpNo());
      checkBusiness(emp != null, "员工工号无效!");
      workerId = emp.getEmpNumber();
    }
    return RstUtil.getRstUtil(true, this.iJhsCommodityService.listCommoditiesForApp(workerId));
  }
}
