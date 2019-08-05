package com.leyoujia.coa.zc.mall.controller;

import com.jjshome.erp.entity.extras.Operator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author lhw
 * @date 2019/8/3
 */
@RestController
public class TestController {

  private static Logger LOG = LoggerFactory.getLogger(TestController.class);

  @RequestMapping("/hello")
  public String hello() {
    LOG.info("hello world!");
    return "hello world!";
  }

  @RequestMapping("/getSession")
  public Object getSession(HttpSession session) {
    Object operator = session.getAttribute("operator");
    LOG.info("getsession:{}", operator);
    return operator;
  }

  @RequestMapping("/getOperator")
  public Object getOperator(Operator operator) {
    return operator;
  }
}
