package com.poojajain0804.autowired.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XMLBasedAutowireTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext
		("com/poojajain0804/autowired/xml/xmlBasedAutowireConfig.xml");
		
		Employee bean = (Employee)classPathXmlApplicationContext.getBean("empBean");
		
		Address ad= (Address)classPathXmlApplicationContext.getBean("address");
		System.out.println(bean);
		System.out.println("addrees "+ ad);
	}
}
