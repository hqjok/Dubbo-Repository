package com.hqj.dubbo.services;

import java.util.List;

import com.hqj.dubbo.entity.User;

/**
 * 初始化用户接口，provider方
 * @author hqj
 *
 */
public interface UserService {
	public List<User> getUserListById(String userId);
}
