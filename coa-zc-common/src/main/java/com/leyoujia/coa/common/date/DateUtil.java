package com.leyoujia.coa.common.date;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * 日期时间工具类
 *
 * @author lhw
 * @date 2019/7/20
 */
public class DateUtil {
  /**
   * 将Date类型转为LocalDateTime
   *
   * @param date Date
   * @return LocalDateTime
   */
  public static LocalDateTime toLocalDateTime(Date date) {
    return toZonedDateTime(date).toLocalDateTime();
  }

  /**
   * 将Date类型转为LocalDate
   *
   * @param date Date
   * @return LocalDate
   */
  public static LocalDate toLocalDate(Date date) {
    return toZonedDateTime(date).toLocalDate();
  }

  /**
   * 将LocalDate类型转为Date
   *
   * @param localDate LocalDate
   * @return Date
   */
  public static Date toDate(LocalDate localDate) {
    return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
  }

  /**
   * 将Date类型转为LocalDateTime
   *
   * @param localDateTime LocalDateTime
   * @return Date
   */
  public static Date toDate(LocalDateTime localDateTime) {
    return Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
  }

  /**
   * 将Date转为ZonedDateTime
   *
   * @param date Date
   * @return ZonedDateTime
   */
  private static ZonedDateTime toZonedDateTime(Date date) {
    return date.toInstant().atZone(ZoneId.systemDefault());
  }

  public static Date parse(String txt, String fmt) {
    if (StringUtils.isEmpty(txt) || StringUtils.isEmpty(fmt)) {
      return null;
    }
    SimpleDateFormat sdf = new SimpleDateFormat(fmt);
    try {
      return sdf.parse(txt);
    } catch (ParseException e) {
      e.printStackTrace();
      return null;
    }
  }
}
