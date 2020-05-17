package com.snake;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: snake
 * @date: 2020/3/17 23:08
 */
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfig.class);
		context.register(SnakeDao.class);
		// 初始化
		context.refresh();
		System.out.println(context.getBean(SnakeDao.class));
		context.close();
	}
}
