package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringAnnotation.Oleservice;

public class mainola {
public static void main(String[] args) {
	
	ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("ola-service.xml");
	Oleservice ols =(Oleservice)applicationContext.getBean("oleservice");
	ols.run();
}
}
