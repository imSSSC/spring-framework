package com.snake.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@DependsOn("service2")
public class Service1 implements InitializingBean {

	@PostConstruct
	public void init(){
		System.out.println("------@PostConstruct1-----");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("------InitializingBean1----");
	}
}
