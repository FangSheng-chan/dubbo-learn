package com.ss.userserviceprovider;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootTest
class UserServiceProviderApplicationTests {

  @Test
  void contextLoads() {
    ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("provider.xml");
    applicationContext.start();
    try {
      System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
