package fr.gestionEtudiant;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import fr.gestionEtudiant.dao.IDao;
import fr.gestionEtudiant.dao.sql.EtudiantDaoSQL;
import fr.gestionEtudiant.enumeration.NiveauEnum;
import fr.gestionEtudiant.enumeration.SemestreEnum;
import fr.gestionEtudiant.enumeration.SpecialiteEnum;
import fr.gestionEtudiant.model.Etudiant;
import fr.gestionEtudiant.model.Niveau;
import fr.gestionEtudiant.model.Specialite;

//Personne 
//SpecialiteEnum
//NiveauEnum

public class Application {

	public static void main(String[] args) {
		
		
		IDao dao = new EtudiantDaoSQL();
		
		Niveau niveau = new Niveau();
		niveau.setmId(1);
		niveau.setmNom(NiveauEnum.M2.name());
		
		Specialite sp = new Specialite(1, SpecialiteEnum.Chimie.name(), " Age superieure à 20", SemestreEnum.S1);
		
		Etudiant etudiant = new Etudiant();
		
		etudiant.setmId(1);
		etudiant.setmNom("SOUMAILA");
		etudiant.setmPrenom("Boubacar");
		etudiant.setmAdresse("36 rue marguerite Lyon 2");
		String str = "2021-01-15"; 
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

}
