
package com.jungle.read;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component("hello")
public class Application {
	public static void main(String[] args) {
		System.out.println("hello");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		Object hello = context.getBean("hello");
		System.out.println(hello);
	}
}
