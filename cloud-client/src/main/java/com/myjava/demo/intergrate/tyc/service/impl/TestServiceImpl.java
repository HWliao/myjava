package com.myjava.demo.intergrate.tyc.service.impl;

import com.alibaba.fastjson.JSON;
import com.myjava.demo.intergrate.configuration.properties.TianyanchaProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author lhw
 * @date 2019/2/19
 */
@Service
public class TestServiceImpl {

  @Autowired
  private TianyanchaProperties tianyanchaProperties;

  @PostConstruct
  public void init() {
    System.out.println(JSON.toJSONString(this.tianyanchaProperties));
  }
}
