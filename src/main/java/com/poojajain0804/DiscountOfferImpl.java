package com.poojajain0804;

import org.springframework.stereotype.Component;

@Component
public class DiscountOfferImpl implements DiscountOffer {

	@Override
	public String getDiscountOffers() {
		
		return "For New Festive Discount check with Customer care team";
	}

}
