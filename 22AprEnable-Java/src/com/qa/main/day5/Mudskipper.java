package com.qa.main.day5;

public class Mudskipper extends Fish {
	private boolean walks;

	public Mudskipper(String name, String colour, int size, boolean walks) {
		super(name, colour, size);
		this.setWalks(walks);
	}

	@Override
	public String livesIn() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isWalks() {
		return walks;
	}

	public void setWalks(boolean walks) {
		this.walks = walks;
	}
	
	
}
