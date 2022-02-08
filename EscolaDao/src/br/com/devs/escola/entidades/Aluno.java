package br.com.devs.escola.entidades;

import java.sql.Date;

public class Aluno {

	private int codAluno;
	private String nomeAluno;
	private String nomeMae;
	private String nomePai;
	private Date dataNascimento;
	private double medAluno;
	private String statusAluno;
	
	
	public Aluno(int codAluno, String nomeAluno, String nomeMae, String nomePai, Date dataNasc, double medAluno, String statusAluno) {
		this.codAluno = codAluno;
		this.nomeAluno = nomeAluno;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.dataNascimento = dataNasc;
		this.medAluno = medAluno;
		this.statusAluno = statusAluno;
	}

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date DataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getMedAluno() {
		return medAluno;
	}

	public void setMedAluno(double medAluno) {
		this.medAluno = medAluno;
	}

	public String getStatusAluno() {
		return statusAluno;
	}

	public void setStatusAluno(String statusAluno) {
		this.statusAluno = statusAluno;
	}
	
	public Aluno criaAluno() {
		Aluno aluno = new Aluno (0, "Lindalva", "Mãe da Lindalva", "Pai da Lindalva", Date.valueOf("1980-2-9"), 0.0, "");
		return aluno;
	}
	
}
