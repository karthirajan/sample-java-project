package com.cts.cl;

import com.dif.*;

public class VehicleDetails extends FuelDetails{
	
	public void bikeName() {
		System.out.println("BIKES");
	}
	public void carName() {
		System.out.println("CARS");
	}
	
	public static void main(String[] args) {
		VehicleDetails v = new VehicleDetails();
		v.petrol();
		v.diesel();
	}

}
