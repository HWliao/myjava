package com.leyoujia.coa.zc.mall.config;

import com.jjshome.oasys.utils.RstUtil;
import com.leyoujia.coa.common.exception.LogoutException;
import com.leyoujia.coa.common.http.HttpUtil;
import com.leyoujia.coa.zc.client.exception.BusinessException;
import com.leyoujia.coa.zc.client.exception.ComException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理
 *
 * @author lhw
 * @date 2019/7/20
 */
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
  private Logger logger = LoggerFactory.getLogger(this.getClass());

  @ExceptionHandler({IllegalArgumentException.class, ComException.class})
  @ResponseBody
  public RstUtil handler(HttpServletRequest request, HttpServletResponse response, Exception e) throws Exception {
    this.logger.error("GlobalExceptionHandler:", e);

    boolean logout = e instanceof LogoutException;
    boolean business = e instanceof BusinessException;
    boolean com = e instanceof ComException;
    boolean illegalArgument = e instanceof IllegalArgumentException;

    if (HttpUtil.isAjaxRequest(request)) {
      if (illegalArgument) {
        return RstUtil.getRstUtil(false, RstUtil.PARAM_ERROR, "参数错误!");
      } else if (logout || business || com) {
        return RstUtil.getRstUtil(false, RstUtil.SERVICE_ERROR, e.getMessage());
      } else {
        return RstUtil.getRstUtil(false, RstUtil.SERVICE_ERROR, "服务异常!");
      }
    }
    // 抛出异常交给spring boot basic error controller处理
    throw e;
  }

}
