package com.snake.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Service2 implements InitializingBean, DisposableBean {

	@PostConstruct
	public void init() {
		System.out.println("------@PostConstruct2-----");
	}

	public void initXml() {
		System.out.println("------initXml2-----");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("------InitializingBean2----");
	}


	//--------------容器关闭后做一些事情

	@PreDestroy
	public void preDestroy() {
		System.out.println("-----preDestroy2-----");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("------DisposableBean2---");
	}

	public void destroyXml() {
		System.out.println("-----destroyXml2-----");
	}

}
