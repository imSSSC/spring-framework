package com.snake;

import com.snake.service.CustomScanner;
import com.snake.service.SnakeComponent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @auther: snake
 * @date: 2020/3/17 23:08
 */
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.register(AppConfig.class);

		context.refresh();


//		context.scan("com.snake.service");
//		CustomScanner classPathBeanDefinitionScanner = new CustomScanner(context);
//		classPathBeanDefinitionScanner.addIncludeFilter(new AnnotationTypeFilter(SnakeComponent.class));
//		classPathBeanDefinitionScanner.scan("com.snake.service");

//		context.addBeanFactoryPostProcessor(new MyBeanDefinitionPostProcessor());
//		context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
		// 初始化

//		System.out.println(context.getBeanFactory().getBeanDefinitionCount());
//		System.out.println(context.getBean(SnakeDao.class));
	}
}
