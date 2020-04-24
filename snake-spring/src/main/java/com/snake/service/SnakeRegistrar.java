package com.snake.service;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class SnakeRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition) registry.getBeanDefinition("userService");
		genericBeanDefinition.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_NAME);
		registry.registerBeanDefinition("userService",genericBeanDefinition);

	}
}
