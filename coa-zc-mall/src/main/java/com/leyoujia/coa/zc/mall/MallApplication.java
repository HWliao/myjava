package com.leyoujia.coa.zc.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lhw
 * @date 2019/7/19
 */
@SpringBootApplication(scanBasePackages = "com.leyoujia.coa.zc")
public class MallApplication {
  public static void main(String[] args) {
    SpringApplication.run(MallApplication.class, args);
  }
}
