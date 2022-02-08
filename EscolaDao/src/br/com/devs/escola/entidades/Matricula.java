package br.com.devs.escola.entidades;

import java.sql.Date;

public class Matricula {
	
	private int codAluno;
	private int codDisciplina;
	private Date dataMatricula;
	private String statusMatricula;
	
	public Matricula(int codAluno, int codDisciplina, Date dataMatricula, String statusMatricula) {
		this.codAluno = codAluno;
		this.codDisciplina = codDisciplina;
		this.dataMatricula = dataMatricula;
		this.statusMatricula = statusMatricula;
	}

	public Matricula() {
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

	public Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getStatusMatricula() {
		return statusMatricula;
	}

	public void setStatusMatricula(String statusMatricula) {
		this.statusMatricula = statusMatricula;
	}
	
	public Matricula criaMatricula() {
		Matricula matricula = new Matricula(0, 0, Date.valueOf("1977-2-9"), "A");
		return matricula;
	}
}
