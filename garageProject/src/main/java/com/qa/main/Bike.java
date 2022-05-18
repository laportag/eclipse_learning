package com.qa.main;

public class Bike extends Vehicle {

	private boolean bell;

	public Bike(String model, String colour, int speed, boolean bell) {
		super(model, colour, speed);
		this.bell = bell;
	}

	@Override
	public String toString() {
		return "Bike [bell=" + bell + ", getModel()=" + getModel() + ", getColour()=" + getColour() + ", getSpeed()="
				+ getSpeed() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	public boolean isBell() {
		return bell;
	}

	public void setBell(boolean bell) {
		this.bell = bell;
	}

	@Override
	public int fixVehicle() {
		int cost = 150;
		if (bell == true) {
			cost += 2;
		}
		System.out.println("fix cost is £" + cost);
		return cost;
	}
	
	
	

}
