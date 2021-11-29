package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBD {
	
	
	private static String dns = "jdbc:mysql://localhost:3306/impostor?useTimezone=true&serverTimezone=UTC";
	private static String usuario = "root";
	private static String senha = "";
	private static Connection con;
		
	//M�todo que faz a conex�o efetivamente
	public Connection conectaBD() {
		try {
			if(con == null || con.isClosed()) {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				con = DriverManager.getConnection(dns,usuario,senha);
			}
			return con;
		} catch (SQLException e) {
			System.out.println("Erro ao conectar ao SGBD: "+e);
			return null;
		}
	}
}