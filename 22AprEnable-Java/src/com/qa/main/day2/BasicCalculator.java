package com.qa.main.day2;

public class BasicCalculator {

	public int returnInt(int num) {
		return num;
	}
	
	public String returnGreeting(String name, String timeOfDay) {
		return "Good " + timeOfDay + " " + name;
	}
	
	public String addSum(int x, int y, int z) {
		int result = 0;
		result = x + y + z;
		if (result % 5 == 0) {
			System.out.println("multiple of 5");
		}
		else {System.out.println();}
		return x + " + " + y + " + " + z + " = " + result ;  
	}
	
	public String subSum(int x, int y) {
		int result2 = 0;
		result2 = x - y;
		if (result2 < 0) {
			return "You can't subtract that";
		}
		else {
		return result2 + " is the answer" ;
		}
	}
	
	public String timesSum(int x, int y) {
		int result3 = 0;
		result3 = x * y;
		if (y == 10) {
			return "this is too easy";
		}
		else {
			return result3 + " is the answer";
		}
	}
	
	public String divSum(int x, int y) {
		float result4 = 0;
		
		if (y == 0) {
			return "you can't divide by 0";
		}
		else {
			result4 = x / y;
			return result4 + " is the answer";
		}
	}
	
	public int squareSum(int x) {
		int result5 = 0;
		result5 = x * x;
		return result5;
	}
	
	public String evenOdd(int x) {
		if (x % 2 == 0) {
			return "x is even";
		}
		else {
			return "x is odd";
		}
	}
}
