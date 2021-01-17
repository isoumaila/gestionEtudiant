package fr.gestionEtudiant.model;

import java.time.LocalDate;

import fr.gestionEtudiant.enumeration.PersonneType;

public abstract class Personne {
	
	protected int mId; 
	protected String mNom, mPrenom, mEmail, mTelephone, mAdresse, mPassword, mLieuNaissance, mPhoto, mDescription; 
	LocalDate mDateNaissance, mAnneEnCours;
	
	public Personne (){
		
	}
	/**
	 * @param mId
	 * @param mNom
	 * @param mPrenom
	 * @param mEmail
	 * @param mTelephone
	 * @param mAdresse
	 * @param mPassword
	 * @param mLieuNaissance
	 * @param mPhoto
	 * @param mDescription
	 * @param mDateNaissance
	 * @param mAnneEnCours
	 */
	public Personne(int mId, String mNom, String mPrenom, String mEmail, String mTelephone, String mAdresse,
			String mPassword, String mLieuNaissance, String mPhoto, String mDescription, LocalDate mDateNaissance,
			LocalDate mAnneEnCours) {
		super();
		this.mId = mId;
		this.mNom = mNom;
		this.mPrenom = mPrenom;
		this.mEmail = mEmail;
		this.mTelephone = mTelephone;
		this.mAdresse = mAdresse;
		this.mPassword = mPassword;
		this.mLieuNaissance = mLieuNaissance;
		this.mPhoto = mPhoto;
		this.mDescription = mDescription;
		this.mDateNaissance = mDateNaissance;
		this.mAnneEnCours = mAnneEnCours;
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
	 * @return the mPrenom
	 */
	public String getmPrenom() {
		return mPrenom;
	}
	/**
	 * @param mPrenom the mPrenom to set
	 */
	public void setmPrenom(String mPrenom) {
		this.mPrenom = mPrenom;
	}
	/**
	 * @return the mEmail
	 */
	public String getmEmail() {
		return mEmail;
	}
	/**
	 * @param mEmail the mEmail to set
	 */
	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}
	/**
	 * @return the mTelephone
	 */
	public String getmTelephone() {
		return mTelephone;
	}
	/**
	 * @param mTelephone the mTelephone to set
	 */
	public void setmTelephone(String mTelephone) {
		this.mTelephone = mTelephone;
	}
	/**
	 * @return the mAdresse
	 */
	public String getmAdresse() {
		return mAdresse;
	}
	/**
	 * @param mAdresse the mAdresse to set
	 */
	public void setmAdresse(String mAdresse) {
		this.mAdresse = mAdresse;
	}
	/**
	 * @return the mPassword
	 */
	public String getmPassword() {
		return mPassword;
	}
	/**
	 * @param mPassword the mPassword to set
	 */
	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}
	/**
	 * @return the mLieuNaissance
	 */
	public String getmLieuNaissance() {
		return mLieuNaissance;
	}
	/**
	 * @param mLieuNaissance the mLieuNaissance to set
	 */
	public void setmLieuNaissance(String mLieuNaissance) {
		this.mLieuNaissance = mLieuNaissance;
	}
	/**
	 * @return the mPhoto
	 */
	public String getmPhoto() {
		return mPhoto;
	}
	/**
	 * @param mPhoto the mPhoto to set
	 */
	public void setmPhoto(String mPhoto) {
		this.mPhoto = mPhoto;
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
	/**
	 * @return the mDateNaissance
	 */
	public LocalDate getmDateNaissance() {
		return mDateNaissance;
	}
	/**
	 * @param mDateNaissance the mDateNaissance to set
	 */
	public void setmDateNaissance(LocalDate mDateNaissance) {
		this.mDateNaissance = mDateNaissance;
	}
	/**
	 * @return the mAnneEnCours
	 */
	public LocalDate getmAnneEnCours() {
		return mAnneEnCours;
	}
	/**
	 * @param mAnneEnCours the mAnneEnCours to set
	 */
	public void setmAnneEnCours(LocalDate mAnneEnCours) {
		this.mAnneEnCours = mAnneEnCours;	
	}
	
	/**
	 * @return type
	 */
	
	public abstract PersonneType type ();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nom" + this.mNom + this.mPrenom + this.mTelephone ;
	}
	
	
	

}
