package com.leyoujia.coa.zc.mall.controller;

import com.jjshome.erp.entity.extras.Operator;
import com.jjshome.oasys.utils.RstUtil;
import com.leyoujia.coa.zc.mall.dao.erp.auto.IJhsCommodityAutoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author lhw
 * @date 2019/7/19
 */
@RestController
public class TestController {

  @Autowired
  private IJhsCommodityAutoDAO iJhsCommodityAutoDAO;

  @RequestMapping("/hello")
  public String hello() {
    return "hello world!";
  }

  @RequestMapping("/count")
  public long count() {
    return this.iJhsCommodityAutoDAO.countByExample().build().execute();
  }

  @RequestMapping("/setSession")
  public void setSession(HttpSession session, Operator operator) {
    operator.setCompanyName("lhwtest");
    session.setAttribute("operator", operator);
    session.setAttribute("lhwtest", "test11111");
  }

  @RequestMapping("/getSession")
  public Object getSession(HttpSession session, Operator operator) {
    System.out.println(session.getAttribute("lhwtest"));
    return RstUtil.getRstUtil(true, operator);
  }
}
