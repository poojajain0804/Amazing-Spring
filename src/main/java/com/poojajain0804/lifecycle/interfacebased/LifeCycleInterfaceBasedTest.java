package com.poojajain0804.lifecycle.interfacebased;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleInterfaceBasedTest {

	public static void main(String[] args) {

		 AbstractApplicationContext context = new 
				 ClassPathXmlApplicationContext("com/poojajain0804/lifecycle/interfacebased/beanLifeCycleInterfaceBasedConfig.xml");
		 
		 
		Object bean = context.getBean("studBean");
		
		System.out.println(bean);
		context.registerShutdownHook();
	}

}
