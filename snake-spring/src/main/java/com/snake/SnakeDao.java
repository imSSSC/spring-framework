package com.snake;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * @auther: snake
 * @date: 2020/3/17 23:08
 */
@Repository
public class SnakeDao implements ApplicationContextAware{

//	public SnakeDao(){
//		System.out.println("构造");
//	}

//	@PostConstruct
//	public void init(){
//		System.out.println("init");
//	}

	public void query(){
		System.out.println("query");
		SnakeService snakeService = applicationContext.getBean(SnakeService.class);
		snakeService.printStr();
	}


	private ApplicationContext applicationContext;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println(applicationContext);
	}
}
