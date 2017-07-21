package edu.training.spring.loading_external_resource_sample.test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.training.spring.loading_external_resource_sample.CustomResourceLoader;

public class App {
	public static void main(String [] args) throws IOException{
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		CustomResourceLoader resourceLoader = context.getBean(CustomResourceLoader.class);
		resourceLoader.showResourceData();
	}
}
