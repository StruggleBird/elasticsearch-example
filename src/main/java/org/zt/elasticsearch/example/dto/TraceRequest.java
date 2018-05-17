package org.zt.elasticsearch.example.dto;

import org.springframework.validation.annotation.Validated;

/**
 * 链路查询请求对象
 *
 * @auther Ternence
 * @date 2018-05-16
 */
@Validated
public class TraceRequest {

  private String appName;
  private String serviceId;
  private String method;
  private String startDate;
  private String endDate;
  private Integer limit;
  private boolean useProxy;

  private int page = 1;

  private int size = 20;

  private String sort;

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Boolean getUseProxy() {
    return useProxy;
  }

  public void setUseProxy(Boolean useProxy) {
    this.useProxy = useProxy;
  }

}
