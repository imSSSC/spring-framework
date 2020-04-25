package com.snake.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

public class SpringMailEvent extends ApplicationContextEvent {
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * Create a new ContextStartedEvent.
	 *
	 * @param source the {@code ApplicationContext} that the event is raised for
	 *               (must not be {@code null})
	 */
	public SpringMailEvent(ApplicationContext source) {
		super(source);
		System.out.println("我 SpringMailEvent, 产生发邮件事件, 大家监听到,请打印邮件内容!!!");
	}
}
