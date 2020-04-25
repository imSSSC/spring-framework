package com.snake.spring;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SpringMailListener implements ApplicationListener<SpringMailEvent> {

	@Override
	public void onApplicationEvent(SpringMailEvent event) {
		System.out.println("我 SpringMailListener 监听到了, 输出内容: "+event.getContent());
	}
}
