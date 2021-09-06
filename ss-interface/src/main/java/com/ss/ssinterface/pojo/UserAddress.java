package com.ss.ssinterface.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author fangsheng
 * @date 2021/8/29 4:32 下午
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress implements Serializable {
  private Integer id;
  private String userAddress; // 用户地址
  private String userId; // 用户id
  private String consignee; // 收货人
  private String phoneNum; // 电话号码
  private String isDefault; // 是否为默认地址    Y-是     N-否
  // get     set
  // 有参构造  无参构造
}
