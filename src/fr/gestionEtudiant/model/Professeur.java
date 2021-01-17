package fr.gestionEtudiant.model;

import java.time.LocalDate;
import java.util.List;

import fr.gestionEtudiant.enumeration.MatiereEnum;
import fr.gestionEtudiant.enumeration.PersonneType;

public class Professeur extends Personne {
	
	private List <Matiere> mMatiere;
	
	/**
	 * @param mMatiere
	 */
	public Professeur(int mId, String mNom, String mPrenom, String mEmail, String mTelephone, String mAdresse,
			String mPassword, String mLieuNaissance, String mPhoto, String mDescription, LocalDate mDateNaissance,
			LocalDate mAnneEnCours, List <Matiere> mMatiere) {
		super(mId, mNom, mPrenom, mEmail, mTelephone, mAdresse,
				mPassword, mLieuNaissance, mPhoto, mDescription, mDateNaissance,
				mAnneEnCours);
		this.mMatiere = mMatiere;
	}

	public Professeur(){
		
	}
	

	/**
	 * @return the mMatiere
	 */
	public List <Matiere> getmMatiere() {
		return mMatiere;
	}

	/**
	 * @param mMatiere the mMatiere to set
	 */
	public void setmMatiere(List <Matiere> mMatiere) {
		this.mMatiere = mMatiere;
	}

	@Override
	public PersonneType type() {
		// TODO Auto-generated method stub
		return PersonneType.Professeur;
	}

}
