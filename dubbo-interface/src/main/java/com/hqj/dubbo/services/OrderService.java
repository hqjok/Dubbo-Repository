package com.hqj.dubbo.services;

import java.util.List;

import com.hqj.dubbo.entity.User;

/**
 * 初始化订单接口，consumer方
 * @author hqj
 *
 */
public interface OrderService {
	public List<User> initOrder(String userId);
}
