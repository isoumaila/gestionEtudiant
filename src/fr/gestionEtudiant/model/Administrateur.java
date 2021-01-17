package fr.gestionEtudiant.model;

import fr.gestionEtudiant.enumeration.PersonneType;

public class Administrateur extends Personne {
	
	public Administrateur() {
		
	}

	@Override
	public PersonneType type() {
		// TODO Auto-generated method stub
		return PersonneType.Administrateur;
	}

}
