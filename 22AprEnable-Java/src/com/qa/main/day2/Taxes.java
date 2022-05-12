package com.qa.main.day2;

public class Taxes {
	public static int percTax(int x) {
		if (x >= 0 && x < 14999) {
			System.out.println("0% taxation");
			return 0;
		}
		else if (x >= 15000 && x < 19999) {
			System.out.println("10% taxation");
			return 10;
		}
		else if (x >= 20000 && x < 29999) {
			System.out.println("15% taxation");
			return 15;
		}
		else if (x >= 30000 && x < 44999) {
			System.out.println("20% taxation");
			return 20;
		}
		else {
			System.out.println("25% taxation");
			return 25;
		}
	}
	
	public static int amountTaxed(int x) {
		if (x >= 0 && x < 14999) {
			System.out.println("0% taxation");
			return 0;
		}
		else if (x >= 15000 && x < 19999) {
			System.out.println("10% taxation");
			return x / 10;
		}
		else if (x >= 20000 && x < 29999) {
			System.out.println("15% taxation");
			return (x / 100) * 15;
		}
		else if (x >= 30000 && x < 44999) {
			System.out.println("20% taxation");
			return x / 5;
		}
		else {
			System.out.println("25% taxation");
			return x / 4;
		}
	}
	
	public static int taxCalc(int x) {
		return (x / 100) * percTax(x);
	}
}
	
