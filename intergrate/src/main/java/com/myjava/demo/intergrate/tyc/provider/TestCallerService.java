package com.myjava.demo.intergrate.tyc.provider;

import com.jjshome.kp.api.service.institution.IInstitutionService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author lhw
 * @date 2019/2/22
 */
@Service
public class TestCallerService {
  @Reference(group = "lhw")
  private IInstitutionService iInstitutionService;

  @PostConstruct
  public void init() {
    System.out.println(this.iInstitutionService.qryAgencyCount());
  }
}
