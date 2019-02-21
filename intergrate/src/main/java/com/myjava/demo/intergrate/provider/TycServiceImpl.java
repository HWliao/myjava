package com.myjava.demo.intergrate.provider;

import com.myjava.demo.intergrate.tyc.service.ITycService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 天眼查服务实现
 *
 * @author lhw
 * @date 2019/2/21
 */
@Service
public class TycServiceImpl implements ITycService {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  public void sayHello() {
    System.out.println("hello");
  }
}
