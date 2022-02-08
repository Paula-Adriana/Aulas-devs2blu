package br.com.devs.escola.entidades;

public class Disciplina {
	
	private int codDisciplina;
	private String nomeDisciplina;
	private String nomeProfessor;
	private int quantidadeDeAvaliacoes;
	
	
	public Disciplina() {
	}

	public Disciplina(int codDisciplina, String nomeDisciplina, String nomeProfessor, int quantidadeDeAvaliacoes) {
		this.codDisciplina = codDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.nomeProfessor = nomeProfessor;
		this.quantidadeDeAvaliacoes = quantidadeDeAvaliacoes;
	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public int getQuantidadeDeAvaliacoes() {
		return quantidadeDeAvaliacoes;
	}

	public void setQuantidadeDeAvaliacoes(int quantidadeDeAvaliacoes) {
		this.quantidadeDeAvaliacoes = quantidadeDeAvaliacoes;
	}
	
	public Disciplina criaDisciplina() {
		Disciplina disciplina = new Disciplina (0, "Geografia","Souza", 3);
		return disciplina;
	}
	
}
