package Entities;

public abstract class Utente {
	private String username;
	private int id;
	
	Utente(int id,String username){
		this.id=id;
		this.username=username;
	}
	
	public int getId() {
		return id;
	}
	
	public String getUsername() {
		return username;
	}
}