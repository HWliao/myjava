package com.leyoujia.coa.zc.mall.manager.mall.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jjshome.sp.entity.SystemParam;
import com.jjshome.sp.service.provider.ISystemParamService;
import com.leyoujia.coa.zc.mall.manager.mall.ISystemParamManager;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

/**
 * @author l
 * @since 2019/7/31
 */
@Component
public class SystemParamManager implements ISystemParamManager {
  /**
   * 系统名
   */
  public static final String SYS_NAME = "oa";
  @Reference
  private ISystemParamService systemParamService;

  @Override
  public SystemParam getParam(String paramName) {
    if (StringUtils.isBlank(paramName)) {
      return null;
    }
    return systemParamService.getSysParam(paramName, SYS_NAME);
  }

  @Override
  public String getParamValue(String paramName) {
    SystemParam param = this.getParam(paramName);
    return param == null ? null : param.getValue();
  }
}
