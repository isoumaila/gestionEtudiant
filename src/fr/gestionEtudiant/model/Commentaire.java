package fr.gestionEtudiant.model;

import java.time.LocalDateTime;

public class Commentaire {
	
	private int id;
	private LocalDateTime date;
	private String text;
	private boolean anonyme;
	private Personne personne;
	private Personne redacteur;
	
	
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Commentaire(int id, LocalDateTime date, String text, boolean anonyme, Personne personne,
			Personne redacteur) {
		super();
		this.id = id;
		this.date = date;
		this.text = text;
		this.anonyme = anonyme;
		this.personne = personne;
		this.redacteur = redacteur;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public boolean isAnonyme() {
		return anonyme;
	}


	public void setAnonyme(boolean anonyme) {
		this.anonyme = anonyme;
	}


	public Personne getPersonne() {
		return personne;
	}


	public void setPersonne(Personne personne) {
		this.personne = personne;
	}


	public Personne getRedacteur() {
		return redacteur;
	}


	public void setRedacteur(Personne redacteur) {
		this.redacteur = redacteur;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " +this.text + " "+ this.personne;
	}

}
