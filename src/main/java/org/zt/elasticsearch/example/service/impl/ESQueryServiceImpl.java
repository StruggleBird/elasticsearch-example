package org.zt.elasticsearch.example.service.impl;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.zt.elasticsearch.example.dao.SpanDocDao;
import org.zt.elasticsearch.example.dto.SpanDocDto;
import org.zt.elasticsearch.example.dto.TraceRequest;
import org.zt.elasticsearch.example.entry.SpanDoc;
import org.zt.elasticsearch.example.service.ESQueryService;

/**
 * 
 *
 * @auther Ternence
 * @date 2018-05-16
 */
@Service
public class ESQueryServiceImpl implements ESQueryService {

  @Autowired
  private SpanDocDao spanDocDao;

  public SpanDocDto getTraceInfo(String traceId) {
    List<SpanDoc> list = spanDocDao.findByTraceId(traceId);
    if (CollectionUtils.isEmpty(list)) {
      return null;
    }
    SpanDoc spanDoc = list.get(0);
    SpanDocDto dto = new SpanDocDto();
    BeanUtils.copyProperties(spanDoc, dto);
    return dto;
  }

  public List<SpanDocDto> getTraceInfoList(TraceRequest request) {
    return null;
  }



}
