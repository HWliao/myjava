package com.myjava.demo.intergrate;

import com.jjshome.kp.api.service.institution.IInstitutionService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * spring boot application tests
 *
 * @author lhw
 * @date 2019/2/19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoCloudClientApplicationTests {
  @Autowired
  private IInstitutionService iInstitutionService;

  @Test
  public void Test(){
    Assertions.assertThat(this.iInstitutionService).isNotNull();
    this.iInstitutionService.qryAgencyCount();
  }
}
