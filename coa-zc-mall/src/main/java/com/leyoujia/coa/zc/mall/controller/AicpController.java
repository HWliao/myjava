package com.leyoujia.coa.zc.mall.controller;

import com.jjshome.aicp.entity.AppMainBean;
import com.jjshome.aicp.utils.AppInvokeListener;
import com.jjshome.aicp.web.ControllerBese;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * aicp controller
 *
 * @author lhw
 * @date 2019/7/23
 */
@Controller
public class AicpController extends ControllerBese {

  @RequestMapping("/aicp")
  @ResponseBody
  public Object aicpMain(AppMainBean bean) {
    return AppInvokeListener.invoke(bean);
  }
}
