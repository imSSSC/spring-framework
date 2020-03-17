package com.snake;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther: snake
 * @date: 2020/3/17 23:08
 */
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		SnakeService snakeService = context.getBean(SnakeService.class);
//		snakeService.printStr();
		SnakeDao snakeDao = context.getBean(SnakeDao.class);
		snakeDao.query();
	}
}
