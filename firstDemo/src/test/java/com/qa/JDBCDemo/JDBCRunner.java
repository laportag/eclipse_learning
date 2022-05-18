package com.qa.JDBCDemo;

public class JDBCRunner {

	public static void main(String[] args) {
		JDBCDemo jdbc = new JDBCDemo();
		
		Cafe newCafe = new Cafe();
		Drink latte = new Drink("latte", "grande", false, 1.50f);
		Drink drink2 = new Drink("espresso", "single", true, 1.0f);
		
		newCafe.addDrink(drink2);

	}

}
