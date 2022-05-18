package com.qa.JDBCDemo;

public class Drink {
	private int id;
	private String type;
	private String size;
	private boolean dairyFree;
	private float cost;
	
	//constructor for push into db
	public Drink(String type, String size, boolean dairyFree, float cost) {
		super();
		this.type = type;
		this.size = size;
		this.dairyFree = dairyFree;
		this.cost = cost;
	}
	
	//constructor for pull data from db	
	public Drink(int id, String type, String size, boolean dairyFree, float cost) {
		super();
		this.id = id;
		this.type = type;
		this.size = size;
		this.dairyFree = dairyFree;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isDairyFree() {
		return dairyFree;
	}

	public void setDairyFree(boolean dairyFree) {
		this.dairyFree = dairyFree;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Drink [id=" + id + ", type=" + type + ", size=" + size + ", dairyFree=" + dairyFree + ", cost=" + cost
				+ "]";
	}
	

	

}
