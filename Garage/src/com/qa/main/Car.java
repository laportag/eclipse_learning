package com.qa.main;

public class Car extends Vehicle {
	
	private String model;
	private int doors;
	private boolean electric;
	
	public Car(int speed, String model, int doors, boolean electric) {
		super(speed);
		this.model = model;
		this.doors = doors;
		this.electric = electric;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public boolean isElectric() {
		return electric;
	}
	public void setElectric(boolean electric) {
		this.electric = electric;
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
		return "Car [model=" + model + ", doors=" + doors + ", electric=" + electric + ", getModel()=" + getModel()
				+ ", getDoors()=" + getDoors() + ", isElectric()=" + isElectric() + ", getSpeed()=" + getSpeed() + "]";
	}
	
	

}
