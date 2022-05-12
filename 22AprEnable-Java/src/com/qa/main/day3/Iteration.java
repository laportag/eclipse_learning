package com.qa.main.day3;

public class Iteration {
	
	public static void loopA() {;
		for (int a = 100; a < 200; a++) {
			System.out.println(a);
		}
	}
	
	public static void loopB() {
		for (int A = 100; A <= 200; A++) {
			if (A % 2 == 0) {
				System.out.println("-");
			}
			else {
				System.out.println("*");
			}
		}
	}
	
	public static void coins(float cost, float moneySpent) {
		int fifty = 0;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int fiftyP = 0;
		int twentyP = 0;
		int tenP = 0;
		int fiveP =0;
		int twoP = 0;
		int oneP = 0;
		
		float change = moneySpent - cost;
		
		while(change >= 50) {
			fifty++;
			change -= 50;
		}
		while(change >= 20) {
			twenty++;
			change -= 20;			
		}
		while(change >= 10) {
			ten++;
			change -= 10;
		}
		while(change >= 5) {
			five++;
			change -= 5;
		}
		while(change >= 1) {
			one++;
			change -= 1;
		}
		while(change >= 0.5f) {
			fiftyP++;
			change -= 0.5f;
		}
		while(change >= 0.2f) {
			twentyP++;
			change -= 0.2f;
		}
		while(change >= 0.1f) {
			tenP++;
			change -= 0.1f;
		}
		while(change >= 0.05f) {
			fiveP++;
			change -= 0.05f;
		}
		while(change >= 0.02f) {
			twoP++;
			change -= 0.02f;
		}
		while(change >= 0.01f) {
			oneP++;
			change -= 0.01f;
		}
		System.out.println("£50 -" + fifty);
		System.out.println("£20 -" + twenty);
		System.out.println("£10 -" + ten);
		System.out.println("£5 -" + five);
		System.out.println("£1 -" + one);
		System.out.println("50p -" + fiftyP);
		System.out.println("20p -" + twentyP);
		System.out.println("10p -" + tenP);
		System.out.println("5p -" + fiveP);
		System.out.println("2p -" + twoP);
		System.out.println("1p -" + oneP);
	}
}