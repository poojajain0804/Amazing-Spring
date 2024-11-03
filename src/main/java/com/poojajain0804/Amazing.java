package com.poojajain0804;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Amazing {

	public static void main(String[] args) {
		System.out.println("Hi, this is an amazing world");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Vehical vehicalBean = context.getBean("carBean", Vehical.class);
		System.out.println(vehicalBean.getMileage());
		
	}

}
