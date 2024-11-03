package com.poojajain0804;

public class Bus implements Vehical {

	private DiscountOffer discountOffer;
	private int busNumberOfWheels;

	/**
	 * Constructor Dependency. 
	 * @param discountOffer
	 */
	public Bus(DiscountOffer discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	@Override
	public String getMileage() {
		return "Bus Mileage is - 20KMPL on "+ busNumberOfWheels +" wheels.";
	}

	public int getBusNumberOfWheels() {
		return busNumberOfWheels;
	}

	public void setBusNumberOfWheels(int busNumberOfWheels) {
		this.busNumberOfWheels = busNumberOfWheels;
	}

	@Override
	public String getDiscountOffer() {
		return "Coming with Constructor Dependency: "+discountOffer.getDiscountOffers();
	}
}
