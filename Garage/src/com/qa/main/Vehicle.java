package com.qa.main;

public abstract class Vehicle {
	
	private int speed;
	
	
	
	public Vehicle(int speed) {
		super();
		this.speed = speed;
	}
	
	
	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public abstract void addVehicle();
	public abstract void removeVehicle();
	public abstract void fixVehicle();
	
	
}
