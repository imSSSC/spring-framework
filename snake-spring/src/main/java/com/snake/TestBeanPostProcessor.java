package com.snake;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @auther: snake
 * @date: 2020/3/18 00:03
 */
//@Component
public class TestBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("snakeDao"))
			System.out.println(" BeforeInitialization0");

		// 这里可以成为代理对象返回出去
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("snakeDao"))
			System.out.println(" AfterInitialization0");
		return bean;
	}

	// 按照顺序执行 beanPostProcessor 越小先执行
	@Override
	public int getOrder() {
		return 102;
	}
}
