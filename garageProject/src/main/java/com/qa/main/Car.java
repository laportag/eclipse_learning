package com.qa.main;

public class Car extends Vehicle {
	
	private boolean flatTyres;

	public Car(String model, String colour, int speed, boolean flatTyres) {
		super(model, colour, speed);
		this.flatTyres = flatTyres;
	}

	@Override
	public String toString() {
		return "Car [flatTyres=" + flatTyres + ", getModel()=" + getModel() + ", getColour()=" + getColour()
				+ ", getSpeed()=" + getSpeed() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public boolean isFlatTyres() {
		return flatTyres;
	}

	public void setFlatTyres(boolean flatTyres) {
		this.flatTyres = flatTyres;
	}

	@Override
	public int fixVehicle() {
		int cost = 250;
		if (flatTyres == true) {
			cost += 10;
		}
		System.out.println("fix cost is £" + cost);
		return cost;
	}
	
	

}
