package org.zt.elasticsearch.example.dao;

import java.util.List;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import org.zt.elasticsearch.example.entry.SpanDoc;

/**
 * SpanDoc持久层
 * 
 * @author Ternence
 * @date 2018-05-16
 */
@Repository
public interface SpanDocDao extends ElasticsearchRepository<SpanDoc, String> {
  
  List<SpanDoc> findByTraceId(String traceId);
  
}  