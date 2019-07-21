package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	
	private static Connection connection = null;
	
	public static Connection getConnection() {
		if (connection != null) {
			return connection;
		}else {
			String driver = "com.mysql.cj.jdbc.Driver";
			String url ="jdbc:mysql://localhost:3306/ProvaEsame?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(url,"root","");
			} catch (ClassNotFoundException e) {
				System.out.println("errore con class.forName");
				e.printStackTrace();
			} catch (SQLException e) {
				System.out.println("errore con getConnection");
				e.printStackTrace();
			}
			
			return connection;
		}
	}
}
