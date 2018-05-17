package org.zt.elasticsearch.example.dto;

/**
 * SpanDocDto
 * 
 * @author Ternence
 * @date 2018-05-16
 */
public class SpanDocDto {

  private String traceId;
  private String spanId;
  private String parentSpanId;
  private String siteName;
  private String appName;
  private String serviceName;
  private String methodName;
  private String key;
  private String value;
  private String type;
  private String ip;
  private Integer port;
  private Long timestamps;
  private String minutesTime;
  private Long duration;

  public String getMinutesTime() {
    return minutesTime;
  }

  public void setMinutesTime(String minutesTime) {
    this.minutesTime = minutesTime;
  }

  public SpanDocDto() {}

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }

  public Long getTimestamps() {
    return timestamps;
  }

  public void setTimestamps(Long timestamps) {
    this.timestamps = timestamps;
  }

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public Long getDuration() {
    return duration;
  }

  public void setDuration(Long duration) {
    this.duration = duration;
  }

  public String getSiteName() {
    return siteName;
  }

  public void setSiteName(String siteName) {
    this.siteName = siteName;
  }

  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getTraceId() {
    return traceId;
  }

  public void setTraceId(String traceId) {
    this.traceId = traceId;
  }

  public String getSpanId() {
    return spanId;
  }

  public void setSpanId(String spanId) {
    this.spanId = spanId;
  }

  public String getParentSpanId() {
    return parentSpanId;
  }

  public void setParentSpanId(String parentSpanId) {
    this.parentSpanId = parentSpanId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }
}
