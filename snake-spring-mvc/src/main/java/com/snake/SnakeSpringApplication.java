package com.snake;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

/**
 * @author snake
 * @date 2020/4/21 23:55
 */
public class SnakeSpringApplication {
	public static void run() {

		// spring 环境
		AnnotationConfigWebApplicationContext context =
				new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		context.refresh();

		// 中央控制器,注入spring容器
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

		// tomcat环境
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(9090);
		/**
		 * webApp标识这是一个web项目
		 * 参数一: tomcat的访问路径
		 * 参数二: 项目的web的目录
		 */
//		tomcat.addWebapp("",new File("/src/main/resources").getAbsolutePath())
		// 设置tomcat的路径
		File base = new File(System.getProperty("java.io.tmpdir"));
		Context tomcatContext = tomcat.addContext("/", base.getAbsolutePath());

		// 初始化controller和请求映射
		Tomcat.addServlet(tomcatContext,"snake",dispatcherServlet).setLoadOnStartup(1);

		// spring web环境 需要执行的servletName
		tomcatContext.addServletMapping("/","snake");
		try {
			tomcat.start();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}
		tomcat.getServer().await();
	}
}
