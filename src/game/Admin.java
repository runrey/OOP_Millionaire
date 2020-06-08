package game;

public class Admin extends People {
	Admin(String name, String surname, String username, String password){
		super(name, surname, username, password);
	}
	
	public String say() {
		return "Hey, I am "+ this.getUsername() + " and I am Admin of this Game, cheaters go to HELL!";
	}
	
	public void ConnecToDBMS() {
		
	}
	
	public void changePassword(String username, String newPassword) {
		
	}
	
	public void changeName(String username, String newName) {
		
	}

	public void changeSurname(String username, String newSurname) {
		
	}
	
	public void addQuestion(String question, String a, String b, String c, String d, String answer) {
		
	}
}
