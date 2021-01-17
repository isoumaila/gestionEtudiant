package fr.gestionEtudiant.model;

import fr.gestionEtudiant.enumeration.MatiereEnum;
import fr.gestionEtudiant.enumeration.Semestre;

public class Note {
	
	private int mId; 
	Personne mPersonne; 
	MatiereEnum mMatiere; 
	Semestre mSemestre;
	
	public Note () {
		
	}
	/**
	 * @param mId
	 * @param mPersonne
	 * @param mMatiere
	 * @param mSemestre
	 */
	public Note(int mId, Personne mPersonne, MatiereEnum mMatiere, Semestre mSemestre) {
		super();
		this.mId = mId;
		this.mPersonne = mPersonne;
		this.mMatiere = mMatiere;
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
	 * @return the mPersonne
	 */
	public Personne getmPersonne() {
		return mPersonne;
	}
	/**
	 * @param mPersonne the mPersonne to set
	 */
	public void setmPersonne(Personne mPersonne) {
		this.mPersonne = mPersonne;
	}
	/**
	 * @return the mMatiere
	 */
	public MatiereEnum getmMatiere() {
		return mMatiere;
	}
	/**
	 * @param mMatiere the mMatiere to set
	 */
	public void setmMatiere(MatiereEnum mMatiere) {
		this.mMatiere = mMatiere;
	}
	/**
	 * @return the mSemestre
	 */
	public Semestre getmSemestre() {
		return mSemestre;
	}
	/**
	 * @param mSemestre the mSemestre to set
	 */
	public void setmSemestre(Semestre mSemestre) {
		this.mSemestre = mSemestre;
	} 

}
