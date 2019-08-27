package fr.formation.inti.beans;

public class MessageBean {

	private String message;
	
	
	public MessageBean() {
	}
	
	public void affiche() {
		System.out.println("ceci est un exemple");
	}
	
	public static MessageBean createInstance() {
		System.out.println("création 2");
		return new MessageBean();
		
	}
}
