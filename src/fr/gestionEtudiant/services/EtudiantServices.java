package fr.gestionEtudiant.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import fr.gestionEtudiant.dao.IDao;
import fr.gestionEtudiant.dao.sql.EtudiantDaoSQL;
import fr.gestionEtudiant.dao.sql.NiveauDaoSQL;
import fr.gestionEtudiant.dao.sql.SpecialiteDaoSQL;
import fr.gestionEtudiant.model.Etudiant;
import fr.gestionEtudiant.model.Niveau;
import fr.gestionEtudiant.model.Specialite;

public class EtudiantServices {

	public static void menuApplication() {
		System.exit(0);
	}

	public static void exitApplication() {

		afficher("\t\n\n: Menu Application Gestion Etudiant\n\n");

		afficher("***********************************");
		afficher(": 1 - Créer un compte etudiant    :");
		afficher("***********************************");
		afficher(": 2 - Affihcer tous les étudiants :");
		afficher("***********************************");
		afficher(": 3 - Supprimmser un etudiant     :");
		afficher("***********************************");
		afficher(": 5 - Quitter l'application       :");
		afficher("***********************************");

		Scanner sc = new Scanner(System.in);
		afficher("Tapper un des Numéros du menu :");
		afficher("Numéro :");
		int key = sc.nextInt();

		switch (key) {
		case 1:
			menuAjouterUnEtudiant();
			break;
		case 2:
			menuAfficherLesEtudiant();
			break;
		case 3:
		case 4:
		case 5:
			afficher("Vous avez quitté l'application !!");
			break;
			
		}

	}
	
	public static void menuAfficherLesEtudiant() {
		IDao daoE = new EtudiantDaoSQL();
		List<Etudiant> listEtudiants = daoE.findAll();
		
		afficher("\n\nListe des étudiants déjà inscrits :\n");
		for(Etudiant e: listEtudiants) {
			afficher(e.getmNom() + " "+e.getmPrenom());
		}
	}

	public static void menuAjouterUnEtudiant() {

		Scanner sc = new Scanner(System.in);
		afficher("Pour créer un compte etudiant, renseigner Tous les champs : ");
		afficher("Saisis le nom :");
		String nom = sc.nextLine();
		afficher("Saisis le prenom :");
		String prenom = sc.nextLine();
		afficher("Saisis le mail :");
		String mail = sc.nextLine();
		afficher("Saisis le telephone :");
		String telephone = sc.nextLine();
		afficher("Saisis l'adresse :");
		String adresse = sc.nextLine();
		afficher("Saisis le mode de passe :");
		String password = sc.nextLine();
		afficher("Saisis l'année en cours sous le forma:yyyy-MM-dd :");
		String anne = sc.nextLine();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateTime = LocalDate.parse(anne, formatter);
		afficher("Saisis le niveau :");
		int niveau = sc.nextInt();
		afficher("Saisis la spécialité :");
		int sp = sc.nextInt();

		IDao daoN = new NiveauDaoSQL();
		Niveau niveauD = (Niveau) daoN.findById(niveau);
		IDao daoSP = new SpecialiteDaoSQL();
		Specialite specialite = (Specialite) daoSP.findById(sp);
		Etudiant etudiant = new Etudiant(0, nom, prenom, mail, telephone, adresse, password, null, null, null, null,
				dateTime, niveauD, specialite, null, null);

		IDao daoE = new EtudiantDaoSQL();
		daoE.add(etudiant);
	}

	public static boolean validate(String data) {
		boolean saisiOk = false;

		while (saisiOk) {

			if (data.equals("")) {
				afficher("Resaisir le nom :");
			}
			if (data.equals("")) {
				afficher("Resaisir le prenom :");
			}
		}
		return false;

	}

	public static void menuNiveau() {

	}

	public static void menuSpecialite() {

	}

	public static void afficher(String data) {
		System.out.println(data);
	}

}
