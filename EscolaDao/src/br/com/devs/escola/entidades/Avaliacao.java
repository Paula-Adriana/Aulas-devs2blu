package br.com.devs.escola.entidades;

public class Avaliacao {
	
	private int codAluno;
	private int codDisciplina;
	private int nrAvaliacoes;
	private double valorNota;
	
	public Avaliacao(int codAluno, int codDisciplina, int nrAvaliacoes, double valorNota) {
		this.codAluno = codAluno;
		this.codDisciplina = codDisciplina;
		this.nrAvaliacoes = nrAvaliacoes;
		this.valorNota = valorNota;
	}

	public Avaliacao() {
		// TODO Auto-generated constructor stub
	}

	public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}

	public int getNrAvaliacoes() {
		return nrAvaliacoes;
	}

	public void setNrAvaliacoes(int nrAvaliacoes) {
		this.nrAvaliacoes = nrAvaliacoes;
	}

	public double getValorNota() {
		return valorNota;
	}

	public void setValorNota(double valorNota) {
		this.valorNota = valorNota;
	}
	
	public Avaliacao criaAvaliacao() {
		Avaliacao avaliacao = new Avaliacao(0, 0, 2, 8);
		return avaliacao;
	}
}
