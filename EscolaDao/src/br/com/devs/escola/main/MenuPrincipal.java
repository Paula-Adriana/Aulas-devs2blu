package br.com.devs.escola.main;

import br.com.devs.escola.entidades.Aluno;
import br.com.devs.escola.entidades.Avaliacao;
import br.com.devs.escola.entidades.Disciplina;
import br.com.devs.escola.entidades.Matricula;
import br.com.devs.escola.entidadesDao.AlunoDao;
import br.com.devs.escola.entidadesDao.AvaliacaoDao;
import br.com.devs.escola.entidadesDao.DisciplinaDao;
import br.com.devs.escola.entidadesDao.MatriculaDao;
import br.com.devs.escola.uteis.Conexao;

public class MenuPrincipal {

	public static void main(String[] args) {
		// Chamando métodos
		// TestaConexao();
		// IncluirAluno();
		// ExcluirAluno();
		// AlterarAluno();
		// ListarTodos();
		// IncluirDisciplina();
		// ExcluirDisciplina();
		// ListarDisciplinas();
		// AlterarDisciplina();
		// incluirAvaliacao();
		// ExcluirAvaliacao();
		// ListarAvaliacoes();
		// AlterarAvaliacao();
		// incluirMatricula();
		// ExcluirMatricula();
		// ListarMatriculas();
		// AlterarMatricula();
	}

	// Aluno
	static void ListarTodos() {
		new AlunoDao().retornarListaAlunos();
	}

	static void ExcluirAluno() {
		new AlunoDao().ConfirmaExclusao(1);
	}

	static void AlterarAluno() {
		new AlunoDao().ConfirmaAlteracao();

	}

	static void IncluirAluno() {
		Aluno aluno = new Aluno().criaAluno();
		new AlunoDao().ConfirmaInclusao(aluno);

	}

	// Disciplina
	static void IncluirDisciplina() {
		Disciplina disciplina = new Disciplina().criaDisciplina();
		new DisciplinaDao().ConfirmaInclusao(disciplina);

	}

	static void ExcluirDisciplina() {
		new DisciplinaDao().ConfirmaExclusao(4);
	}

	static void ListarDisciplinas() {
		new DisciplinaDao().retornarListaDisciplina();
	}

	static void AlterarDisciplina() {
		new DisciplinaDao().ConfirmaAlteracao();

	}

	// Avaliacao
	static void incluirAvaliacao() {
		Avaliacao avaliacao = new Avaliacao().criaAvaliacao();
		new AvaliacaoDao().ConfirmaInclusao(avaliacao);
	}

	static void ExcluirAvaliacao() {
		new AvaliacaoDao().ConfirmaExclusao(0, 0, 2);
	}

	static void ListarAvaliacoes() {
		new AvaliacaoDao().retornarListaAvaliacoes();
	}

	static void AlterarAvaliacao() {
		new AvaliacaoDao().ConfirmaAlteracao();

	}

	// Matricula
	static void incluirMatricula() {
		Matricula matricula = new Matricula().criaMatricula();
		new MatriculaDao().ConfirmaInclusao(matricula);
	}

	static void ExcluirMatricula() {
		new MatriculaDao().ConfirmaExclusao(0, 0);
	}

	static void ListarMatriculas() {
		new MatriculaDao().retornarListaMatriculas();
	}

	static void AlterarMatricula() {
		new MatriculaDao().ConfirmaAlteracao();

	}

	static void TestaConexao() {
		if (Conexao.conectar() != null) {
			System.out.println("OK");
		} else {
			System.out.println("NÃO CONECTADO");

		}

	}
}
