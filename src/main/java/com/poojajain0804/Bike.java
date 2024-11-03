package com.poojajain0804;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehical {
	
	@Autowired
	DiscountOffer discountOffer;

	@Override
	public String getMileage() {
		return "15kmpl";
	}

	@Override
	public String getDiscountOffer() {
		return discountOffer.getDiscountOffers();
	}

}
