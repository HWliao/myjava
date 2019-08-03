package com.leyoujia.coa.zc.mall.manager;

import com.leyoujia.coa.zc.mall.MallApplication;
import com.leyoujia.coa.zc.mall.domain.mall.CommodityDomain;
import com.leyoujia.coa.zc.mall.manager.mall.ICommodityManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lhw
 * @date 2019/7/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MallApplication.class})
public class CommodityManagerTest {
  @Autowired
  private ICommodityManager iCommodityManager;


  @Test
  public void testGetCommodityDomain() {
    CommodityDomain domain = this.iCommodityManager.getCommodityDomain(1204);
    System.out.println(domain);
  }
}
