package com.snake;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @auther: snake
 * @date: 2020/3/18 00:00
 */
@Configuration
@ComponentScan("com.snake.service")
@ImportResource("classpath:spring.xml")// 用于读取xml
public class AppConfig {
}
