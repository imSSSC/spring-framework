package com.snake.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * @author snake
 * @date 2020/5/24 15:56
 */
@Component
public class Order {
//	public Order() {
//		System.out.println("default");
//	}
//
//	public Order(Dao1 dao1) {
//		System.out.println("dao1");
//	}
//

		public Order(Dao1 dao1, Dao2 dao2) {
		System.out.println("dao1 dao2");
	}

	@Autowired(required = false)
	public Order(Dao1 dao1, Dao2 dao2, Dao3 dao3) {
		System.out.println("dao1 dao2 dao3");
	}
	@Autowired(required = false)
	public Order() {
		System.out.println("dao1 dao2 dao3");
	}
}
