package com.qa.main.day2;

public class FizzBuzz {
	public static String fizzBuzz(int x) {
		if (x % 3 == 0 && x % 5 == 0) {
			return "FizzBuzz";
		}
		else if (x % 3 == 0) {
			return "Fizz";
		}
		else if (x % 5 == 0) {
			return "Buzz";
		}
		else {
			return x + ", nah";
		}
	}
}
