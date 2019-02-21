package com.myjava.demo.intergrate.provider;

import com.myjava.demo.intergrate.tyc.service.ITycService;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 天眼查服务实现
 *
 * @author lhw
 * @date 2019/2/21
 */
@Service(version = "1.0")
public class TycServiceImpl implements ITycService {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  public void sayHello() {
    System.out.println("hello");
  }
}
