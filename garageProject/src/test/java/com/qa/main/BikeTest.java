package com.qa.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BikeTest {
	@Test 
	public void bikeTest() {			
		Bike bike1 = new Bike("gonzales", "blue", 40, true);
		int result = bike1.fixVehicle();
		Assertions.assertTrue(result == 152);
	}
}