package com.myjava.demo.intergrate.tyc;

import com.myjava.demo.intergrate.configuration.properties.TianyanchaProperties;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 天眼查配置
 *
 * @author lhw
 * @date 2019/2/20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TycPropertiesTests {
  @Autowired
  private TianyanchaProperties tianyanchaProperties;

  @Test
  public void I736Test() {
    Assertions.assertThat(this.tianyanchaProperties).isNotNull();
    Assertions.assertThat(this.tianyanchaProperties.getI736())
      .isNotNull()
      .hasFieldOrPropertyWithValue("id", "736")
      .hasFieldOrProperty("name")
      .hasFieldOrProperty("descr")
      .hasFieldOrPropertyWithValue("url", "http://open.api.tianyancha.com/services/v4/open/getCompanyByCode")
      .hasFieldOrPropertyWithValue("token", "97740505-087e-4494-a001-85a4e10a5685")
      .hasFieldOrPropertyWithValue("method", "GET");
  }

}
