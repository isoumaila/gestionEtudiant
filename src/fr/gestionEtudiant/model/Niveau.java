package fr.gestionEtudiant.model;

import java.util.List;

public class Niveau {
	private int mId; 
	private String mNom, mDescription;
	private List <Matiere> mMatieres;
	
	public Niveau() {
		
	}
	
	/**
	 * @param mId
	 * @param mNom
	 * @param mDescription
	 */
	public Niveau(int mId, String mNom, String mDescription, List <Matiere> mMatieres) {
		super();
		this.mId = mId;
		this.mNom = mNom;
		this.mDescription = mDescription;
		this.mMatieres = mMatieres;
	}

	/**
	 * @return the mMatieres
	 */
	public List<Matiere> getmMatieres() {
		return mMatieres;
	}

	/**
	 * @param mMatieres the mMatieres to set
	 */
	public void setmMatieres(List<Matiere> mMatieres) {
		this.mMatieres = mMatieres;
	}

	/**
	 * @return the mId
	 */
	public int getmId() {
		return mId;
	}

	/**
	 * @param mId the mId to set
	 */
	public void setmId(int mId) {
		this.mId = mId;
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
