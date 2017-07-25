package edu.training.spring_core.bean_post_processor.test;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		String [] beanNames = context.getBeanDefinitionNames();
		Stream.of(beanNames)
			  .forEach(System.out::println);
	}
}
