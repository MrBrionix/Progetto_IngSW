package Entities;

public class Elettore extends Utente{
	private String name;
	private String surname;
	private boolean voted;
	
	Elettore(int id, String username, String name, String surname) {
		super(id, username);
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public boolean hasVoted() {
		return voted;
	}
	
}
