package com.myjava.demo.intergrate.tyc;

import com.myjava.demo.intergrate.tyc.model.Company;
import com.myjava.demo.intergrate.tyc.service.ITycService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * tyc 控制器测试
 *
 * @author lhw
 * @date 2019/2/26
 */
@RunWith(SpringRunner.class)
@WebMvcTest
public class TycControllerTests {
  @Autowired
  private MockMvc mockMvc;
  @MockBean
  private ITycService iTycService;

  @Test
  public void getCompanyByCode() throws Exception {
    String code = "91110000802100433Blhw";
    given(this.iTycService.getCompanyByCode(code)).willReturn(new Company());
    this.mockMvc.perform(get("/demo/intergrate/tyc/company/{1}", code).accept(MediaType.APPLICATION_JSON_UTF8))
      .andExpect(status().isOk())
      .andExpect(content().json("{}"));
  }

}
