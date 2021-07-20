package com.SpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component 
public class Oleservice {

	//<property name="util" ref=""/> 
	@Autowired 
	private util utl;
	private String email="rupadh.com";
	
	public void run() {
		System.out.println(" #)#email @#( ="+email);
		int result=utl.genNum();
		System.out.println(result);
	}
}
