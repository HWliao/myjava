package com.leyoujia.coa.zc.mall.provider.mall;

import com.alibaba.dubbo.config.annotation.Service;
import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDto;
import com.leyoujia.coa.zc.client.mall.service.ICommodityProviderService;
import com.leyoujia.coa.zc.mall.service.IJhsCommodityService;
import com.leyoujia.coa.zc.mall.util.UserAccountUtil;
import org.springframework.beans.factory.annotation.Autowired;

import static com.leyoujia.coa.zc.client.mall.constant.MallUserTypeConst.LEYOUJIA_MALL;

/**
 * 商品服务实现
 *
 * @author lhw
 * @date 2019/7/25
 */
@Service(interfaceClass = ICommodityProviderService.class, timeout = 5000)
public class CommodityProviderServiceImpl implements ICommodityProviderService {
  @Autowired
  private IJhsCommodityService jhsCommodityService;

  @Override
  public PageInfo<CommodityDto> searchVisibleVirtualCommodities(String workerId, PageInfo page) {
    return this.jhsCommodityService.searchVisibleVirtualCommodities(UserAccountUtil.getUserId(LEYOUJIA_MALL, workerId), page);
  }

  @Override
  public PageInfo<CommodityDto> searchCommoditiesForApp(String workerId, PageInfo page) {
    return this.jhsCommodityService.searchCommoditiesForApp(workerId, page);
  }

  @Override
  public CommodityDetailDto getCommodityDetail(Integer commodityId) {
    return this.jhsCommodityService.getCommodityDetail(commodityId);
  }
}
