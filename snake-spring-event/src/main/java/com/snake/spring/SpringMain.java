package com.snake.spring;

import com.snake.spring.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext configApplicationContext=
				new AnnotationConfigApplicationContext(AppConfig.class);
		configApplicationContext.start();
		MailBean mailBean = configApplicationContext.getBean(MailBean.class);
		mailBean.sendMail();
	}
}
