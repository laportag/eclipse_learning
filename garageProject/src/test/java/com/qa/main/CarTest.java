package com.qa.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CarTest {
	@Test 
	public void carTest() {			
		Car car1 = new Car("fiat", "red", 130, false);
		int carResult = car1.fixVehicle();
		Assertions.assertTrue(carResult == 250);
	}
}