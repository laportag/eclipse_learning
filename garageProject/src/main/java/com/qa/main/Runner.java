package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Garage garage = new Garage();
		Car car1 = new Car("fiat 500", "red", 120, true);
		Bike bike1 = new Bike("bridgeford 150", "blue", 30, true);
		Boat boat1 = new Boat("aquasport 300", "white", 60, true);
		
		garage.addVehicle(car1);
		garage.addVehicle(bike1);
		garage.addVehicle(boat1);
		
		garage.removeVehicle(1);
		
		garage.fixVehicle(0);
		
//		Garage.get[3].fixVehicle();
	}

}
