package fr.gestionEtudiant.dao.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.gestionEtudiant.dao.ISpetialiteDao;
import fr.gestionEtudiant.model.Matiere;
import fr.gestionEtudiant.model.Niveau;
import fr.gestionEtudiant.model.Specialite;

public class SpecialiteDaoSQL extends ConnectionDaoSQL implements ISpetialiteDao{

	@Override
	public List<Specialite> findAll() {
		List<Specialite> specialiteList = new ArrayList<>();

		try {
			this.openConnection();

			Statement monStatement = this.getConnecionSQL().createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT * FROM specialites");

			while (monResultat.next()) {
				Specialite specialite = new Specialite();
				specialite.setmId(monResultat.getInt("SPE_ID"));
				specialite.setmNom(monResultat.getString("SPE_NOM"));
				specialite.setmDescription(monResultat.getString("SPE_DESC"));

				specialiteList.add(specialite);
			}
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return specialiteList;
	}

	@Override
	public Specialite findById(int id) {
		Specialite specialite = new Specialite();

		try {
			this.openConnection();

			Statement monStatement = this.getConnecionSQL().createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT * FROM specialites WHERE SPE_ID="+id);

			monResultat.next();
			specialite.setmId(monResultat.getInt("SPE_ID"));
			specialite.setmNom(monResultat.getString("SPE_NOM"));
			specialite.setmDescription(monResultat.getString("SPE_DESC"));

				return specialite;
		}

		catch (SQLException sqle) {
		
			sqle.printStackTrace();
			return specialite;
		}

		finally {
			this.closeConnection();
		}

	
	}

	@Override
	public Specialite add(Specialite entity) {
		try {
			this.openConnection();
			
			PreparedStatement monStatementInsert = this.getConnecionSQL()
					.prepareStatement
					("INSERT INTO specialites(spe_nom,spe_desc) VALUES(?,?)");
			
			monStatementInsert.setString(1, entity.getmNom());
			monStatementInsert.setString(2, entity.getmDescription());
			
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
	public Specialite save(Specialite entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		try {
			this.openConnection();
			
			PreparedStatement monStatementInsert = this.getConnecionSQL().prepareStatement("DELETE FROM specialites WHERE NIV_ID = ?");
			
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
	public boolean updatebyId(int id, Specialite entity) {
		// TODO Auto-generated method stub
		return false;
	}

}
