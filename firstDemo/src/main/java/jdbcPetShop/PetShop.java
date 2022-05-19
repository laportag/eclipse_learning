package jdbcPetShop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PetShop {
	
	DBConfig db = new DBConfig();
	
	Statement stmt = null;
	Connection conn = db.connect();
	
	public boolean addbird(Bird bird) {
		try {
			String query = "insert into birds(feather_colour, wingspan, name) values(?, ?, ?);";
			PreparedStatement preStmt = conn.prepareStatement(query);
			preStmt.setString(1, bird.getFeatherColour());
			preStmt.setInt(2, bird.getWingspan());
			preStmt.setString(3, bird.getName());
			preStmt.executeUpdate(); // changes data, executeQuery() gets data
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Bird getBirdById(int id) {
		try {
			String query = "select from birds where id = ?;";
			PreparedStatement preStmt = conn.prepareStatement(query);
			preStmt.setInt(1, id);
			ResultSet results = preStmt.executeQuery();
			return modelBird(results);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
		
	public boolean deleteBirdById(int id) {
		try {
			String query = "delete from birds where id = ?;";
			PreparedStatement preStmt = conn.prepareStatement(query);
			preStmt.setInt(1, id);
			preStmt.executeUpdate();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;		
		}
	}
	
	public Bird updateBirdById(int id, Bird bird) {
		try {
			String query = "update birds set feather_colour = ?, wingspan = ?, name = ? where id = ?;";
			PreparedStatement preStmt = conn.prepareStatement(query);
			preStmt.setString(1, bird.getFeatherColour());
			preStmt.setInt(2, bird.getWingspan());
			preStmt.setString(3, bird.getName());
			preStmt.setInt(4, id);
			preStmt.executeUpdate();
			return getBirdById(id);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	
	public Bird modelBird(ResultSet result) {
		try {
			int id = result.getInt("id");
			String featherColour = result.getString("feather_colour");
			int wingspan = result.getInt("wingspan");
			String name = result.getString("name");
			Bird bird = new Bird(id, featherColour, wingspan, name);
			return bird;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
