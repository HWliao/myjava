package com.myjava.demo.intergrate.tyc.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.myjava.demo.intergrate.tyc.model.Company;
import com.myjava.demo.intergrate.tyc.service.ITycService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 天眼查服务实现
 *
 * @author lhw
 * @date 2019/2/21
 */
@Service
@Component
public class TycServiceImpl implements ITycService {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  public Company getCompanyByCode(String code) {
    return null;
  }
}
