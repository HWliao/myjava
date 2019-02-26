package com.myjava.demo.intergrate.tyc.controller;

import com.myjava.demo.intergrate.tyc.model.Company;
import com.myjava.demo.intergrate.tyc.service.ITycService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 天眼查ctrl
 *
 * @author lhw
 * @date 2019/2/26
 */
@RestController
public class TycContoller {

  @Autowired
  private ITycService iTycService;

  @RequestMapping("/demo/intergrate/tyc/company/{code}")
  public Company getCompanyByCode(@PathVariable String code) {
    return this.iTycService.getCompanyByCode(code);
  }
}
