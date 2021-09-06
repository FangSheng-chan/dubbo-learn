package com.ss.orderserviceconsumer.service.impl;

import com.ss.ssinterface.pojo.UserAddress;
import com.ss.ssinterface.service.OrderService;
import com.ss.ssinterface.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fangsheng
 * @date 2021/8/29 4:38 下午
 */
@Service
public class OrderServiceImpl implements OrderService {

  @Resource
  public UserService userService;

  @Override
  public void initOrder(String userID) {
    // 查询用户的收货地址
    List<UserAddress> userAddressList = userService.getUserAddressList(userID);
    System.out.println(userAddressList);
  }
}
