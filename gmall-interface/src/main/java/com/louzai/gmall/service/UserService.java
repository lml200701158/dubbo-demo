package com.louzai.gmall.service;

import com.louzai.gmall.bean.UserAddress;

import java.util.List;

public interface UserService {
    //按照用户id返回所有的收货地址
    public List<UserAddress> getUserAddressList(String userId);
}
