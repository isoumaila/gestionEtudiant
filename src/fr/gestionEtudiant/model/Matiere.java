package fr.gestionEtudiant.model;

public class Matiere {

	
	private int id;
	private String nom;
	private String description;
	
	
	
	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Matiere(int id, String nom, String description) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	@Override
	public String toString() {
		
		return this.id + " " +this.nom + " " + this.description;
	}
}
