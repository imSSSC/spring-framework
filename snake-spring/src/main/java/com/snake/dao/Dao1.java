package com.snake.dao;

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
		return new B();
	}
}
