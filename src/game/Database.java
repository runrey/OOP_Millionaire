package game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	
	//variables
	private Connection con;
	private Statement stmt;
	private static boolean isConnected;
	
	//constructor and connection to database
	public Database(String hostname, String username, String pass, String dbName) throws SQLException, ClassNotFoundException
	{
		Class.forName("com.mysql.jdbc.Driver");  
		this.con = DriverManager.getConnection("jdbc:mysql://" + hostname + ":3306/" + dbName+"", username, pass);   
		this.stmt = con.createStatement();
		Database.setConnected(true);
	}
		
	//method to close the connection between database
	public void closeCon() throws SQLException {
		con.close();
	}
	
	public ResultSet query(String query) throws SQLException {
		ResultSet rs = stmt.executeQuery(query);
		return rs;
	}
	
	//setter and getter methods
	public Statement getStmt() {
		return stmt;
	}

	public void setStmt(Statement stmt) {
		this.stmt = stmt;
	}

	public static boolean isConnected() {
		return isConnected;
	}

	public static void setConnected(boolean isConnected) {
		Database.isConnected = isConnected;
	}
}
