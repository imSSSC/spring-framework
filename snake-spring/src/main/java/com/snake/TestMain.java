package com.snake;

import com.snake.dao.ChildBean;
import com.snake.dao.Dao1;
import com.snake.dao.RootBean;
import com.snake.service.ABConfig;
import com.snake.service.B;
import com.snake.service.CustomScanner;
import com.snake.service.SnakeComponent;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * @auther: snake
 * @date: 2020/3/17 23:08
 */
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//		context.addBeanFactoryPostProcessor(new MyBeanDefinitionPostProcessor());
//		context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
//		context.register(Dao1.class);
		context.register(AppConfig.class);
		context.refresh();

//		context.register(MyBeanDefinitionPostProcessor.class);
//		RootBeanDefinition rootBeanDefinition  = new RootBeanDefinition();
//		rootBeanDefinition.setBeanClass(RootBean.class);
//		rootBeanDefinition.getPropertyValues().addPropertyValue("type","movie");
//		rootBeanDefinition.getPropertyValues().addPropertyValue("name","image");
//		context.registerBeanDefinition("root",rootBeanDefinition);
//
//		GenericBeanDefinition childBeanDefinition  = new GenericBeanDefinition();
//		childBeanDefinition.setBeanClass(ChildBean.class);
//		childBeanDefinition.getPropertyValues().addPropertyValue("name","NNNNNN");
//		childBeanDefinition.setParentName("root");
//		context.registerBeanDefinition("child",childBeanDefinition);

//		for (String beanDefinitionName : context.getBeanDefinitionNames()) {
//			System.out.println(beanDefinitionName);
//		}
//		System.out.println(context.getBeanDefinition("getB"));


//		context.scan("com.snake.service");
//		CustomScanner classPathBeanDefinitionScanner = new CustomScanner(context);
//		classPathBeanDefinitionScanner.addIncludeFilter(new AnnotationTypeFilter(SnakeComponent.class));
//		classPathBeanDefinitionScanner.scan("com.snake.service");

//		context.addBeanFactoryPostProcessor(new MyBeanDefinitionPostProcessor());
//		context.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());
		// 初始化

//		System.out.println(context.getBeanFactory().getBeanDefinitionCount());
//		System.out.println(context.getBean(SnakeDao.class));
	}
}
