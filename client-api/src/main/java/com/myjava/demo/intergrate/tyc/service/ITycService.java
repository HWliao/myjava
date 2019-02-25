package com.myjava.demo.intergrate.tyc.service;

import com.myjava.demo.intergrate.tyc.model.Company;

/**
 * 天眼查对外服务
 *
 * @author lhw
 * @date 2019/2/21
 */
public interface ITycService {
  /**
   * 根据信用代码组织机构代码/组织机构代码/注册号获取公司信息
   *
   * @param code 公司统一信用代码
   * @return 公司信息
   */
  public Company getCompanyByCode(String code);
}
