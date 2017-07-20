package edu.training.spring_core.constructor_di.output.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.training.spring_core.constructor_di.output.OutputHelper;

public class App {
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		OutputHelper outputHelper = (OutputHelper)context.getBean("outputHelper");
		outputHelper.genertaeOutput();
	}
}
