package com.qa.main;

public class Drink {
	
	public String type;
	public boolean hot;
	public float price;
	public int size;
	
	public Drink(String type, boolean hot, float price, int size) {
		super();
		this.type = type;
		this.hot = hot;
		this.price = price;
		this.size = size;
	}

	@Override
	public String toString() {
		return "Drink [type=" + type + ", hot=" + hot + ", price=" + price + ", size=" + size + "]";
	}
	
	
	
}
