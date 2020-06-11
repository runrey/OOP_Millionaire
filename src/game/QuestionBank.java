package game;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class QuestionBank {
	private ArrayList<Questions> easy;
	private ArrayList<Questions> medium;
	private ArrayList<Questions> hard;
	private Database link;
	
	QuestionBank() throws ClassNotFoundException{
		try {
			setLink(new Database("localhost", "root", "", "yernur"));
		}
		catch(SQLException e) {
			System.out.println("Connection error: "+e.getMessage());
		}
	}
	
	public ArrayList<Questions> getEasy() throws SQLException{
		ResultSet query = link.query("SELECT * FROM question WHERE level = 'easy'");
		while(query.next()) {
			EasyQuestion e = new EasyQuestion(query.getString("value"), query.getString("a_answer"), query.getString("b_answer"), query.getString("c_answer"), query.getString("d_answer"), query.getString("correct_answer"));
			this.easy.add(e);
		}
		return easy;
	}
	
	public ArrayList<Questions> getMedium() throws SQLException{
		ResultSet query = link.query("SELECT * FROM question WHERE level = 'easy'");
		while(query.next()) {
			EasyQuestion e = new EasyQuestion(query.getString("value"), query.getString("a_answer"), query.getString("b_answer"), query.getString("c_answer"), query.getString("d_answer"), query.getString("correct_answer"));
			this.easy.add(e);
		}
		return medium;
	}
	
	public ArrayList<Questions> getHard() throws SQLException{
		ResultSet query = link.query("SELECT * FROM question WHERE level = 'easy'");
		while(query.next()) {
			EasyQuestion e = new EasyQuestion(query.getString("value"), query.getString("a_answer"), query.getString("b_answer"), query.getString("c_answer"), query.getString("d_answer"), query.getString("correct_answer"));
			this.easy.add(e);
		}
		return hard;
	}

	public Database getLink() {
		return link;
	}

	private void setLink(Database link) {
		this.link = link;
	}
	
	
}
