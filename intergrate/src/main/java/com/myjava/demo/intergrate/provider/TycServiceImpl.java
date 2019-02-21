package com.myjava.demo.intergrate.provider;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.jjshome.kp.api.service.institution.IInstitutionService;
import com.myjava.demo.intergrate.tyc.service.ITycService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

/**
 * 天眼查服务实现
 *
 * @author lhw
 * @date 2019/2/21
 */
@Service(version = "1.0")
public class TycServiceImpl implements ITycService {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @Reference(timeout = 50000)
  private IInstitutionService iInstitutionService;

  @PostConstruct
  public void init() {
    Integer integer = this.iInstitutionService.qryAgencyCount();
    System.out.println(integer);
  }

  public void sayHello() {
    System.out.println("hello");
  }
}
