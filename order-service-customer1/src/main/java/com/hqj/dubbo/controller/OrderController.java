package com.hqj.dubbo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hqj.dubbo.entity.User;
import com.hqj.dubbo.services.OrderService;

/**
 * 路由映射
 * @author hqj
 *
 */
@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@ResponseBody
	@RequestMapping(value = "/initOrder")
	public List<User> initOrder(@RequestParam("uid")String userId) {
		return orderService.initOrder(userId);
	}
}
