package com.hqj.dubbo.impl;

import java.util.List;

import com.alibaba.dubbo.common.utils.StringUtils;
import com.hqj.dubbo.entity.User;
import com.hqj.dubbo.services.UserService;

/**
 * 本地存根实现类
 * @author hqj
 *
 */
public class UserServiceStub implements UserService{
	
	private final UserService userService;

	//使用构造器把远程服务进行连接
	public UserServiceStub(UserService userService) {
		super();
		this.userService = userService;
	}


	@Override
	public List<User> getUserListById(String userId) {
		//本地存根的意义在于可以在此处进行逻辑判断，判断正确再去远程连接服务应用，
		//若判断错误则直接返回null
		System.out.println("调用本地存根，判断userId后再调用远程服务");
		if(!StringUtils.isEmpty(userId)) {
			return userService.getUserListById(userId);
		}
		return null;
	}

}
