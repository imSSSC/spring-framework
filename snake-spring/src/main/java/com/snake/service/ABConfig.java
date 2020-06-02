package com.snake.service;

import org.springframework.context.annotation.Bean;


public class ABConfig {
	@Bean
	public A getA() {
		System.out.println("--a--");
		getB();
		return new A();
	}

	@Bean
	public B getB() {
		System.out.println("---b---");
		return new B();
	}
}
