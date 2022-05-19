package jdbcPetShop;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConfig {
	final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost:3306/petShop?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	final String USER = "root";
	final String PASSWORD = "root";
	Connection conn;
	
	public Connection connect() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("connected");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
			

}
