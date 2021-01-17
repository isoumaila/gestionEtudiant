package fr.gestionEtudiant.model;

import java.time.LocalDateTime;

import fr.gestionEtudiant.enumeration.DocumentType;

public class Document {
	private int mId; 
	private String mNom;
	private LocalDateTime mDate; 
	private DocumentType mType; 
	private Personne mPersonne; 
	private Matiere mMatiere; 
	
	Document(){
		
	}

	/**
	 * @param mId
	 * @param mNom
	 * @param mDate
	 * @param mType
	 * @param mPersonne
	 * @param mMatiere
	 */
	public Document(int mId, String mNom, LocalDateTime mDate, DocumentType mType, Personne mPersonne, Matiere mMatiere) {
		super();
		this.mId = mId;
		this.mNom = mNom;
		this.mDate = mDate;
		this.mType = mType;
		this.mPersonne = mPersonne;
		this.mMatiere = mMatiere;
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
	 * @return the mDate
	 */
	public LocalDateTime getmDate() {
		return mDate;
	}

	/**
	 * @param mDate the mDate to set
	 */
	public void setmDate(LocalDateTime mDate) {
		this.mDate = mDate;
	}

	/**
	 * @return the mType
	 */
	public DocumentType getmType() {
		return mType;
	}

	/**
	 * @param mType the mType to set
	 */
	public void setmType(DocumentType mType) {
		this.mType = mType;
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
	public Matiere getmMatiere() {
		return mMatiere;
	}

	/**
	 * @param mMatiere the mMatiere to set
	 */
	public void setmMatiere(Matiere mMatiere) {
		this.mMatiere = mMatiere;
	}
	

}
