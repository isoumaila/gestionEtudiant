package fr.gestionEtudiant.model;

public class MessageChat {

	
	private int id;
	private String text;
	
	private Personne personne;

	public MessageChat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MessageChat(int id, String text, Personne personne) {
		super();
		this.id = id;
		this.text = text;
		this.personne = personne;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
