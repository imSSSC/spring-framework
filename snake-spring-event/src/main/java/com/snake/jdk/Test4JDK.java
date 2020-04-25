package com.snake.jdk;

public class Test4JDK {
	public static void main(String[] args) {
		Movie4JDK movie4JDK = new Movie4JDK();
		movie4JDK.addObserver(new Master4JDK());
		movie4JDK.addObserver(new Snake4JDK());
		movie4JDK.move();
	}
}
