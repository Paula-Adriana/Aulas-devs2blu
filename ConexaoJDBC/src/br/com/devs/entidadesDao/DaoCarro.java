package br.com.devs.entidadesDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devs.entidades.Carro;
import br.com.devs.interfaces.InterfaceDao;
import br.com.devs.uteis.Conexao;

public class DaoCarro implements InterfaceDao<Carro> {
	//dao: classe que faz contato com o bd
	@Override
	public boolean salvar(Carro t) {
		String sql = "insert into carro (placa, marca, modelo) values (?,?,?)";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setString(1, t.getPlaca());
			stm.setString(2, t.getMarca());
			stm.setString(3, t.getModelo());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				Conexao.conectar().close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;
	}

	@Override
	public boolean update(Carro t) {
		String sql = "update carro set placa = ?, marca = ?, modelo = ?";
		sql += " where id = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setString(1, t.getPlaca());
			stm.setString(2, t.getMarca());
			stm.setString(3, t.getModelo());
			stm.setInt(4, t.getId());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean excluir(Carro t) {
		String sql = "delete from carro where id = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setInt(1, t.getId());
			stm.execute();
		} catch (SQLException e) {
		   e.printStackTrace();
		}		
		return true;
	}

	@Override
	public Carro retornarUm(int id) {
		Carro carro = null;
		String sql = "select * from carro where id = " + id;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				carro = new Carro (rs.getInt("id"), rs.getString("placa"),
						rs.getString("modelo"),rs.getString("marca"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return carro;
	}

	@Override
	public List<Carro> retornartodos() {
		List<Carro> carros = new ArrayList<>();
		String sql = "select * from carro";

		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				carros.add(new Carro(rs.getInt("id"), rs.getString("placa"),
						rs.getString("modelo"),rs.getString("marca")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return carros;
	}


	
}
