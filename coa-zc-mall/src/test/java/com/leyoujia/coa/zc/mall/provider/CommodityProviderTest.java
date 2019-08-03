package com.leyoujia.coa.zc.mall.provider;

import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDto;
import com.leyoujia.coa.zc.client.mall.service.ICommodityProviderService;
import com.leyoujia.coa.zc.mall.MallApplication;
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
public class CommodityProviderTest {

  @Autowired
  private ICommodityProviderService iCommodityProviderService;

  @Test
  public void testSearchCommodities() {
    PageInfo page = new PageInfo();
    page.setPageNum(1);
    page.setPageSize(2);
    PageInfo<CommodityDto> commodityDtoPageInfo = this.iCommodityProviderService.searchVisibleVirtualCommodities("02013911", page);
    System.out.println(commodityDtoPageInfo);
  }

  @Test
  public void testSearchCommoditiesForApp() {
    PageInfo page = new PageInfo();
    page.setPageNum(1);
    page.setPageSize(2);
    PageInfo<CommodityDto> commodityDtoPageInfo = this.iCommodityProviderService.searchCommoditiesForApp("02013911", page);
    System.out.println(commodityDtoPageInfo);
  }

  @Test
  public void testgetCommodityDetail() {
    CommodityDetailDto detail = this.iCommodityProviderService.getCommodityDetail(1204);
    System.out.println(detail);
  }

}
