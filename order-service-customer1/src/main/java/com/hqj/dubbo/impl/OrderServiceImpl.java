package com.hqj.dubbo.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hqj.dubbo.entity.User;
import com.hqj.dubbo.services.OrderService;
import com.hqj.dubbo.services.UserService;

/**
 * 实现接口工程里的OrderService接口，消费方
 * @author hqj
 *
 */
@Service
public class OrderServiceImpl implements OrderService {
	//version：使用的版本号 
	//stub：本地存根，可在本地存根进行数据校验，再去远程调用，减少提供方的压力
	@Reference(version = "1.0.0", stub = "com.hqj.dubbo.impl.UserServiceStub")
	UserService userService;
	
	@Override
	public List<User> initOrder(String userId) {
		
		List<User> userList = userService.getUserListById(userId);
		System.out.println("调用完成....");
		return userList;
		
	}

}
