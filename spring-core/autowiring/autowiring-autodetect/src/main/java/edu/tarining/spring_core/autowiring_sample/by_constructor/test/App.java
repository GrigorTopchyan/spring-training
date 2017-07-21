package edu.tarining.spring_core.autowiring_sample.by_constructor.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.tarining.spring_core.autowiring_sample.by_constructor.Panda;

public class App {
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		Panda panda = (Panda)context.getBean("panda");
		System.out.println(panda.toString());
	}
}
