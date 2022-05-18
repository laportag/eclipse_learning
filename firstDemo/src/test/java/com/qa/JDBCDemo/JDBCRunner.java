package com.qa.JDBCDemo;

public class JDBCRunner {

	public static void main(String[] args) {
		JDBCDemo jdbc = new JDBCDemo();
		
		Cafe newCafe = new Cafe();
		
		Drink latte = new Drink("latte", "grande", false, 1.50f);
		Drink drink2 = new Drink("espresso", "single", true, 1.0f);
		
		System.out.println(newCafe.getDrinkById(4));
		System.out.println("*************************************");
		System.out.println(newCafe.getAllDrinks());
		newCafe.addDrink(latte);
		System.out.println("MILKMILKMILKMILKMILKMILK");
		System.out.println(newCafe.gotMilk());
		
	}

}
