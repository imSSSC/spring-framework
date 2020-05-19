package com.snake.service;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.TypeFilter;

/**
 * 自定义扫描规则
 */
public class CustomScanner extends ClassPathBeanDefinitionScanner {
	public CustomScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

//	@Override
//	public void addIncludeFilter(TypeFilter includeFilter) {
//		super.addIncludeFilter(includeFilter);
//	}
}
