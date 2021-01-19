package fr.gestionEtudiant.dao.sql;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.gestionEtudiant.dao.IEtudiantDao;
import fr.gestionEtudiant.model.Etudiant;
import fr.gestionEtudiant.model.Matiere;

public class EtudiantDaoSQL extends ConnectionDaoSQL implements IEtudiantDao {

	@Override
	public List<Etudiant> findAll() {
		List<Etudiant> etudiantList = new ArrayList<>();

		try {
			this.openConnection();

			Statement monStatement = this.getConnecionSQL().createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT * FROM personne");

			while (monResultat.next()) {
				Etudiant etudiant = new Etudiant();
				etudiant.setmId(monResultat.getInt("PER_ID"));
				etudiant.setmNom(monResultat.getString("PER_NOM"));
				etudiant.setmPrenom(monResultat.getString("PER_PRENOM"));
				if (monResultat.getDate("PER_DATE_NAISSANCE") != null) {
					etudiant.setmDateNaissance(monResultat.getDate("PER_DATE_NAISSANCE").toLocalDate());
				}

				etudiant.setmAdresse(monResultat.getString("PER_ADRESSE"));
				if (monResultat.getDate("PER_ANNE_ENCOURS") != null) {
				etudiant.setmAnneEnCours(monResultat.getDate("PER_ANNE_ENCOURS").toLocalDate());
				}

				etudiantList.add(etudiant);
			}
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return etudiantList;
	}

	@Override
	public Etudiant findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Etudiant add(Etudiant entity) {
		try {
			this.openConnection("gestionEtudiant", "root", "AA1993ee");

			PreparedStatement monStatementInsert = this.getConnecionSQL().prepareStatement(
					"INSERT INTO personne(per_nom, per_prenom, per_mail, per_adresse, per_telephone, PER_PASSWORD, per_date_Naissance,PER_SPETIALITE_ID,PER_NIVEAU_ID) VALUES (?, ?, ?,?, ?, ?, ?,?,?)");

			monStatementInsert.setString(1, entity.getmNom());
			monStatementInsert.setString(2, entity.getmPrenom());
			monStatementInsert.setString(3, entity.getmEmail());
			monStatementInsert.setString(4, entity.getmAdresse());
			monStatementInsert.setString(5, entity.getmTelephone());
			monStatementInsert.setString(6, entity.getmPassword());
			monStatementInsert.setDate(7, Date.valueOf(entity.getmAnneEnCours()));
			// monStatementInsert.setString(8, entity.type().name());
			monStatementInsert.setInt(8, entity.getmNiveau().getmId());
			monStatementInsert.setInt(9, entity.getSpecialite().getmId());

			monStatementInsert.execute();
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return entity;
	}

	@Override
	public Etudiant save(Etudiant entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		try {
			this.openConnection("gestionEtudiant", "root", "");

			PreparedStatement monStatementInsert = this.getConnecionSQL()
					.prepareStatement("DELETE FROM personne WHERE PRO_ID = ?");

			monStatementInsert.setInt(1, id);
			monStatementInsert.execute();

			return true;
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
			return false;
		}

		finally {
			this.closeConnection();
		}
	}

	@Override
	public boolean updatebyId(int id, Etudiant entity) {
		// TODO Auto-generated method stub
		return false;
	}


}
