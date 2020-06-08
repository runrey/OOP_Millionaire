package game;

public class Host extends People {
	Host(String name, String surname, String username, String password){
		super(name, surname, username, password);
	}
	
	public String say() {
		return "Hey, I am , "+this.getName()+" "+this.getSurname()+" and I am Host of this game! Do you deserve to win a million?! We'll find out right now";
	}
}
