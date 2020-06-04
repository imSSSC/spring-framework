package com.snake.circular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author snake
 * @date 2020/6/4 22:03
 */
@Component("bb")
public class BB {
	@Autowired
	AA aa;
}
