package com.snake.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author snake
 * @date 2020/4/6 21:44.
 */
@Component
public class UserService {
//	public UserService() {
//		System.out.println("---default");
//	}
//
//	public UserService(A a) {
//		System.out.println(a);
//		System.out.println("---a---");
//	}
//	@Autowired(required = false)
//	public UserService(B b) {
//		System.out.println(b);
//		System.out.println("---b---");
//	}
//
//	@Autowired(required = false)
//	public UserService(A a, B b) {
//		System.out.println(a + " " + b);
//		System.out.println("---ab---");
//	}
//
	@Autowired
	A a;

//	public void setA(A a) {
//		this.a = a;
//		System.out.println("-------");
//	}
//
//	@Autowired
//	public void setA(A a) {
//		this.a = a;
//		System.out.println(a);
//		System.out.println("-------");
//	}

//	@Autowired
//	I y;
//
//	@PostConstruct
//	public void ss(){
//		System.out.println(y);
//	}
}
