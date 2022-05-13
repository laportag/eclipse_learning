package com.qa.main;

import java.util.ArrayList;

public class Garage {
	
	public static ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	public void addVehicle(Vehicle veh) {
		System.out.println("adding " veh);
		return vehicles.add(veh);
	}
	
	public void removeVehicle(Vehicle veh) {
		System.out.println("removing " veh);
		return vehicles.add(veh);
	}
	
	public void fixVehicle() {
		
	}

}
