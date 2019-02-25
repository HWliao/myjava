package com.myjava.demo.intergrate.tyc.provider;

import com.jjshome.kp.api.service.institution.IInstitutionService;
import com.myjava.demo.intergrate.tyc.service.ITycService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

/**
 * 天眼查服务实现
 *
 * @author lhw
 * @date 2019/2/21
 */
public class TycServiceImpl implements ITycService {
  private Logger logger = LoggerFactory.getLogger(this.getClass());
  private IInstitutionService iInstitutionService;

  @PostConstruct
  public void init() {
    System.out.println(this.iInstitutionService.qryAgencyCount());
  }

  public String sayHello(String name) {
    return "Hello " + StringUtils.defaultString(name, "lhw");
  }
}
