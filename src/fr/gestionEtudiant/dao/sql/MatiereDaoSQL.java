package fr.gestionEtudiant.dao.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.gestionEtudiant.dao.IMatiereDao;
import fr.gestionEtudiant.model.Matiere;

public class MatiereDaoSQL extends ConnectionDaoSQL implements IMatiereDao {


	@Override
	public List<Matiere> findAll() {
		// TODO Auto-generated method stub
		List<Matiere> matiereList = new ArrayList<>();
				
		try {
			this.openConnection("gestionEtudiant", "root", "");
			Statement monStatement;
			monStatement = this.getConnecionSQL().createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT * FROM matieres");
			
			while(monResultat.next()) {
				Matiere matiere = new Matiere(); 
				
				matiere.setId(monResultat.getInt("MAT_ID"));
				matiere.setmNom(monResultat.getString("MAT_NOM"));
				matiere.setmDescription(monResultat.getString("MAT_DESC"));
				
				matiereList.add(matiere);
				
				System.out.println("Chargement la ligne n�: "+monResultat.getInt("MAT_ID")+
						" de la liste des matieres reussi");
			}
		} catch (SQLException sqle) {
			// TODO Auto-generated catch block
			System.out.println("echec de chargement de la liste des matieres.");
			sqle.printStackTrace();
		} finally {
			this.closeConnection();
			return matiereList;
		}
	}

	@Override
	public Matiere findById(int id) {
		// TODO Auto-generated method stub
		Matiere matiere = new Matiere();
		//matiere = null;
		
		try {
			this.openConnection("gestionEtudiant", "root", "");
			
			Statement monStatement;
			monStatement = this.getConnecionSQL().createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT *FROM matieres WHERE MAT_ID ="+id);
			
			if (monResultat.next()) {
				matiere.setmNom(monResultat.getString("MAT_NOM"));
				matiere.setmDescription(monResultat.getString("MAT_DESC"));			
			}		
				System.out.println("Chargement la ligne n�: "+monResultat.getInt("MAT_ID")+
						" de la liste des matieres reussi");

		} catch (SQLException sqle) {
			// TODO Auto-generated catch block
			System.out.println("echec de chargement la matiere.");
			sqle.printStackTrace();
		} finally {
			this.closeConnection();
			return matiere;
		}
	}

	@Override
	public Matiere add(Matiere entity) {
		// TODO Auto-generated method stub
		try
		{
			this.openConnection("gestionEtudiant", "root", "");
			PreparedStatement monStatementInsert = this.getConnecionSQL()
					.prepareStatement( "INSERT INTO matieres(MAT_NOM, MAT_DESC) VALUES (?,?)");
			monStatementInsert.setString(1, entity.getmNom());
			monStatementInsert.setString(2, entity.getmDescription());
			
			monStatementInsert.execute();				
			return null;
		}catch (SQLException sqle) {
			sqle.printStackTrace();
		}finally {
			this.closeConnection();
			return entity;
		}
	}

	@Override
	public Matiere save(Matiere entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub		
		try {
			this.openConnection("gestionEtudiant", "root", "");
			
			PreparedStatement monStatementInsert = this.getConnecionSQL().prepareStatement("DELETE FROM matieres WHERE MAT_ID = ?");
			monStatementInsert.setInt(1, id);
			monStatementInsert.execute();
			return true;
		} catch (SQLException sqle) {
			// TODO Auto-generated catch block
			sqle.printStackTrace();
			return false;
		} finally {
			this.closeConnection();
		}
		
	}

	@Override
	public boolean updatebyId(int id, Matiere newMatiere) {
		// TODO Auto-generated method stub
				
		try {
			this.openConnection("gestionEtudiant", "root", "");
			PreparedStatement monStatementInsert = this.getConnecionSQL()
					.prepareStatement( "UPDATE matieres SET (MAT_NOM, MAT_DESC, WHERE MAT_ID)  VALUES (?,?,?)");
			monStatementInsert.setString(1, newMatiere.getmNom());
			monStatementInsert.setString(2, newMatiere.getmDescription());
			monStatementInsert.setInt(3, newMatiere.getmId());
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			this.closeConnection();
		}
	}

}
