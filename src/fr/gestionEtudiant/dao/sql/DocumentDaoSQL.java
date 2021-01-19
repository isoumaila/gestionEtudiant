package fr.gestionEtudiant.dao.sql;
//import java.util.Date;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.gestionEtudiant.dao.IDocumentDao;
import fr.gestionEtudiant.enumeration.DocumentType;
import fr.gestionEtudiant.enumeration.PersonneType;
import fr.gestionEtudiant.model.Document;
import fr.gestionEtudiant.model.Matiere;

public class DocumentDaoSQL extends ConnectionDaoSQL implements IDocumentDao  {

	@Override
	public List<Document> findAll() {
		// TODO Auto-generated method stub
	List<Document> documentList = new ArrayList<>();
		
		try {
			this.openConnection("gestionEtudiant", "root", "");
			Statement monStatement;
			monStatement = this.getConnecionSQL().createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT * FROM document");
			
			while(monResultat.next()) {
				Document document = new Document(); 
				
				document.setmId(monResultat.getInt("DOC_ID"));
				document.setmNom(monResultat.getString("DOC_NOM"));
				document.setmDate(monResultat.getDate("DOC_DATE").toLocalDate()); //LocalDateTime
				document.setmType((DocumentType)monResultat.getObject("DOC_TYPE"));
				
				if (document.getmType().equals(PersonneType.Etudiant)) {
					EtudiantDaoSQL etudiantSql = new EtudiantDaoSQL();
					document.setmPersonne(etudiantSql.findById(monResultat.getInt("DOC_PER_ID"))); 		
				} 
				else if (document.getmType().equals(PersonneType.Professeur)) {
					System.out.println("Extraction de prof pas encore creer");
				}
				else if (document.getmType().equals(PersonneType.Administrateur)) {
					System.out.println("Extraction d'Admin pas encore creer");
				}
				MatiereDaoSQL matiereSql = new MatiereDaoSQL();
				document.setmMatiere(matiereSql.findById(monResultat.getInt(" DOC_MAT_ID")));
								
				documentList.add(document);
				
				System.out.println("Chargement la ligne n�: "+monResultat.getInt("DOC_ID")+
						" de la liste des matieres reussi");
			}
		} catch (SQLException sqle) {
			// TODO Auto-generated catch block
			System.out.println("echec de chargement de la liste des matieres.");
			sqle.printStackTrace();
		} finally {
			this.closeConnection();
			return documentList;
		}
	}

	@Override
	public Document findById(int id) {
		// TODO Auto-generated method stub
		Document document = new Document();
		//matiere = null;
		
		try {
			this.openConnection("gestionEtudiant", "root", "");
			
			Statement monStatement;
			monStatement = this.getConnecionSQL().createStatement();
			ResultSet monResultat = monStatement.executeQuery("SELECT *FROM Document WHERE DOC_ID ="+id);
			
			if (monResultat.next()) {
				document.setmId(monResultat.getInt("DOC_ID"));
				document.setmNom(monResultat.getString("DOC_NOM"));
				document.setmDate(monResultat.getDate("DOC_DATE").toLocalDate()); //LocalDateTime
				document.setmType((DocumentType)monResultat.getObject("DOC_TYPE"));
				
				if (document.getmType().equals(PersonneType.Etudiant)) {
					EtudiantDaoSQL etudiantSql = new EtudiantDaoSQL();
					document.setmPersonne(etudiantSql.findById(monResultat.getInt("DOC_PER_ID"))); 		
				} 
				else if (document.getmType().equals(PersonneType.Professeur)) {
					System.out.println("Extraction de prof pas encore creer");
				}
				else if (document.getmType().equals(PersonneType.Administrateur)) {
					System.out.println("Extraction d'Admin pas encore creer");
				}
				MatiereDaoSQL matiereSql = new MatiereDaoSQL();
				document.setmMatiere(matiereSql.findById(monResultat.getInt(" DOC_MAT_ID")));
												
				System.out.println("Chargement la ligne n�: "+monResultat.getInt("DOC_ID")+
						" de la liste des matieres reussi");
		} 
			}catch (SQLException sqle) {
			// TODO Auto-generated catch block
			System.out.println("echec de chargement du document.");
			sqle.printStackTrace();
		} finally {
			this.closeConnection();
			return document;
		}
	}

	@Override
	public boolean updatebyId(int id, Document newDocument) {
		// TODO Auto-generated method stub
		try {
			this.openConnection("gestionEtudiant", "root", "");
			PreparedStatement monStatementInsert = this.getConnecionSQL()
					.prepareStatement( "UPDATE document SET (DOC_NOM, DOC_DATE, DOC_TYPE,DOC_PER_ID,DOC_MAT_ID, WHERE DOC_ID)  VALUES (?,?,?,?,?)");
			
			monStatementInsert.setString(1, newDocument.getmNom());
			monStatementInsert.setDate(2,Date.valueOf(newDocument.getmDate()));
			monStatementInsert.setString(3,String.valueOf(newDocument.getmType()));
			monStatementInsert.setInt(4, newDocument.getmPersonne().getmId());
			monStatementInsert.setInt(5, newDocument.getmMatiere().getId());
			
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			this.closeConnection();
		}
	}

	@Override
	public Document add(Document entity) {
		// TODO Auto-generated method stub
		try
		{
			this.openConnection("gestionEtudiant", "root", "");
			PreparedStatement monStatementInsert = this.getConnecionSQL()
					.prepareStatement( "INSERT INTO Document(DOC_NOM, DOC_DATE, DOC_TYPE, DOC_PER_ID, DOC_MAT_ID) VALUES (?,?,?,?,?)");
			
			monStatementInsert.setString(1, entity.getmNom());
			monStatementInsert.setDate(2,Date.valueOf(entity.getmDate()));
			monStatementInsert.setString(3,String.valueOf(entity.getmType()));
			monStatementInsert.setInt(4, entity.getmPersonne().getmId());
			monStatementInsert.setInt(5, entity.getmMatiere().getId());
					
			monStatementInsert.execute();				
		}catch (SQLException sqle) {
			sqle.printStackTrace();
		}finally {
			this.closeConnection();
			return entity;
		}
	}

	@Override
	public Document save(Document entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		try {
			this.openConnection("gestionEtudiant", "root", "");
			
			PreparedStatement monStatementInsert = this.getConnecionSQL().prepareStatement("DELETE FROM document WHERE DOC_ID = ?");
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


}
