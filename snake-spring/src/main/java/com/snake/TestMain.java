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
//		context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
		// 初始化
		context.refresh();
//		SnakeService snakeService = context.getBean(SnakeService.class);
//		snakeService.printStr();
		SnakeDao snakeDao = context.getBean(SnakeDao.class);
		SnakeDao snakeDao1 = context.getBean(SnakeDao.class);
		System.out.println(snakeDao.hashCode() + "------" + snakeDao1.hashCode());
		snakeDao.query();
	}
}
