package com.qa.JDBCDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Cafe {
	
	Statement stmt = null;
	Connection conn = null;
	
	JDBCDemo db = new JDBCDemo();
	
	public void addDrink(Drink drink) {
		try {
			conn = db.connect();
			stmt = conn.createStatement();
			String query = "INSERT INTO drinks(type, size, dairyFree, cost) VALUES('"+ drink.getType() + "', '"+ drink.getSize() +"', " + drink.isDairyFree()+ ", "+ drink.getCost()+");";
			System.out.println(query);
			stmt.executeUpdate(query);
		} 
		catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	
	public Drink getDrinkById(int id) {
		try {
			conn = db.connect();
			stmt = conn.createStatement();
			String query = "select * from drinks where id = " + id;
			ResultSet results = stmt.executeQuery(query);
			results.next();
			System.out.println(results);
			Drink drinkResult = modelDrink(results);
			return drinkResult;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Drink modelDrink(ResultSet result) {
		try {
			int id = result.getInt(1);
			String type = result.getString("type");
			String size = result.getString("size");
			boolean bool = result.getBoolean("dairyFree");
			float cost = result.getFloat("cost");
			
			Drink drink = new Drink(id, type, size, bool, cost);
			return drink;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public ArrayList<Drink> getAllDrinks() {
		ArrayList<Drink> resultList = new ArrayList<>();
		try {
			conn = db.connect();
			stmt = conn.createStatement();
			String query = "select * from drinks";
			ResultSet results = stmt.executeQuery(query);
			
			while(results.next()) {
				resultList.add(modelDrink(results));
			}
			return resultList;
		}
		catch (Exception e) {
			return null;	
		}
		
	}
	
	public ArrayList<Drink> gotMilk() {
		ArrayList<Drink> milkList = new ArrayList<>();
		try {
			conn = db.connect();
			stmt = conn.createStatement();
			String query = "select * from drinks where dairyFree = false";
			ResultSet results = stmt.executeQuery(query);
			
			while(results.next()) {
				milkList.add(modelDrink(results));
			}
			return milkList;
		}
		catch (Exception e) {
			return null;	
		}
		
	}
	
	public ArrayList<Drink> getDrinkByQuery(String queryTerm, String value) {
		ArrayList<Drink> resultList = new ArrayList<>();
		try {
			conn = db.connect();
			stmt = conn.createStatement();
			String query = "select * from drinks where " + queryTerm + " = " + value;
			ResultSet results = stmt.executeQuery(query);
			
			while(results.next()) {
				resultList.add(modelDrink(results));
			}
			return resultList;
		}
		catch (Exception e) {
			return null;	
		}
		
	}
	
	public int deleteDrink(int id) {
		try {
			conn = db.connect();
			String query = "delete from drinks where id = ?";
			PreparedStatement preStmt = conn.prepareStatement(query);
			preStmt.setInt(1, id); // 1st ? = id, index from 1
			return preStmt.executeUpdate();
		} 
		catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public Drink updateDrinkById(Drink drink, int id) {
		try {
			conn = db.connect();
			String query = "update drinks set type = ?, size = ? dairyFree = ?, cost = ?, where id = ?";
			PreparedStatement preStmt = conn.prepareStatement(query);
			preStmt.setString(1, drink.getType());
			preStmt.setString(2, drink.getSize());
			preStmt.setBoolean(3, drink.isDairyFree());
			preStmt.setFloat(4, drink.getCost());
			preStmt.setInt(5, id);
			preStmt.executeUpdate();
			return getDrinkById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;	
		}
	}
	

}
