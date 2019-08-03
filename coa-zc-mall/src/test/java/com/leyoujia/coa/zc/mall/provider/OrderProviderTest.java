package com.leyoujia.coa.zc.mall.provider;

import com.leyoujia.coa.zc.client.mall.domain.OrderCommand;
import com.leyoujia.coa.zc.client.mall.domain.OrderDetailDto;
import com.leyoujia.coa.zc.client.mall.domain.OrderDictDto;
import com.leyoujia.coa.zc.client.mall.domain.OrderMedicalExaminerDto;
import com.leyoujia.coa.zc.client.mall.service.ITradeOrderProviderService;
import com.leyoujia.coa.zc.mall.MallApplication;
import org.assertj.core.util.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static com.leyoujia.coa.zc.client.mall.constant.MallUserTypeConst.APP_MALL;
import static com.leyoujia.coa.zc.client.mall.constant.MallUserTypeConst.LEYOUJIA_MALL;
import static com.leyoujia.coa.zc.client.mall.constant.OrderConst.TAKE_POST;
import static com.leyoujia.coa.zc.client.mall.constant.OrderConst.TAKE_SELF;

/**
 * @author lhw
 * @date 2019/8/1
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MallApplication.class})
public class OrderProviderTest {
  @Autowired
  private ITradeOrderProviderService iTradeOrderProviderService;

  /**
   * 创建兑换码订单
   */
  @Test
  public void testCreateOrderExchangeCode() {
    OrderCommand command = new OrderCommand();
    command.setUserId("15221061471");
    command.setUserName("lhwtest");
    command.setCommodityId(1354);
    command.setCount(1L);
    command.setTakeType(TAKE_SELF);
    OrderDetailDto order = this.iTradeOrderProviderService.createOrder(command, LEYOUJIA_MALL);
    System.out.println(order);
  }

  /**
   * 创建兑换链接
   */
  @Test
  public void testCreateOrderExchangeLink() {
    OrderCommand command = new OrderCommand();
    command.setUserId("15221061471");
    command.setUserName("lhwtest");
    command.setCommodityId(1356);
    command.setCount(1L);
    command.setTakeType(TAKE_SELF);
    OrderDetailDto order = this.iTradeOrderProviderService.createOrder(command, LEYOUJIA_MALL);
    System.out.println(order);
  }

  @Test
  public void testCreateOrderMedical() {
    OrderCommand command = new OrderCommand();
    command.setUserId("02013911");
    command.setCommodityId(1319);
    command.setDictText("B超");
    command.setCount(1L);
    command.setTakeType(TAKE_SELF);

    OrderMedicalExaminerDto medicalExaminer = new OrderMedicalExaminerDto();
    medicalExaminer.setExaminerName("廖红卫");
    medicalExaminer.setIdCard("12343466457");
    medicalExaminer.setPhoneNumber("15221061471");
    medicalExaminer.setProvinceCode("123");
    medicalExaminer.setProvince("广东省");
    medicalExaminer.setCityCode("1424");
    medicalExaminer.setCityName("深圳市");
    command.setMedicalExaminer(medicalExaminer);
    OrderDetailDto order = this.iTradeOrderProviderService.createOrder(command, APP_MALL);
    System.out.println(order);
  }

  /**
   * 非套装服装
   */
  @Test
  public void testCreateClothNotSuit() {
    OrderCommand command = new OrderCommand();
    command.setUserId("02013911");
    command.setCommodityId(1204);
    command.setCount(2L);
    command.setTakeType(TAKE_POST);
    command.setTakeWorker("廖红卫");
    command.setTakePhone("15221061471");
    command.setTakeProvince("广东省");
    command.setTakeCity("深圳市");
    command.setTakeArea("福田区");
    command.setTakeAdrr("safasfsafas");
    OrderDetailDto order = this.iTradeOrderProviderService.createOrder(command, APP_MALL);
    System.out.println(order);
  }


  /**
   * 套装
   */
  @Test
  public void testCreateClothSuit() {
    OrderCommand command = new OrderCommand();
    command.setUserId("02013911");
    command.setCommodityId(1204);
    command.setCount(1L);
    command.setTakeType(TAKE_POST);
    command.setTakeWorker("廖红卫");
    command.setTakePhone("15221061471");
    command.setTakeProvince("广东省");
    command.setTakeCity("深圳市");
    command.setTakeArea("福田区");
    command.setTakeAdrr("safasfsafas");

    List<OrderDictDto> standards = Lists.newArrayList();

    OrderDictDto standard1 = new OrderDictDto();
    standard1.setId(1201);
    standard1.setName("lhwtest西服");
    standard1.setDictText("29");
    standard1.setGf(false);
    standards.add(standard1);

    OrderDictDto standard2 = new OrderDictDto();
    standard2.setId(1202);
    standard2.setName("lhwtest西裤");
    standard2.setDictText("32");
    standard2.setGf(false);
    standards.add(standard2);

    OrderDictDto standard3 = new OrderDictDto();
    standard3.setId(1201);
    standard3.setName("lhwtest西服");
    standard3.setDictText("30");
    standard3.setGf(true);
    standards.add(standard3);

    OrderDictDto standard4 = new OrderDictDto();
    standard4.setId(1202);
    standard4.setName("lhwtest西裤");
    standard4.setDictText("33");
    standard4.setGf(false);
    standards.add(standard4);

    command.setStandard(standards);

    OrderDetailDto order = this.iTradeOrderProviderService.createOrder(command, APP_MALL);
    System.out.println(order);
  }

}
