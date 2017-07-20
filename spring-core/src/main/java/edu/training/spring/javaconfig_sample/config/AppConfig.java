package edu.training.spring.javaconfig_sample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import edu.training.spring.javaconfig_sample.bean.MyColor;
import edu.training.spring.javaconfig_sample.bean.RedColor;

@Configuration
public class AppConfig {
	
	@Bean(name="colorBean")
	public MyColor getColor(){
		return new RedColor();
	}
}
