package br.com.devs.escola.entidadesDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devs.escola.entidades.Aluno;
import br.com.devs.escola.entidades.Disciplina;
import br.com.devs.escola.interfaces.InterfaceDao;
import br.com.devs.escola.uteis.Conexao;

public class DisciplinaDao implements InterfaceDao<Disciplina> {

	@Override
	public boolean incluir(Disciplina t) {
		String sql = "insert into disciplina (nomeDisciplina, nomeProfessor,"
				+ " quantidadeDeAvaliacoes) values(?,?,?)";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setString(1, t.getNomeDisciplina());
			stm.setString(2, t.getNomeProfessor());
			stm.setInt(3, t.getQuantidadeDeAvaliacoes());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean ConfirmaInclusao(Disciplina disciplina) {
		if (!incluir(disciplina)) {
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A INCLUSÃO!");
			return false;
		}
		System.out.println("DISCIPLINA SALVA COM SUCESSO NO BANCO DE DADOS!");
		return true;
	}

	public Disciplina consultaUmaDisciplina(int codDisciplina) {
		Disciplina disciplina = null;
		String sql = "select * from disciplina where codDisciplina = " + codDisciplina;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();

			if (rs.next()) {
				disciplina = new Disciplina(rs.getInt("codDisciplina"), rs.getString("nomeDisciplina"),
						rs.getString("nomeProfessor"), rs.getInt("quantidadeDeAvaliacoes"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return disciplina;
	}

	@Override
	public boolean excluir(Disciplina t) {
		String sql = "delete from disciplina where codDisciplina = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setInt(1, t.getCodDisciplina());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean ConfirmaExclusao(int codDisciplina) {
		Disciplina disciplina = new DisciplinaDao().consultaUmaDisciplina(4);
		if (new DisciplinaDao().excluir(disciplina)) {
			System.out.println("DISCIPLINA EXCLUÍDA COM SUCESSO!");
			return true;
		} else {
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A EXCLUSÃO!");
			return false;
		}
	}

	@Override
	public List<Disciplina> listar() {
		List<Disciplina> disciplinas = new ArrayList<>();
		String sql = "select * from disciplina";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				disciplinas.add(new Disciplina(rs.getInt("codDisciplina"), rs.getString("nomeDisciplina"),
						rs.getString("nomeProfessor"), rs.getInt("quantidadeDeAvaliacoes")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return disciplinas;
	}

	public void retornarListaDisciplina() {
		List<Disciplina> disciplinas = new DisciplinaDao().listar();

		for (Disciplina d : disciplinas) {
			System.out.println("Código da disciplina: " + d.getCodDisciplina());
			System.out.println("Nome da disciplina: " + d.getNomeDisciplina());
			System.out.println("Nome do professor: " + d.getNomeProfessor());
			System.out.println("Quantidade de avaliacoes: " + d.getQuantidadeDeAvaliacoes());
		}
	}

	@Override
	public boolean alterar(Disciplina t) {
		String sql = "update disciplina set nomeDisciplina = ?, nomeProfessor = ?," + " QuantidadeDeAvaliacoes = ?";
		sql += " where codDisciplina = ?";
		try (PreparedStatement stm = Conexao.conectar().prepareStatement(sql);) {
			stm.setString(1, t.getNomeDisciplina());
			stm.setString(2, t.getNomeProfessor());
			stm.setInt(3, t.getQuantidadeDeAvaliacoes());
			stm.setInt(4, t.getCodDisciplina());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean ConfirmaAlteracao() {

		Disciplina d = new DisciplinaDao().consultaUmaDisciplina(1);
		d.setNomeDisciplina("Matemática");
		d.setNomeProfessor("Lurdes");
		d.setQuantidadeDeAvaliacoes(3);

		if (!alterar(d)) {
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A ALTERAÇÃO!");
			return false;
		}
		System.out.println("DISCIPLINA ALTERADA COM SUCESSO!");
		return true;
	}

}
