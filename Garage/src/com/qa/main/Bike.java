package com.qa.main;

public class Bike extends Vehicle {
	
	private String model;
	private String colour;
	private int wheels;
	
	public Bike(int speed, String model, String colour, int wheels) {
		super(speed);
		this.model = model;
		this.colour = colour;
		this.wheels = wheels;
	}
	
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
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	@Override
	public void addVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fixVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Bike [model=" + model + ", colour=" + colour + ", wheels=" + wheels + ", getModel()=" + getModel()
				+ ", getColour()=" + getColour() + ", getWheels()=" + getWheels() + ", getSpeed()=" + getSpeed() + "]";
	}
	
	

}
