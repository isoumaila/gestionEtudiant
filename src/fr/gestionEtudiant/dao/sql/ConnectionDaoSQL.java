package fr.gestionEtudiant.dao.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConnectionDaoSQL {
	
	private Connection connecionSQL;
	
	public void openConnection(String databaseName, String userName, String password) {
		try {
			 this.connecionSQL = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+databaseName+"?serverTimezone=UTC",
					userName, password);
			System.out.println("Connection ok ....");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void closeConnection() {
		try {
			this.connecionSQL.close();
			System.out.println("FIN DE LA CONNECTION ....");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public void openConnection() {
		try {
			 this.connecionSQL = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionEtudiant?serverTimezone=UTC",
					"root", "how set");
			System.out.println("Connection ok ....");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	

	protected Connection getConnecionSQL() {
		return connecionSQL;
	}

	protected void setConnecionSQL(Connection connecionSQL) {
		this.connecionSQL = connecionSQL;
	}

}
