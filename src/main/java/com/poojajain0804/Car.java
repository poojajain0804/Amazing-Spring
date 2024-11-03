package com.poojajain0804;

public class Car implements Vehical {
	
	/**
	 * Setter Dependency
	 */
	private DiscountOffer discountOffer;
	
	public void setDiscountOffer(DiscountOffer discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	@Override
	public String getMileage() {
		return "Car Mileage is - 30 KMPL";
	}

	@Override
	public String getDiscountOffer() {
		return "coming with the help of setter dependency: "+discountOffer.getDiscountOffers();
	}
}
