package com.qa.main;

public class Boat extends Vehicle {
	
	private String model;
	private int speed;
	private boolean inflatable;
	
	public Boat(int speed, String model, int speed2, boolean inflatable) {
		super(speed);
		this.model = model;
		speed = speed2;
		this.inflatable = inflatable;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isInflatable() {
		return inflatable;
	}
	public void setInflatable(boolean inflatable) {
		this.inflatable = inflatable;
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
		return "Boat [model=" + model + ", speed=" + speed + ", inflatable=" + inflatable + ", getModel()=" + getModel()
				+ ", getSpeed()=" + getSpeed() + ", isInflatable()=" + isInflatable() + "]";
	}
	
	
	
}
