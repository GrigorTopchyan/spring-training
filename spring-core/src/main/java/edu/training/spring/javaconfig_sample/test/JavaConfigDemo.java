package edu.training.spring.javaconfig_sample.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.training.spring.javaconfig_sample.bean.MyColor;
import edu.training.spring.javaconfig_sample.config.AppConfig;

public class JavaConfigDemo {
	public static void main(String [] args){
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		MyColor color = (MyColor)context.getBean("colorBean");
		color.printColor();
	}
}
