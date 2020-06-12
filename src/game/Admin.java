package game;

import java.sql.SQLException;

public class Admin extends People {
	private Database link;
	
	public Admin(int id, String name, String surname, String username, String password){
		super(id, name, surname, username, password);
	}

	public void connection() throws ClassNotFoundException {
		try {
			setLink(new Database("localhost", "root", "", "yernur"));
		}
		catch(SQLException e) {
			System.out.println("Connection error: "+e.getMessage());
		}
	}
	
	public String say() {
		return "Hey, I am "+ this.getUsername() + " and I am Admin of this Game, cheaters go to HELL!";
	}
	
	public void addQuestion(String level, String question, String a, String b, String c, String d, String answer) throws SQLException {
		link.insert("INSERT INTO question(level, value, a_answer, b_answer, c_answer, d_answer, correct_answer) VALUES ('"+level+"','"+question+"','"+a+"','"+b+"','"+c+"','"+d+"','"+answer+"')");
	}

	public Database getLink() {
		return link;
	}

	private void setLink(Database link) {
		this.link = link;
	}
}
