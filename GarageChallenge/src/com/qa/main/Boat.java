package com.qa.main;

public class Boat extends Vehicle {
	
	private boolean cleanHull;

	public Boat(String model, String colour, int speed, boolean cleanHull) {
		super(model, colour, speed);
		this.cleanHull = cleanHull;
	}

	@Override
	public String toString() {
		return "Boat [cleanHull=" + cleanHull + ", getModel()=" + getModel() + ", getColour()=" + getColour()
				+ ", getSpeed()=" + getSpeed() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public boolean isCleanHull() {
		return cleanHull;
	}

	public void setCleanHull(boolean cleanHull) {
		this.cleanHull = cleanHull;
	}

	@Override
	public void fixVehicle() {
		int cost = 450;
		if (cleanHull == false) {
			cost += 100;
		}
		System.out.println("fix cost is £" + cost);
	}
	
}
