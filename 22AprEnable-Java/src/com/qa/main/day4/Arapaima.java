package com.qa.main.day4;

public class Arapaima extends Fish {
	
	private boolean labyrinth;
	
	public String length() {
		return "Big";
	}

	public Arapaima(String name, String colour, int size, boolean labyrinth) {
		super(name, colour, size);
		this.labyrinth = true;
	}

	@Override
	public String toString() {
		return "Arapaima [labyrinth=" + labyrinth + "]";
	}

	public boolean getLabyrinth() {
		return true;
	}

	public void setLabyrinth(String labyrinth) {
		this.labyrinth = true;
	}
	

	
}
