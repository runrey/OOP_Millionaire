package game;

import java.sql.SQLException;
import java.util.ArrayList;

public class Game {
	private static Game instance;
	private static Database link;
	private Game() {
		
	}
	
	public static Game getInstance() {
		if(instance == null) {
			instance = new Game();
		}
		return instance;
	}
	
	public static void start(Player player) throws ClassNotFoundException, SQLException {
		
		
		System.out.println("Game is on developing");
	}
	

	
	public void newRecord(int score, int id) throws ClassNotFoundException, SQLException {
		this.connection();
		Game.insertScore(score, id);
	}
	
	public void connection() throws ClassNotFoundException {
		try {
			setLink(new Database("localhost", "root", "", "yernur"));
		}
		catch(SQLException e) {
			System.out.println("Connection error: "+e.getMessage());
		}
	}
	
	public static void insertScore(int score, int id) throws SQLException {
		link.insert("INSERT INTO score(user_id, score) VALUES ('"+id+"', '"+score+"')");
	}

	public Database getLink() {
		return link;
	}

	private void setLink(Database link) {
		Game.link = link;
	}
}
