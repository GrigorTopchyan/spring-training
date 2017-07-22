package edu.training.spring_core_bean_life_cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		Person person = (Person)context.getBean("person");
		System.out.println(person.getName());
		((AbstractApplicationContext)context).registerShutdownHook();
	}
}
