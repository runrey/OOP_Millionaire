import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import game.Game;
import game.Authorization;
import game.Host;
import game.Admin;
import game.Player;

public class Millionaire {
	public static Player someone;
	public static Host host;
	public static Admin adm;
	public static Game game;
	
	public static void main(String args[]) throws IOException, ClassNotFoundException, SQLException {
		try (Scanner in = new Scanner(System.in)) {
			boolean check = false;
			boolean logged = true;
			boolean admCheck = false;
			game = Game.getInstance();
			System.out.println("Welcome to the game who wants to be a millionaire!");
			System.out.println("Please, log in or register, choose what you want, 1 is for log in and 2 is for register:");
			
			while(true) {
				String auth = in.next();
				switch(auth) {
					case "1":
						for(int i = 3; i>0; i--) {
							System.out.println("You have "+ i +" chances to login! Please enter username first and then password!");
							Authorization login = new Authorization();
							String username = in.next();
							String password = in.next();
							if(login.auth(username, password)!=null) {
								someone = login.auth(username, password);
								check = true;
								break;
							}
							else {
								logged = false;
							}
						}
						break;
						
					case "2":
						System.out.println("Pleas write your name, surname, username and password in this sequence!");
						Authorization login = new Authorization();
						String name = in.next();
						String surname = in.next();
						String username = in.next();
						String password = in.next();
						if(login.sign(username, password, name, surname)) {
							someone = login.auth(username, password);
						}
						else {
							System.out.println("Bad connection!");
						}
						check = true;
						break;
							
					case "0711":
						for(int i = 3; i>0; i--) {
							System.out.println("You have "+ i +" chances to login as Admin!!!");
							Authorization admin = new Authorization();
							String a_username = in.next();
							String a_password = in.next();
							if(admin.admAuth(a_username, a_password)!=null) {
								adm = admin.admAuth(a_username, a_password);
								admCheck = true;
								check = true;
								break;
							}
							else {
								logged = false;
							}
						}
						break;
						
					default:
						check = false;
						break;
				}
				if(check || !logged) {
					break;
				}
				
			}
			if(!check) {
				System.out.println("You died!");
				return;
			}
			if(admCheck) {
				System.out.println(adm.say());
				while(true) {
					System.out.println("Please choose what you want to do, 1 to add new question, 0 to exit program");
					String a = in.next();
					if(a.equals("add")) {
						System.out.println("Write level of difficulty, question, answer a, answer b, answer c, answer d, and correct answer");
						String level = in.next();
						String question = in.next();
						String a_answer = in.next();
						String b_answer = in.next();
						String c_answer = in.next();
						String d_answer = in.next();
						String correct = in.next();
						adm.connection();
						adm.addQuestion(level, question, a_answer, b_answer, c_answer, d_answer, correct);
						System.out.println("Question was added successfully");
					}
					if(a.equals("stop")) {
						System.out.println("Goodbye, have a nice day!");
						break;
					}
					
				}
			}
			
			else {
				host = new Host(0, "Jeremy", "Clarkson", "jclark", "1234");
				System.out.println(host.say());
				System.out.println(someone.say());
				Game.start(someone);
			}
			System.out.println("Gotcha!");
		
		}
	}
}
