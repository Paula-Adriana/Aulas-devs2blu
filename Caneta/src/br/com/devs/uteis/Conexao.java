package br.com.devs.uteis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	static final String url = "jdbc:postgresql://localhost:5432/postgres";
	static final String user = "postgres";
	static final String password = "123";

	public static Connection conectar() {
		Connection con = null;
		try {
			Class.forName("org.postgresql.Driver"); // responsável por garantir que a classe do
													// driver fosse carregada. Uma vez carregada, a classe efetua o seu
													// próprio registro como um driver SQL, passando a ser reconhecido
													// pela classe DriverManager como tal.
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		return con;
	}

}
