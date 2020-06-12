package game;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Authorization {
	private Database link;
	
	public Authorization() throws ClassNotFoundException{
		try {
			setLink(new Database("localhost", "root", "", "yernur"));
		}
		catch(SQLException e) {
			System.out.println("Connection error: "+e.getMessage());
		}
	}
	public static void main(String args[]) throws IOException, ClassNotFoundException, SQLException {
		
	}
	public Player auth(String username, String password) throws SQLException {
		ResultSet rs = link.query("SELECT * FROM users WHERE user_name = '"+username+"' AND user_pass = '"+password+"'");
		if(rs.next()) {
			return new Player(rs.getInt("user_id"), rs.getString("fname"), rs.getString("lname"), rs.getString("user_name"), rs.getString("user_pass"));
		}
		return null;
	}
	
	public boolean sign(String username, String password, String fname, String lname) throws SQLException {
		ResultSet rs = link.query("SELECT * FROM users WHERE user_name = '"+username+"'");
		if(rs.next()) {
			link.insert("INSERT INTO users (fname, lname, user_name, user_pass) VALUES ('"+fname+"', '"+lname+"', '"+username+"', '"+password+"')");
			return true;
		}
		return false;
	}
	
	public Admin admAuth(String username, String password) throws SQLException {
		ResultSet rs = link.query("SELECT * FROM admins WHERE admin_name = '"+username+"' AND a_pass = '"+password+"'");
		if(rs.next()) {
			return new Admin(rs.getInt("adm_id"), rs.getString("a_fname"), rs.getString("a_lname"), rs.getString("admin_name"), rs.getString("a_pass"));
		}
		return null;
	}
	public Database getLink() {
		return link;
	}

	private void setLink(Database link) {
		this.link = link;
	}
	
}
