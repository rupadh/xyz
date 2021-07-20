package com.SpringAnnotation;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service 
public class util {
public  int genNum() {
	return new Random().nextInt(2356);
	
}
}
