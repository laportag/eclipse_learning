package com.qa.main.day1;

public class Main {
	public static void main(String[] args) {
		System.out.println(returnText());
		System.out.println(returnSum());
		PrintClass.sayHello();
		System.out.println(ReturnColour.returnGreen() + " " + ReturnShape.returnSquare());
		System.out.println(YourName.printName("Greg"));
	}
	
	public static void printMessage() {
		System.out.println("helloMethod");
	}
	public static void callPrint() {
		printMessage();
	}
	
	public static String returnText() {
		return "helloReturn";
	}
	
	public static int returnSum() {
		return 2 + 5;
		
	}
}