package game;

public class Player extends People {
	Player(String name, String surname, String username, String password){
		super(name, surname, username, password);
	}
	
	public String say() {
		return "Hey, I am "+this.getName()+" "+this.getSurname()+" and I want to be a millionaire!";
	}
}
