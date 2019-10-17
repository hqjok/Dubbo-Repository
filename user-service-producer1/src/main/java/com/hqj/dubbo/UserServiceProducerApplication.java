package com.hqj.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@EnableDubbo(scanBasePackages = "com.hqj.dubbo")
@SpringBootApplication
public class UserServiceProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceProducerApplication.class, args);
	}

}
