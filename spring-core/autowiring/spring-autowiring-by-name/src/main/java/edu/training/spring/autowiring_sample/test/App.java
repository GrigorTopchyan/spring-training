package edu.training.spring.autowiring_sample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.training.spring.autowiring_sample.bean.Employee;

public class App {
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		Employee employee = (Employee)context.getBean("employee");
		System.out.println(employee);
	}
}
