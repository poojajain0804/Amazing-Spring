package com.poojajain0804.lifecycle.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleXMLTesting {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("com/poojajain0804/lifecycle/xml/lifeCycleBeanConfig.xml");
		Object bean = classPathXmlApplicationContext.getBean("custBean");
		
		System.out.println(bean);
		classPathXmlApplicationContext.registerShutdownHook();
	}

}
