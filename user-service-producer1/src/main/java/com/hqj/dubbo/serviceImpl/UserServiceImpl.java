package com.hqj.dubbo.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.hqj.dubbo.entity.User;
import com.hqj.dubbo.services.UserService;

//暴露服务，使用的是dubbo的service***
//version指定该实现类是1.0.0版本，以便consumer方做版本选择
@Service(version = "1.0.0")
@Component
public class UserServiceImpl implements UserService {

	public List<User> getUserListById(String userId) {
		System.out.println("调用版本1......");
		ArrayList<User> userList = new ArrayList<User>();
		if(Integer.parseInt(userId)== 1) {
			userList.add(new User(1,"黄庆佳","男","7411@wsasda.com"));
			userList.add(new User(1,"孙小杰","男","7411@wsasda.com"));
		}else {
			userList.add(new User(2,"孙天气","男","7411@wsasda.com"));
		}
		return userList;
	}

}
