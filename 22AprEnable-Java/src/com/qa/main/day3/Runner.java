package com.qa.main.day3;

public class Runner {

	public static void main(String[] args) {

		Fish angelfish = new Fish(true, 11, 12.7f, "black, yellow and white");
		System.out.println(angelfish.size);
		angelfish.colour = "stripey yellow, white and black";
		System.out.println(angelfish.colour);
	}

}
