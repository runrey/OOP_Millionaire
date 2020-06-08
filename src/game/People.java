package game;

public abstract class People {
	//fields
	private String name;
	private String surname;
	private String username;
	private String password;
	
	People(String name, String surname, String username, String password){
		this.setName(name);
		this.setSurname(surname);
		this.setUsername(username);
		this.setPassword(password);
	}
	
	//getter setter methods
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	private void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUsername() {
		return username;
	}
	private void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	private void setPassword(String password) {
		this.password = password;
	}
	
	public abstract String say();
}
