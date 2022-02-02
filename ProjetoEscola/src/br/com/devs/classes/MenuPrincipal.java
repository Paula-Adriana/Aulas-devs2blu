package br.com.devs.classes;

import java.util.List;

import br.com.devs.util.Conexao;

public class MenuPrincipal {

	public static void main(String[] args) {
		// teste chamando métodos
		//TestaConexao();
		incluirAluno();
		//excluirAluno();
		//alterarAluno();
		//consultarAluno();
		//listarTodos();
	}
	
	static void listarTodos() {
		List<Aluno> listaaluno = new Aluno().listarAlunos();
		for(Aluno a : listaaluno) {
			System.out.println(a.getCodAluno());
			System.out.println(a.getNomeAluno());
			System.out.println(a.getNomeMae());
			System.out.println(a.getNomePai());
			System.out.println(a.getDataNascimento());
		}		
	}
	static void alterarAluno() {
		Aluno aluno = new Aluno().consultarAluno(2);
		aluno.setNomeAluno("José");
		aluno.setNomeMae("Mae do José");
		aluno.setNomePai("Pai do José");
		aluno.setDataNascimento("01/10/1980");
		
		if(aluno.alterarAluno()) {
			System.out.println("Aluno alterado com sucesso");
		}
	}
	
	
	static void excluirAluno() {
		Aluno aluno = new Aluno();
		if (aluno.excluirAluno(5)) {
			System.out.println("Aluno excluido com sucesso");
		}
	}

	static void incluirAluno() {
		Aluno aluno = new Aluno();
		aluno.setNomeAluno("Maria");
		aluno.setNomeMae("Mãe da Maria");
		aluno.setNomePai("Pai da Maria");
		aluno.setDataNascimento("02/06/1988");

		if (aluno.incluirAluno()) {
			System.out.println("Aluno salvo com sucesso");
		}
	}
	
	
	static void consultarAluno() {
		Aluno aluno = new Aluno().consultarAluno(1);
		System.out.println(aluno.getCodAluno());
		System.out.println(aluno.getNomeAluno());
		System.out.println(aluno.getNomeMae());
		System.out.println(aluno.getNomePai());
		System.out.println(aluno.getDataNascimento());
	}
	
	static void TestaConexao() {
		if (Conexao.conectar() != null) {
			System.out.println("OK");
		} else {
			System.out.println("NÃO CONECTADO");

		}
	}

}
