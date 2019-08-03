package com.leyoujia.coa.zc.mall;

import org.apache.logging.log4j.core.lookup.MainMapLookup;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.management.RuntimeMXBean;

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
