package com.poojajain0804;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Amazing {

	public static void main(String[] args) {
		System.out.println("Hi, this is an amazing world");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		/*
		 * Vehical vehicalBean = context.getBean("busBean", Vehical.class);
		 * System.out.println(vehicalBean.getMileage());
		 * System.out.println(vehicalBean.getDiscountOffer());
		 * 
		 * vehicalBean = context.getBean("carBean", Vehical.class);
		 * System.out.println(vehicalBean.getMileage());
		 * System.out.println(vehicalBean.getDiscountOffer());
		 */
		
		
		System.out.println("Now lets play with annotation");
		
		Vehical vehicalBean = context.getBean("bike", Vehical.class);
		Vehical bike1 = context.getBean("bike", Vehical.class);
		System.out.println(vehicalBean.getMileage());
		System.out.println(vehicalBean.getDiscountOffer());
		System.out.println("are two bean same now ");
		System.out.println(bike1==vehicalBean);
	}

}
