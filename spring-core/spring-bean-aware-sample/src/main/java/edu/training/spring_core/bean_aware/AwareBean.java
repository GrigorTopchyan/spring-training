package edu.training.spring_core.bean_aware;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext method of Aware bean is called");
	    System.out.println("setApplicationContext:: Bean Definition Names=" 
		       + Arrays.toString(applicationContext.getBeanDefinitionNames()));
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("setBeanFactory method caled of aware bean");
		System.out.println("setBeanFactory: aware bean singleton = " +  beanFactory.isSingleton("awareBean"));
	}

	@Override
	public void setBeanName(String name) {
		 System.out.println("setBeanName method of Aware bean is called");
	     System.out.println("setBeanName:: Bean Name defined in context=" + name);
	}
}
