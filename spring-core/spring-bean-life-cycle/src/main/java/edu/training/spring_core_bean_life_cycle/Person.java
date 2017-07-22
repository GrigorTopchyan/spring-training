package edu.training.spring_core_bean_life_cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean,DisposableBean {

	private String name;
		
	public Person() {
		System.out.println("Constructor of Person bean is called!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public void destroy() throws Exception {
		 System.out.println("Destory method of person bean is called!!");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterProperties method of person bean is called!!");
	}
}
