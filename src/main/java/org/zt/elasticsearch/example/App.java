package org.zt.elasticsearch.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zt.elasticsearch.example.dto.SpanDocDto;
import org.zt.elasticsearch.example.service.ESQueryService;

/**
 * Hello world!
 *
 */
public class App {

  @SuppressWarnings("resource")
  public static void main(String[] args) throws InterruptedException {
    ClassPathXmlApplicationContext applicationContext =
        new ClassPathXmlApplicationContext("/META-INF/spring/app.xml");
    applicationContext.start();
    ESQueryService queryService = applicationContext.getBean(ESQueryService.class);
    SpanDocDto traceInfo = queryService.getTraceInfo("5afcfb50e4b08bd718e1c9e3");
    System.out.println(traceInfo);
  }
}
