package com.snake.circular;

import com.snake.service.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author snake
 * @date 2020/6/4 22:03
 */
@Component("aa")
public class AA {
//	@Autowired
//	BB bb;
	public AA(BB bb){
		System.out.println(bb);
	}

	@Autowired
	public void dfasdf(CC cc){
		System.out.println(cc);
	}
}
