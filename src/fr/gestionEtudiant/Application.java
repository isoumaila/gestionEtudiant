package fr.gestionEtudiant;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import fr.gestionEtudiant.dao.IDao;
import fr.gestionEtudiant.enumeration.NiveauEnum;
import fr.gestionEtudiant.enumeration.SemestreEnum;
import fr.gestionEtudiant.enumeration.SpecialiteEnum;
import fr.gestionEtudiant.model.Etudiant;
import fr.gestionEtudiant.model.Niveau;
import fr.gestionEtudiant.model.Specialite;
import fr.gestionEtudiant.services.EtudiantServices;

//Personne 
//SpecialiteEnum
//NiveauEnum

public class Application {

	public static void main(String[] args) {
		
		BDD bdd = new BDD("url", "root", "Favela.1994","gestionEtudiant","localhost",3306); 
		/*
		IDao daoE = new EtudiantDaoSQL();
		IDao daoN = new NiveauDaoSQL();
		IDao daoSP = new SpecialiteDaoSQL();
		
		testCRUDENiveau(daoN, 5, NiveauEnum.M2, "Seulement pour les europeens");
		testCRUDSpetialite(daoSP, 4, SpecialiteEnum.SciencesDeLingenieur, "Nouveau programme en 2015");
		
		Niveau niveau = (Niveau) daoN.findById(2);
		System.out.println("Niveau trouvé: " + niveau+ " id = " +niveau.getmId());
		Specialite sp = (Specialite) daoSP.findById(2);
		System.out.println("Specialite trouvée: " + sp+ " id = " +sp.getmId());
		testCRUDEtudiant(daoE, niveau, sp);*/
		
		//EtudiantServices.menuAjouterUnEtudiant();
		EtudiantServices.exitApplication();

	}

	/**
	 * To be able to acomplish a compleate a CRUD for the Etudiant entity; a CRUD
	 * must be first created for Niveau and Spetialite. 
	 * 
	 * @param dao
	 */
	public static void testCRUDEtudiant(IDao dao, Niveau niveau,Specialite sp) {
		
		Etudiant etudiant = new Etudiant();

		etudiant.setmNom("Rodrigue");
		etudiant.setmPrenom("Kader");
		etudiant.setmAdresse("36 rue marguerite Lyon 2");
		String str = "2020-01-15";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate dateTime = LocalDate.parse(str, formatter);
		etudiant.setmAnneEnCours(dateTime);
		etudiant.setmEmail("bou@uuuuuu");
		etudiant.setmTelephone("05558888888");
		etudiant.setmNiveau(niveau);
		etudiant.setSpecialite(sp);
		etudiant.setmPassword("jjjjjjjjjj888");
		dao.add(etudiant);
	}
	
	public static void testCRUDENiveau(IDao dao, int id, NiveauEnum nom, String desc) {
		
		System.out.println("Debut testCRUDENiveau");
		Niveau niveau = new Niveau();
		niveau.setmId(id);
		niveau.setmNom(nom.name());
		niveau.setmDescription(desc);
		
		dao.add(niveau);
		System.out.println("find testCRUDENiveau");
	}
	
	public static void testCRUDSpetialite(IDao dao, int id, SpecialiteEnum nom, String description) {
		System.out.println("Debut testCRUDSpetialite");
		Specialite sp = new Specialite(1, nom.name(), description, SemestreEnum.S1);
		dao.add(sp);
		System.out.println("find testCRUDSpetialite");
	}

}
