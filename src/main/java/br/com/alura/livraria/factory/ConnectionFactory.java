package br.com.alura.livraria.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {

	    try {
	      String url = "jdbc:postgresql://localhost:5432/alura";
	      String user = "postgres";
	      String password = "nova1010";

	      Class.forName("org.postgresql.Driver");

	      Connection connection = DriverManager.getConnection(url, user, password);

	      return connection;
	    } catch (SQLException | ClassNotFoundException e) {
	      throw new RuntimeException(e);
	    }
	  }

}
