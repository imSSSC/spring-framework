package com.snake.jdk;

import java.util.Observable;

public class Movie4JDK extends Observable {
	public void move() {
		System.out.println("-----start update ----");
		// 被观察者状态改变
		setChanged();
		// 通知观察者
		notifyObservers();
	}
}
