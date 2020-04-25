package com.snake.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MailBean {
	@Autowired
	ApplicationContext applicationContext;

	public void sendMail() {
		System.out.println("我 ApplicationContext source, 准备发邮件, 请产生发邮件事件!!!!");
		SpringMailEvent springMailEvent = new SpringMailEvent(applicationContext);
		springMailEvent.setContent("邮件内容!!!!!");
		applicationContext.publishEvent(springMailEvent);
	}
}
