package com.qa.main;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	Car car = new Car(null, null, 0, false);
	
	public Vehicle addVehicle(Vehicle veh) {
		System.out.println("adding " + veh);
		return veh;
	}
	
	public Vehicle removeVehicle(int index) {
		System.out.println("removing " + vehicles.get(index));
		return vehicles.remove(index);
	}
	
	public boolean fixVehicle(int index) {
		vehicles.get(index).fixVehicle();
		return true;
	}
}
