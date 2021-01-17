package fr.gestionEtudiant.model;

import java.time.LocalDate;
import java.util.List;

import fr.gestionEtudiant.enumeration.NiveauEnum;
import fr.gestionEtudiant.enumeration.PersonneType;
import fr.gestionEtudiant.enumeration.SpecialiteEnum;

public class Etudiant extends Personne {
	
	private Niveau mNiveau; 
	private Specialite Specialite;
	private List <Matiere> mMatiere;
	private List <Note> mNotes; 
	
	/**
	 * @param mNiveau
	 * @param specialite
	 */
	public Etudiant(int mId, String mNom, String mPrenom, String mEmail, String mTelephone, String mAdresse,
			String mPassword, String mLieuNaissance, String mPhoto, String mDescription, LocalDate mDateNaissance,
			LocalDate mAnneEnCours, Niveau mNiveau, Specialite specialite, List <Matiere> mMatiere, List <Note> mNotes) {
		super(mId, mNom, mPrenom, mEmail, mTelephone, mAdresse,
				mPassword, mLieuNaissance, mPhoto, mDescription, mDateNaissance,
				mAnneEnCours);
		
		this.mNiveau = mNiveau;
		Specialite = specialite;
		this.mMatiere = mMatiere;
		this.mNotes = mNotes; 
	}
	
	/**
	 * @return the mNotes
	 */
	public List<Note> getmNotes() {
		return mNotes;
	}

	/**
	 * @param mNotes the mNotes to set
	 */
	public void setmNotes(List<Note> mNotes) {
		this.mNotes = mNotes;
	}

	/**
	 * @return the mMatiere
	 */
	public List<Matiere> getmMatiere() {
		return mMatiere;
	}

	/**
	 * @param mMatiere the mMatiere to set
	 */
	public void setmMatiere(List<Matiere> mMatiere) {
		this.mMatiere = mMatiere;
	}

	public Etudiant () {
		
	}
	
	
	
	
	@Override
	public PersonneType type() {
		// TODO Auto-generated method stub
		return  PersonneType.Etudiant;
	}


	/**
	 * @return the mNiveau
	 */
	public Niveau getmNiveau() {
		return mNiveau;
	}


	/**
	 * @param mNiveau the mNiveau to set
	 */
	public void setmNiveau(Niveau mNiveau) {
		this.mNiveau = mNiveau;
	}


	/**
	 * @return the specialite
	 */
	public Specialite getSpecialite() {
		return Specialite;
	}


	/**
	 * @param specialite the specialite to set
	 */
	public void setSpecialite(Specialite specialite) {
		Specialite = specialite;
	} 

}
