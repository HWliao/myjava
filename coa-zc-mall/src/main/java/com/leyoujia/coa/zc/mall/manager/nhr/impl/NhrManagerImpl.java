package com.leyoujia.coa.zc.mall.manager.nhr.impl;

import api.leyoujia.platform.hr.IMdsEmpInfoService;
import api.leyoujia.platform.hr.output.EmpModel;
import com.alibaba.dubbo.config.annotation.Reference;
import com.leyoujia.coa.zc.mall.manager.nhr.INhrManager;
import com.leyoujia.platform.common.model.DubboResultModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import static com.leyoujia.coa.common.precondition.BusinessPreconditins.checkBusiness;

/**
 * @author lhw
 * @date 2019/7/26
 */
@Service
public class NhrManagerImpl implements INhrManager {

  @Reference(interfaceClass = IMdsEmpInfoService.class, check = false)
  private IMdsEmpInfoService iMdsEmpInfoService;

  @Override
  public EmpModel getEmpByEmpNo(@Nullable String empNo) {
    if (StringUtils.isEmpty(empNo)) {
      return null;
    }
    DubboResultModel<EmpModel> empRs = this.iMdsEmpInfoService.getByEmpNo(empNo);
    return this.getResult(empRs);
  }

  @Override
  public EmpModel getByEmpNumber(@Nullable String empNumber) {
    if (StringUtils.isEmpty(empNumber)) {
      return null;
    }
    DubboResultModel<EmpModel> empRs = this.iMdsEmpInfoService.getByEmpNumber(empNumber);
    return this.getResult(empRs);
  }

  private <R> R getResult(@Nonnull DubboResultModel<R> rs) {
    if (!rs.isSuccess()) {
      checkBusiness(rs.isSuccess(), "MdsEmpInfoError:" + rs.toJson(), true);
    }
    return rs.getData();
  }
}
