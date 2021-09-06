package com.ss.ssinterface.service;

import com.ss.ssinterface.pojo.UserAddress;

import java.util.List;

/**
 * 用户服务
 *
 * @author fangsheng
 * @date 2021/8/29 4:33 下午
 */
public interface UserService {
  /**
   * 按照用户id返回所有的收货地址
   *
   * @param userId
   * @return
   */
  List<UserAddress> getUserAddressList(String userId);
}
