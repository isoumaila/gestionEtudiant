package fr.gestionEtudiant.model;

public class Note {
	
	
	private int id;
	private Personne personne;
	private Matiere matiere;
	private String semestre;
	
	
	
	
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Note(int id, Personne personne, Matiere matiere, String semestre) {
		super();
		this.id = id;
		this.personne = personne;
		this.matiere = matiere;
		this.semestre = semestre;
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public Personne getPersonne() {
		return personne;
	}





	public void setPersonne(Personne personne) {
		this.personne = personne;
	}





	public Matiere getMatiere() {
		return matiere;
	}





	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}





	public String getSemestre() {
		return semestre;
	}





	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	
	
	@Override
	public String toString() {
		return super.toString();
		//return this.id + " " + this.personne.getNom;
	}

}
