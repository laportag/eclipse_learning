package com.qa.main;

public abstract class Vehicle {
	
	private String model;
	private String colour;
	private int speed;
	
	//constructor
	public Vehicle(String model, String colour, int speed) {
		super();
		this.model = model;
		this.colour = colour;
		this.speed = speed;
	}
	
	//getters and setters
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", colour=" + colour + ", speed=" + speed + ", getModel()=" + getModel()
				+ ", getColour()=" + getColour() + ", getSpeed()=" + getSpeed() + "]";
	}
	
	public abstract int fixVehicle();
	

}
