package br.com.alura.livraria.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.livraria.modelo.Autor;

public class AutorDao {

	private Connection connection;

	public AutorDao(Connection connection) {

		this.connection = connection;
	}

	public void cadastrar(Autor autor) {

		try {
			String sql = "insert into autores (name, email, date)  values(?, ?, ?);";

			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, autor.getName());
			ps.setString(2, autor.getEmail());
			ps.setDate(3, Date.valueOf(autor.getDate()));

			ps.execute();
		} catch (SQLException e) {
			throw new RuntimeException();
		}

	}

	public List<Autor> listar() {

		String sql = "SELECT * FROM autores;";

		PreparedStatement ps;
		try {
			ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			List<Autor> autores = new ArrayList<>();

			while (rs.next()) {
				Autor autor = new Autor();
				autor.setName(rs.getString("name"));
				autor.setEmail(rs.getString("email"));
				autor.setDate(rs.getDate("date").toLocalDate());

				autores.add(autor);
			}
			return autores;
		} catch (SQLException e) {
			throw new RuntimeException();
		}

	}

}
