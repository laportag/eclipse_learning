package com.qa.main.day2;

public class Iteration {
	public static String loop(int start, int expenses, int limit) {
		int funds = start;
		boolean solvent = true;
				
		while (solvent) {
			funds -= expenses;
			if (funds < limit) {
				solvent = false;
				System.out.println(funds);
				
			}
	
		}
		return "Stop right there";
	}
}
