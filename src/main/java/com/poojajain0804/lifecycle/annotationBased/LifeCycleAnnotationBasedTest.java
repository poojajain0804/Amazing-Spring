package com.poojajain0804.lifecycle.annotationBased;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleAnnotationBasedTest {

	public static void main(String[] args) {

		 AbstractApplicationContext context = new 
				 ClassPathXmlApplicationContext("com/poojajain0804/lifecycle/annotationBased/beanLifeCycleAnnotationBasedConfig.xml");
		 
		 
		Object bean = context.getBean("orderBean");
		
		System.out.println(bean);
		context.registerShutdownHook();
	}

}
