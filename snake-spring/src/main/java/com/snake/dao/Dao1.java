package com.snake.dao;

import com.snake.service.A;
import com.snake.service.B;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//@Component
@Configuration
public class Dao1 {
	@Bean
	public B getB(){
		System.out.println("B init");
//		getA();
		return new B();
	}

	@Bean
	public A getA(){
		System.out.println("A init");
		getB();
		return new A();
	}
}
