package com.qa.main.day3;

public class Arrays {
	
	public static void colourArray() {
		String[] colours = {"red", "yellow", "green", "blue", "orange"};
		for (int i = 0; i < colours.length; i++) {
			
			System.out.println(colours[i]);
			if (colours[i] == "green") {
				System.out.println("This index " + i + " is my favourite colour");
			}
		}
	colours[3] = "purple";
	} 	
}
