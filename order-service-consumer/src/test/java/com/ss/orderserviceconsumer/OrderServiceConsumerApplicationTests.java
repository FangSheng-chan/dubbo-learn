package com.ss.orderserviceconsumer;

import com.ss.ssinterface.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootTest
class OrderServiceConsumerApplicationTests {

  @Test
  void contextLoads() {
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
    OrderService orderService = applicationContext.getBean(OrderService.class);
    //调用方法查询出数据
    orderService.initOrder("1");
    System.out.println("调用完成...");
    try {
      System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
