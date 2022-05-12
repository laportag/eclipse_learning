package com.qa.main;

import java.util.ArrayList;

public class Cafe {
	
	public static ArrayList<Drink> orders = new ArrayList<>();
	
	// add order
	// public static boolean addOrder(String order) {
	// 	return orders.add(order);
	// }
	public boolean addOrder(Drink order) {
		return orders.add(order);
	}
	
//	// return order
//	public static  ArrayList<Drink> returnOrder(int i) {
//		return orders.get(i);
//	}
//	
//	// modify order
//	public static  ArrayList<Drink> updateOrder(int i, String order) {
//		return orders.set(i, order);
//	}
//	
//	//remove order
//	public static  ArrayList<Drink> removeOrder(int i) {
//		return orders.remove(i);
//	}
	
	// print all orders
	public static ArrayList<Drink> printAll() {
		return orders;		
	}
	
	// clear all orders
	public static void clearAll() {
		orders.clear();
	}
}
