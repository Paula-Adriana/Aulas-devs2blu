package br.com.devs.entidades;

public class Caneta {
	// escreve atributos
	private int id;
	private String cor;
	private float ponta;
	private String marca;

	
	
	public Caneta(String cor, float ponta, String marca) {
		super();
		this.cor = cor;
		this.ponta = ponta;
		this.marca = marca;
	}

	public Caneta(int id, String cor, float ponta, String marca) {
		super();
		this.id = id;
		this.cor = cor;
		this.ponta = ponta;
		this.marca = marca;
	}

	// Gera getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPonta() {
		return ponta;
	}

	public void setPonta(float ponta) {
		this.ponta = ponta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}