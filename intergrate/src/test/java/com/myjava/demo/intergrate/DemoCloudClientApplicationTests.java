package com.myjava.demo.intergrate;

import com.alibaba.dubbo.config.annotation.Reference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jjshome.kp.api.service.institution.IInstitutionService;
import org.junit.Test;
import org.junit.runner.RunWith;
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
  @Reference
  private IInstitutionService iInstitutionService;

  @Test
  public void Test1() throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    System.out.println(objectMapper.writeValueAsString(this.iInstitutionService.qryAgencyCount()));
  }
}
