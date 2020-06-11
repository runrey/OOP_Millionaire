package game;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Authorization {
	private Database link;
	
	Authorization() throws ClassNotFoundException{
		try {
			setLink(new Database("localhost", "root", "", "yernur"));
		}
		catch(SQLException e) {
			System.out.println("Connection error: "+e.getMessage());
		}
	}
	
	public boolean auth(String username, String password) throws SQLException {
		if(link.query("SELECT * FROM users WHERE user_name = '"+username+"' AND user_pass = '"+password+"'")!=null) {
			return true;
		}
		return false;
	}
	
	public boolean sign(String username, String password, String fname, String lname) throws SQLException {
		ResultSet rs = link.query("SELECT * FROM users WHERE user_name = '"+username+"'");
		if(!rs.next()) {
			link.insert("INSERT INTO users (fname, lname, user_name, user_pass) VALUES ('"+fname+"', '"+lname+"', '"+username+"', '"+password+"')");
			return true;
		}
		return false;
	}
	
	public Database getLink() {
		return link;
	}

	private void setLink(Database link) {
		this.link = link;
	}
	
}
