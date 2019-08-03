package com.leyoujia.coa.zc.mall.dao.erp;

import org.apache.ibatis.annotations.Param;

/**
 * @author lhw
 * @date 2019/8/1
 */
public interface IErpWorkerDAO {

  /**
   * 根据员工编号查询公司代码
   * @param workerId 员工编号
   * @return 公司代码
   */
  String findComCodeByWorkerId(@Param("workerId") String workerId);
}
