package fr.gestionEtudiant.dao.sql;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.gestionEtudiant.dao.INiveauDao;
import fr.gestionEtudiant.model.Niveau;

public class NiveauDaoSQL extends ConnectionDaoSQL implements INiveauDao {

	@Override
	public List<Niveau> findAll() {
		List<Niveau> niveauList = new ArrayList<>();

		try {
			this.openConnection();

			Statement monStatement = this.getConnecionSQL().createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT * FROM niveau");

			while (monResultat.next()) {
				Niveau niveau = new Niveau();
				niveau.setmId(monResultat.getInt("NIV_ID"));
				niveau.setmNom(monResultat.getString("NIV_NOM"));
				niveau.setmDescription(monResultat.getString("NIV_DESC"));

				niveauList.add(niveau);
			}
		}

		catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		finally {
			this.closeConnection();
		}

		return niveauList;
	}

	@Override
	public Niveau findById(int id) {
		Niveau niveau = new Niveau();

		try {
			this.openConnection();

			String query = "SELECT * FROM niveau WHERE NIV_ID=" + id + ";";
			PreparedStatement pst = this.getConnecionSQL().prepareStatement(query);
			boolean isResult = pst.execute();
			ResultSet monResultat = pst.getResultSet();
			monResultat.next();
			niveau.setmId(monResultat.getInt("NIV_ID"));
			niveau.setmNom(monResultat.getString("NIV_NOM"));
			niveau.setmDescription(monResultat.getString("NIV_DESC"));

			return niveau;
		}

		catch (SQLException sqle) {

			sqle.printStackTrace();
			return niveau;
		}

		finally {
			this.closeConnection();
		}

	}

	@Override
	public Niveau add(Niveau entity) {
		try {
			this.openConnection();

			PreparedStatement monStatementInsert = this.getConnecionSQL()
					.prepareStatement("INSERT INTO niveau(niv_nom,niv_desc) VALUES(?,?)");

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
	public Niveau save(Niveau entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		try {
			this.openConnection();

			PreparedStatement monStatementInsert = this.getConnecionSQL()
					.prepareStatement("DELETE FROM niveau WHERE NIV_ID = ?");

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

}
