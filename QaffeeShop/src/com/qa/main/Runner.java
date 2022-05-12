package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Cafe qaoffee = new Cafe();
		qaoffee.addOrder(new Drink("flat white", true, 1.99f, 180));
		qaoffee.addOrder(new Drink("mocha", true, 2.99f, 180));
//		Cafe.updateOrder(1, "latte");
		System.out.println(Cafe.printAll());
		
	}

}
