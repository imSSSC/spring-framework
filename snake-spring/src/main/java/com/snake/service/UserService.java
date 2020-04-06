package com.snake.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author snake
 * @date 2020/4/6 21:44.
 */
@Component
public class UserService {
	public UserService() {
		System.out.println("---default");
	}

	public UserService(A a) {
		System.out.println(a);
		System.out.println("---a---");
	}

	public UserService(B b) {
		System.out.println(b);
		System.out.println("---b---");
	}

	public UserService(A a, B b) {
		System.out.println(a + " " + b);
		System.out.println("---ab---");
	}
}
