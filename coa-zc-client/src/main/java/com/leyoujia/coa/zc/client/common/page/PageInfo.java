package com.leyoujia.coa.zc.client.common.page;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 分页信息 来自 PageHelper.PageInfo
 *
 * @author lhw
 * @date 2019/7/29
 */
public class PageInfo<T> implements Serializable {
  private static final long serialVersionUID = -3506202740611307967L;
  /**
   * 当前页
   */
  private int pageNum;
  /**
   * 每页的数量
   */
  private int pageSize;
  /**
   * 当前页的数量
   */
  private int size;

  /**
   * 由于startRow和endRow不常用，这里说个具体的用法
   * 可以在页面中"显示startRow到endRow 共size条数据"
   * 当前页面第一个元素在数据库中的行号
   */
  private int startRow;
  /**
   * 当前页面最后一个元素在数据库中的行号
   */
  private int endRow;
  /**
   * 总记录数
   */
  private long total;
  /**
   * 总页数
   */
  private int pages;
  /**
   * 结果集
   */
  private List<T> list;

  /**
   * 第一页
   */
  private int firstPage;
  /**
   * 前一页
   */
  private int prePage;
  /**
   * 下一页
   */
  private int nextPage;
  /**
   * 最后一页
   */
  private int lastPage;

  /**
   * 导航页码数
   */
  private int navigatePages;
  /**
   * 所有导航页号
   */
  private int[] navigatepageNums;

  public int getPageNum() {
    return pageNum >= 1 ? pageNum : 1;
  }

  public void setPageNum(int pageNum) {
    this.pageNum = pageNum;
    this.pageNum = this.getPageNum();
    this.startRow = this.pageNum > 0 ? (this.pageNum - 1) * this.pageSize : 0;
  }

  public int getPageSize() {
    return pageSize >= 0 ? pageSize : 0;
  }

  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
    this.pageSize = this.getPageSize();
    this.startRow = this.pageNum > 0 ? (this.pageNum - 1) * this.pageSize : 0;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getStartRow() {
    return startRow;
  }

  public void setStartRow(int startRow) {
    this.startRow = startRow;
  }

  public int getEndRow() {
    return endRow;
  }

  public void setEndRow(int endRow) {
    this.endRow = endRow;
  }

  public long getTotal() {
    return total;
  }

  public void setTotal(long total) {
    this.total = total;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }

  public int getFirstPage() {
    return firstPage;
  }

  public void setFirstPage(int firstPage) {
    this.firstPage = firstPage;
  }

  public int getPrePage() {
    return prePage;
  }

  public void setPrePage(int prePage) {
    this.prePage = prePage;
  }

  public int getNextPage() {
    return nextPage;
  }

  public void setNextPage(int nextPage) {
    this.nextPage = nextPage;
  }

  public int getLastPage() {
    return lastPage;
  }

  public void setLastPage(int lastPage) {
    this.lastPage = lastPage;
  }

  public int getNavigatePages() {
    return navigatePages;
  }

  public void setNavigatePages(int navigatePages) {
    this.navigatePages = navigatePages;
  }

  public int[] getNavigatepageNums() {
    return navigatepageNums;
  }

  public void setNavigatepageNums(int[] navigatepageNums) {
    this.navigatepageNums = navigatepageNums;
  }

  public PageInfo() {
  }

  /**
   * 包装Page对象
   *
   * @param list page结果
   */
  public PageInfo(List<T> list, int pageNum, int pageSize, int total) {
    list = list != null && list.size() > 0 ? list : new ArrayList<>();
    this.pageNum = pageNum;
    this.pageNum = this.getPageNum();
    this.pageSize = pageSize;
    this.pageSize = this.getPageSize();

    this.total = total;
    if (pageSize > 0) {
      this.pages = (int) (total / pageSize + ((total % pageSize == 0) ? 0 : 1));
    } else {
      this.pages = 0;
    }

    this.list = list;
    this.size = list.size();

    //由于结果是>startRow的，所以实际的需要+1
    this.calculateStartAndEndRow();
    //计算导航页
    calcNavigatepageNums();
    //计算前后页，第一页，最后一页
    calcPage();
  }

  /**
   * 计算前后页，第一页，最后一页
   */
  private void calcPage() {
    if (navigatepageNums != null && navigatepageNums.length > 0) {
      firstPage = navigatepageNums[0];
      lastPage = navigatepageNums[navigatepageNums.length - 1];
      if (pageNum > 1) {
        prePage = pageNum - 1;
      }
      if (pageNum < pages) {
        nextPage = pageNum + 1;
      }
    }
  }

  /**
   * 计算导航页
   */
  private void calcNavigatepageNums() {
    //当总页数小于或等于导航页码数时
    if (pages <= navigatePages) {
      navigatepageNums = new int[pages];
      for (int i = 0; i < pages; i++) {
        navigatepageNums[i] = i + 1;
      }
    } else { //当总页数大于导航页码数时
      navigatepageNums = new int[navigatePages];
      int startNum = pageNum - navigatePages / 2;
      int endNum = pageNum + navigatePages / 2;

      if (startNum < 1) {
        startNum = 1;
        //(最前navigatePages页
        for (int i = 0; i < navigatePages; i++) {
          navigatepageNums[i] = startNum++;
        }
      } else if (endNum > pages) {
        endNum = pages;
        //最后navigatePages页
        for (int i = navigatePages - 1; i >= 0; i--) {
          navigatepageNums[i] = endNum--;
        }
      } else {
        //所有中间页
        for (int i = 0; i < navigatePages; i++) {
          navigatepageNums[i] = startNum++;
        }
      }
    }
  }

  /**
   * 计算起止行号
   */
  private void calculateStartAndEndRow() {
    this.startRow = this.pageNum > 0 ? (this.pageNum - 1) * this.pageSize : 0;
    this.endRow = this.startRow + this.pageSize * (this.pageNum > 0 ? 1 : 0);
  }


  /**
   * 需要计算分页
   *
   * @param list     集合
   * @param pageNum  页码
   * @param pageSize 数量
   * @param total    总数
   * @param <R>      结果类型
   * @return page
   */
  public static <R> PageInfo<R> get(List<R> list, int pageNum, int pageSize, int total) {
    return new PageInfo<>(list, pageNum, pageSize, total);
  }

  /**
   * 不需要计算分页
   *
   * @param rs    集合
   * @param total 总数
   * @param <R>   结果类型
   * @return page
   */
  public static <R> PageInfo<R> get(List<R> rs, int total) {
    PageInfo<R> pageInfo = new PageInfo<>();
    pageInfo.setList(rs);
    pageInfo.setTotal(total);
    return pageInfo;
  }

  @Override
  public String toString() {
    return "PageInfo{" +
      "pageNum=" + pageNum +
      ", pageSize=" + pageSize +
      ", size=" + size +
      ", startRow=" + startRow +
      ", endRow=" + endRow +
      ", total=" + total +
      ", pages=" + pages +
      ", list=" + list +
      ", firstPage=" + firstPage +
      ", prePage=" + prePage +
      ", nextPage=" + nextPage +
      ", lastPage=" + lastPage +
      ", navigatePages=" + navigatePages +
      ", navigatepageNums=" + Arrays.toString(navigatepageNums) +
      '}';
  }
}
