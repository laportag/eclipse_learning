package com.qa.main.day2;

public class UniqueSum {
	public static int uniqueSum(int x, int y, int z) {
		if (x != y && x != z && y != z) {
			return x + y + z;
		}
		else if (x != y && y != z) {
			return y;
		}
		else if (x != z && y != z) {
			return z;
		}
		else {
			return 0;
		}
	}
}
