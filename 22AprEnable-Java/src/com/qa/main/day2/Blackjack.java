package com.qa.main.day2;

public class Blackjack {
	public static int blackjack(int x, int y) {
		if (x > 21 && y > 21) {
			System.out.println("Bust");
			return 0;}
		else if (x > 21 && y <= 21) {
			return y;
		}
		else if (y > 21 && x <= 21) {
			return x;
		}
		else if ((21 - x) < (21 - y)) {
			return x;
			}
		else if ((21 - x) > (21 - y)) {
			return y;
			}
		else {
			System.out.println("Draw");
			return 0;
		}
	}
}
