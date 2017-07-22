package edu.training.spring_core_factory_method_di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.training.spring_core_factory_method_di.bean.ATM;

public class App {
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		ATM atm = (ATM)context.getBean("atm");
		atm.printBalanceInformation("N257");
	}
}
