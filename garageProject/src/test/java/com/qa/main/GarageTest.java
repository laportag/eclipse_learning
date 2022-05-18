package com.qa.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GarageTest {
	
	Garage garage = new Garage();
	Bike bike2 = new Bike("hammer", "orange", 50, false);
	Boat boat2 = new Boat("triton", "white", 85, true);
	Car car2 = new Car("volvo", "silver", 135, true);
	
	@BeforeEach
	public void setup() {
		garage.vehicles.clear();
		garage.addVehicle(bike2);
		garage.addVehicle(boat2);
		garage.addVehicle(car2);
	}
	
	@Test
	public void garageTestAdd() {
		Vehicle result;
		result = garage.addVehicle(bike2);
		Assertions.assertTrue(result == bike2);
	}
	
	@Test
	public void garageTestRemove() {		
		Vehicle result;
		result = garage.removeVehicle(0);
		Assertions.assertTrue(result == bike2);
	}
	
	@Test
	public void garageTestFix() {
		int cost;
		cost = garage.vehicles.get(2).fixVehicle();
		Assertions.assertTrue(cost == 152);
	}
}
