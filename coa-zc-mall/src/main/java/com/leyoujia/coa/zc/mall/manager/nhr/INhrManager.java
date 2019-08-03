package com.leyoujia.coa.zc.mall.manager.nhr;

import api.leyoujia.platform.hr.output.EmpModel;

import javax.annotation.Nullable;

/**
 * @author lhw
 * @date 2019/7/26
 */
public interface INhrManager {
  /**
   * 根据工号查询员工信息
   *
   * @param empNo 工号
   * @return 员工信息
   */
  EmpModel getEmpByEmpNo(@Nullable String empNo);

  /**
   * 根据员工编号查询员工信息
   *
   * @param empNumber 员工编号
   * @return 员工信息
   */
  EmpModel getByEmpNumber(@Nullable String empNumber);
}
