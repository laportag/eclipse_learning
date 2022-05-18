package com.qa.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BoatTest {
	@Test 
	public void boatTest() {			
		Boat boat1 = new Boat("hippo", "green", 15, true);
		int boatResult = boat1.fixVehicle();
		Assertions.assertTrue(boatResult == 450);
	}
}
