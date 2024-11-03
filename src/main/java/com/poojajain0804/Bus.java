package com.poojajain0804;

public class Bus implements Vehical {

	public DiscountOffer discountOffer;

	/**
	 * Constructor Dependency. 
	 * @param discountOffer
	 */
	public Bus(DiscountOffer discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	@Override
	public String getMileage() {
		return "Bus Mileage is - 20KMPL";
	}

	@Override
	public String getDiscountOffer() {
		return "Coming with Constructor Dependency: "+discountOffer.getDiscountOffers();
	}
}
