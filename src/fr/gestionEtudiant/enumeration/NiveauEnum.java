package fr.gestionEtudiant.enumeration;

public enum NiveauEnum { 
	L1("L1"), L2("L2"), L3("L3"), M1("M1"), M2("M2");
	
	NiveauEnum(String value) {
		this.value = value;
	}

	String value;
	String getValue(){
		return this.value;
	}
	

}
