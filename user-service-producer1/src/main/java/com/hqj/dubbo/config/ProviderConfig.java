package com.hqj.dubbo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.hqj.dubbo.serviceImpl.UserServiceImpl;
import com.hqj.dubbo.services.UserService;

/**
 * 1.provider方的配置类
 * 2.配置各个版本的实现类，应用设置，注册中心设置，通信设置以及monitor监控中心设置
 * 3.也可通过其他方法进行配置
 * (1)、SpringBoot配置文件application.yml/properties + @EnableDubbo注解
 * (2)、xml文件(dubbo.properties) + @ImportResource(location="")注解
 * (3)、javaBean的配置方式，也就是本配置类
 * @author hqj
 *
 */
@Configuration
public class ProviderConfig {
	
	/**
	 * 配置提供者服务版本1.0.0
	 * @param userServiceImpl
	 * @return
	 */
	@Bean 
	public ServiceConfig<UserService> serviceConfigVersion1(UserServiceImpl userServiceImpl){
		ServiceConfig<UserService> serviceConfig = new ServiceConfig<UserService>();
		serviceConfig.setInterface(UserService.class);
		serviceConfig.setRef(userServiceImpl);
		serviceConfig.setVersion("1.0.0");
		return serviceConfig;
	}
	
	
	/**
	 * 配置提供者服务版本2.0.0
	 * @param userServiceImpl
	 * @return
	 */
	@Bean 
	public ServiceConfig<UserService> serviceConfigVersion2(UserServiceImpl userServiceImpl1){
		ServiceConfig<UserService> serviceConfig = new ServiceConfig<UserService>();
		serviceConfig.setInterface(UserService.class);
		serviceConfig.setRef(userServiceImpl1);
		serviceConfig.setVersion("2.0.0");
		return serviceConfig;
	}
	
	
	
	/**
	 * 设置服务应用名
	 * @return 
	 */
	@Bean
	public ApplicationConfig applicationConfig() {
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName("user-service-provider");
		return applicationConfig;
	}
	
	/**
	 * 设置注册中心
	 * @return
	 */
	@Bean
	public RegistryConfig registryConfig() {
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setProtocol("zookeeper");
		registryConfig.setAddress("127.0.0.1:2181");
		return registryConfig;
	}
	
	/**
	 * 设置通信协议
	 * @return
	 */
	@Bean
	public ProtocolConfig protocolConfig() {
		ProtocolConfig protocolConfig = new ProtocolConfig();
		protocolConfig.setName("dubbo");
		protocolConfig.setPort(20881);
		return protocolConfig;
	}
	
	/**
	 * 设置monitor监控中心
	 * @return
	 */
	@Bean
	public MonitorConfig monitorConfig() {
		MonitorConfig monitorConfig = new MonitorConfig();
		monitorConfig.setProtocol("registry");
		return monitorConfig;
	}
	
	
}
