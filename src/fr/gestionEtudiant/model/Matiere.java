package fr.gestionEtudiant.model;

public class Matiere {
	private int id; 
	private String mNom, mDescription;
	
	public Matiere(){
		
	}
	
	/**
	 * @param id
	 * @param mNom
	 * @param mDescription
	 */
	public Matiere(int id, String mNom, String mDescription) {
		super();
		this.id = id;
		this.mNom = mNom;
		this.mDescription = mDescription;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the mNom
	 */
	public String getmNom() {
		return mNom;
	}
	/**
	 * @param mNom the mNom to set
	 */
	public void setmNom(String mNom) {
		this.mNom = mNom;
	}
	/**
	 * @return the mDescription
	 */
	public String getmDescription() {
		return mDescription;
	}
	/**
	 * @param mDescription the mDescription to set
	 */
	public void setmDescription(String mDescription) {
		this.mDescription = mDescription;
	} 

	
}
