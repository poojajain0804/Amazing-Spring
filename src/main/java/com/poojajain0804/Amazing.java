package com.poojajain0804;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Amazing {

	public static void main(String[] args) {
		System.out.println("Hi, this is an amazing world");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		
		System.out.println("Now lets play with annotation");
		
		Vehical vehicalBean = context.getBean("bike", Vehical.class);
		System.out.println(vehicalBean.getMileage());
		System.out.println(vehicalBean.getDiscountOffer());
	}

}
