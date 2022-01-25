package br.com.devs.entidadesDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devs.entidades.Caneta;
import br.com.devs.interfaces.InterfaceDao;
import br.com.devs.uteis.Conexao;

public class DaoCaneta implements InterfaceDao<Caneta> {

	@Override
	public boolean update(Caneta t) {
		String sql = "update caneta set cor = ?, ponta = ?, marca = ?";
		sql += " where id = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setString(1, t.getCor());
			stm.setFloat(2, t.getPonta());
			stm.setString(3, t.getMarca());
			stm.setInt(4, t.getId());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public Caneta retornarUm(int id) {
		Caneta caneta = null;
		String sql = "select * from caneta where id = " + id;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				caneta = new Caneta (rs.getInt("id"), rs.getString("cor"),
						rs.getFloat("ponta"),rs.getString("marca"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return caneta;
	}

	@Override
	public List<Caneta> retornartodos() {
		List<Caneta> canetas = new ArrayList<>();
		String sql = "select * from caneta";

		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				canetas.add(new Caneta(rs.getInt("id"), rs.getString("cor"),
						rs.getFloat("ponta"),rs.getString("marca")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return canetas;
	}

	@Override
	public boolean salvar(Caneta t) {
		String sql = "insert into caneta (cor, ponta, marca) values (?,?,?)";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setString(1, t.getCor());
			stm.setFloat(2, t.getPonta());
			stm.setString(3, t.getMarca());
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
	public boolean excluir(Caneta t) {
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

}
