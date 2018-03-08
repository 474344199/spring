package com.shsxt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shsxt.demo.HelloService1;

public class Test {
	
	public static void main(String[] args) {
		
		// ���غ������ļ���
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-context.xml");
		
		HelloService1 hs =  (HelloService1)act.getBean("helloService");
		
		hs.print();
		
	}

}
