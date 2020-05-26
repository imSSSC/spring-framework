package com.snake;

import com.snake.service.A;
import com.snake.service.B;
import com.snake.service.SnakeRegistrar;
import org.springframework.context.annotation.*;

/**
 * @auther: snake
 * @date: 2020/3/18 00:00
 */
@Configuration
@ComponentScan("com.snake.service")
@ImportResource("classpath:spring.xml")// 用于读取xml
//@Import(SnakeRegistrar.class)
public class AppConfig {

//	@Bean
//	public A getA(){
//		System.out.println("--a--");
//		getB();
//		return new A();
//	}
//
//	@Bean
//	public B getB(){
//		System.out.println("---b---");
//		return new B();
//	}
}
