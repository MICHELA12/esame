package Manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Compagni;
import Utility.DbConnection;

public class CompagniManager {

	private Connection connection;

	public CompagniManager() {
		connection = DbConnection.getConnection();
	}

	public void addCompagno(Compagni compagno) {
		String sql = "INSERT INTO compagni (matricola, nome, cognome) values(?,?,?)";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, compagno.getMatricola());
			statement.setString(2, compagno.getNome());
			statement.setString(3, compagno.getCognome());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deleteCompagno(String matricola) {
		String sql = "DELETE FROM compagni WHERE Matricola=?";
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, matricola);
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void updateCompagno(Compagni compagno) {
		String sql = "UPDATE compagni SET nome=?,cognome=? WHERE matricola=?";
		PreparedStatement statement;
		try {
			statement = connection.prepareStatement(sql);
			statement.setString(1, compagno.getNome());
			statement.setString(2, compagno.getCognome());
			statement.setString(3, compagno.getMatricola());
			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Compagni selectCompagnoById(String matricola) {
		Compagni compagno = new Compagni();
		String sql = "SELECT * FROM compagni WHERE matricola=?";
		try {
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, matricola);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				compagno.setMatricola(rs.getString("matricola"));
				compagno.setNome(rs.getString("nome"));
				compagno.setCognome(rs.getString("cognome"));
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return compagno;
	}
	
	public List<Compagni> selectCompagni(){
		String sql = "SELECT * FROM compagni";
		List<Compagni> compagni = new ArrayList<Compagni>();
		Statement statement;
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				Compagni compagno = new Compagni();
				compagno.setMatricola(rs.getString("matricola"));
				compagno.setNome(rs.getString("nome"));
				compagno.setCognome(rs.getString("cognome"));
				compagni.add(compagno);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return compagni;
	}
}
