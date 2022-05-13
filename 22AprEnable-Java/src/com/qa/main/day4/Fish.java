package com.qa.main.day4;

public class Fish {
	private String name;
	private String colour;
	private int size;
	public Fish(String name, String colour, int size) {
		super();
		this.name = name;
		this.colour = colour;
		this.size = size;
	}
	@Override
	public String toString() {
		return "Fish [name=" + name + ", colour=" + colour + ", size=" + size + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
}
