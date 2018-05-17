package org.zt.elasticsearch.example.service;

import java.util.List;
import org.zt.elasticsearch.example.dto.SpanDocDto;
import org.zt.elasticsearch.example.dto.TraceRequest;

/**
 * Es 查询服务
 *
 * @auther Ternence
 * @date 2018-05-16
 */
public interface ESQueryService {


  /**
   * @param traceId
   * @return
   */
  SpanDocDto getTraceInfo(String traceId);



  /**
   * @param request
   * @return
   */
  List<SpanDocDto> getTraceInfoList(TraceRequest request);

}
