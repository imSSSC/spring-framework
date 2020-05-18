package com.snake;

import com.snake.service.CustomScanner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

/**
 * @auther: snake
 * @date: 2020/3/17 23:08
 */
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);



		context.register(AppConfig.class);
		context.register(SnakeDao.class);
		context.addBeanFactoryPostProcessor(new MyBeanDefinitionPostProcessor());
		context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
		// 初始化
		context.refresh();
//		System.out.println(context.getBean(SnakeDao.class));
//		CustomScanner classPathBeanDefinitionScanner = new CustomScanner(context);
//		classPathBeanDefinitionScanner.addIncludeFilter((metadataReader, metadataReaderFactory) -> true);
//		System.out.println(classPathBeanDefinitionScanner.scan("com.snake.service"));

		context.close();
	}
}
