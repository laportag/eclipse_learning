package com.qa.JDBCDemo;

import java.sql.Connection;
import java.sql.Statement;

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

}
