package com.snake.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author snake
 * @date 2020/4/22 00:23
 */
@Controller
@RequestMapping("index2")
public class IndexController2 {
	@ResponseBody
	@RequestMapping("index2")
	public String index2(){
		System.out.println("--------index2-----");
		return "index2";
	}

	@ResponseBody
	@RequestMapping("index22")
	public String index22(){
		System.out.println("--------index22-----");
		return "index22";
	}
}
