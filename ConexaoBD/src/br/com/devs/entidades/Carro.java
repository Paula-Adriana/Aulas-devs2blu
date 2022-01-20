package br.com.devs.entidades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Carro {
	int id;
	String placa;
	String modelo;
	String marca;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean salvar() {
		Connection con = Conexao.conectar();
		
		String sql = "insert into carro (placa, marca, modelo) values (?,?,?)";
		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, this.placa);
			stm.setString(2, this.marca);
			stm.setString(3, this.modelo);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
}
