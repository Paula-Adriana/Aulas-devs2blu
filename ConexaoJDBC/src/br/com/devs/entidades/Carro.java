package br.com.devs.entidades;

public class Carro {
	private int id;
	private String Placa;
	private String modelo;
	private String marca;

//	public Carro() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Carro(String placa, String modelo, String marca) {
		super();
		Placa = placa;
		this.modelo = modelo;
		this.marca = marca;
	}

	public Carro(int id, String placa, String modelo, String marca) {
		super();
		this.id = id;
		Placa = placa;
		this.modelo = modelo;
		this.marca = marca;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return Placa;
	}

	public void setPlaca(String placa) {
		Placa = placa;
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

}
