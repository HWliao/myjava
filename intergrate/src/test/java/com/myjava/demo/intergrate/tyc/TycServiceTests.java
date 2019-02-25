package com.myjava.demo.intergrate.tyc;

import com.myjava.demo.intergrate.tyc.model.Company;
import com.myjava.demo.intergrate.tyc.service.ITycService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 天眼查服务测试
 *
 * @author lhw
 * @date 2019/2/25
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TycServiceTests {

  @Autowired
  private ITycService iTycService;

  @Test
  public void getCompanyByCodeTest() {
    String code = "91110000802100433B";
    Company company = this.iTycService.getCompanyByCode("91110000802100433B");
    Assertions.assertThat(company)
      .isNotNull()
      .hasFieldOrPropertyWithValue("creditCode", code);
  }

}
