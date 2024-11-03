package com.poojajain0804;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehical {
	
	@Autowired
	DiscountOffer discountOffer;
	
	@Value("${bike.numberOfWheels}")
	private int wheelCount;
		

	public int getWheelCount() {
		return wheelCount;
	}

	@Override
	public String getMileage() {
		return "15kmpl on " + wheelCount+" wheels.";
	}

	@Override
	public String getDiscountOffer() {
		return discountOffer.getDiscountOffers();
	}

}
