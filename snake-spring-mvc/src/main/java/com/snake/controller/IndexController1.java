package com.snake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author snake
 * @date 2020/4/22 00:23
 */
@Controller
@RequestMapping("index1")
public class IndexController1 {
	@ResponseBody
	@RequestMapping("index1")
	public String index1(){
		System.out.println("--------index1-----");
		return "index1";
	}

	@ResponseBody
	@RequestMapping("index11")
	public String index11(){
		System.out.println("--------index11-----");
		return "index11";
	}
}
