import com.alibaba.dubbo.config.annotation.Reference;
import com.leyoujia.coa.zc.client.common.page.PageInfo;
import com.leyoujia.coa.zc.client.mall.domain.CommodityDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.OrderDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.OrderDto;
import com.leyoujia.coa.zc.client.mall.domain.PayResultDto;
import com.leyoujia.coa.zc.client.mall.service.ICommodityProviderService;
import com.leyoujia.coa.zc.client.mall.service.ITradeOrderProviderService;
import com.leyoujia.coa.zc.mall.MallApplication;
import com.leyoujia.coa.zc.mall.dao.erp.IJhsTradeOrderDAO;
import com.leyoujia.coa.zc.mall.dao.erp.auto.IJhsCommodityAutoDAO;
import com.leyoujia.coa.zc.mall.dao.erp.entity.JhsCommodity;
import com.leyoujia.coa.zc.mall.service.IJhsCommodityService;
import com.leyoujia.coa.zc.mall.service.IJhsTradeOrderService;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author l
 * @since 2019/7/26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MallApplication.class)
public class InterfaceTest {
  @Autowired
  private ICommodityProviderService commodityProviderService;
  @Autowired
  private IJhsCommodityService jhsCommodityService;
  @Autowired
  private IJhsTradeOrderService jhsTradeOrderService;
  @Autowired
  private IJhsCommodityAutoDAO jhsCommodityAutoDAO;
  @Autowired
  private IJhsTradeOrderDAO jhsTradeOrderDAO;
  @Reference
  private ITradeOrderProviderService tradeOrderProviderService;

  @Test
  public void commoditySearchTest() {
    List<JhsCommodity> execute = jhsCommodityAutoDAO.selectByExample().limit(10).offset(5).build().execute();
    System.out.println(execute.size());
  }

  @Test
  public void commodityDetailTest() {
    CommodityDetailDto detail = jhsCommodityService.getCommodityDetail(1355);
    System.out.println(detail);
  }

  @Test
  public void orderSearchTest() {
    PageInfo<OrderDto> pageInfo = new PageInfo<>();
    pageInfo.setPageSize(5);
    pageInfo.setStartRow(0);
    PageInfo<OrderDto> orderDtoPageInfo = jhsTradeOrderService.listByWorkerAndChannel("25224", 3, pageInfo);
    System.out.println(orderDtoPageInfo);
  }

  @Test
  public void testOrderDetail() {
    OrderDetailDto detail = this.jhsTradeOrderService.getOrderDetailById(21360);
    System.out.println(detail);
    OrderDetailDto detail1 = this.jhsTradeOrderService.getOrderDetailById(21377);
    System.out.println(detail1);
    OrderDetailDto detail2 = this.jhsTradeOrderService.getOrderDetailById(null);
    System.out.println(detail2);
  }

  @Test
  public void orderPayTest() {
    PayResultDto resultDto;
    resultDto = this.jhsTradeOrderService.payOrder(21430, "4");
    assert StringUtils.isNotBlank(resultDto.getOrder().getExchangeLink());
    System.out.println(resultDto);
    resultDto = this.jhsTradeOrderService.payOrder(21404, "4");
    System.out.println(resultDto);
    resultDto = this.jhsTradeOrderService.payOrder(21364, "5");
    System.out.println(resultDto);
    resultDto = this.jhsTradeOrderService.payOrder(21364, null);
    System.out.println(resultDto);
    resultDto = this.jhsTradeOrderService.payOrder(null, null);
    System.out.println(resultDto);
  }
}
