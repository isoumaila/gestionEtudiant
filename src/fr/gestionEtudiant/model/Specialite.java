package fr.gestionEtudiant.model;

import fr.gestionEtudiant.enumeration.SemestreEnum;

public class Specialite {
	
	private int mId; 
	private String mNom, mDrescription; 
	private SemestreEnum mSemestre;
	
	public Specialite() {
		
	}
	
	
	
	/**
	 * @param mId
	 * @param mNom
	 * @param mDrescription
	 * @param mSemestre
	 */
	public Specialite(int mId, String mNom, String mDrescription, SemestreEnum mSemestre) {
		super();
		this.mId = mId;
		this.mNom = mNom;
		this.mDrescription = mDrescription;
		this.mSemestre = mSemestre;
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
	 * @return the mDrescription
	 */
	public String getmDescription() {
		return mDrescription;
	}
	/**
	 * @param mDrescription the mDrescription to set
	 */
	public void setmDescription(String mDrescription) {
		this.mDrescription = mDrescription;
	}
	/**
	 * @return the mSemestre
	 */
	public SemestreEnum getmSemestre() {
		return mSemestre;
	}
	/**
	 * @param mSemestre the mSemestre to set
	 */
	public void setmSemestre(SemestreEnum mSemestre) {
		this.mSemestre = mSemestre;
	} 
	

}
