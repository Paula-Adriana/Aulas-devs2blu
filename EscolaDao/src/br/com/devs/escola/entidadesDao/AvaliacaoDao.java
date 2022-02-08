package br.com.devs.escola.entidadesDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devs.escola.entidades.Avaliacao;
import br.com.devs.escola.interfaces.InterfaceDao;
import br.com.devs.escola.uteis.Conexao;

public class AvaliacaoDao implements InterfaceDao<Avaliacao>{

	@Override
		public boolean incluir(Avaliacao t) {
			String sql = "insert into avaliacao (codAluno, codDisciplina,"
					+ " nrAvaliacoes, valorNota) values(?,?,?,?)";
			try {
				PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
				stm.setInt(1, t.getCodAluno());
				stm.setInt(2, t.getCodDisciplina());
				stm.setInt(3, t.getNrAvaliacoes());
				stm.setDouble(4, t.getValorNota());
				stm.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return true;
		}
		
		public boolean ConfirmaInclusao(Avaliacao avaliacao) {
			if (!incluir(avaliacao)) {
				System.out.println("NÃO FOI POSSÍVEL REALIZAR A INCLUSÃO!");
				return false;
			}
			System.out.println("AVALIAÇÃO SALVA COM SUCESSO NO BANCO DE DADOS!");
			return true;
		}

		public Avaliacao consultaUmaAvaliacao(int codAluno, int codDisciplina, double nrAvaliacoes) {
			Avaliacao avaliacao = null;
			String sql = "select * from avaliacao where codAluno = " + codAluno + " and codDisciplina = " 
			+ codDisciplina + " and nrAvaliacoes = " + nrAvaliacoes;
			try {
					PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
					ResultSet rs = stm.executeQuery();
					
				if (rs.next()) {
					avaliacao = new Avaliacao (rs.getInt("codAluno"),
					rs.getInt("codDisciplina"),
					rs.getInt("nrAvaliacoes"),
					rs.getDouble("valorNota"));
				}	
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return avaliacao;
		}
		
	@Override
	public boolean excluir(Avaliacao t) {
		String sql = "delete from avaliacao where codAluno = ? and codDisciplina = ? and nrAvaliacoes = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setInt(1, t.getCodAluno());
			stm.setInt(2, t.getCodDisciplina());
			stm.setDouble(3, t.getNrAvaliacoes());
			stm.execute();
		} catch (SQLException e) {
		   e.printStackTrace();
		}		
		return true;
	}
	
	public boolean ConfirmaExclusao (int codAluno, int codDisciplina, double nrAvaliacoes) {
		Avaliacao avaliacao = new AvaliacaoDao().consultaUmaAvaliacao(0,0,2);
		if (new AvaliacaoDao().excluir(avaliacao)) {
			System.out.println("AVALIACAO EXCLUÍDA COM SUCESSO!");
			return true;
		}
		else {
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A EXCLUSÃO!");
			return false;
		}
	}

	@Override
	public List<Avaliacao> listar() {
		List<Avaliacao> avaliacoes = new ArrayList<>();
		String sql = "select * from Avaliacao";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				avaliacoes.add(new Avaliacao(rs.getInt("codAluno"), rs.getInt("codDisciplina"),
						rs.getInt("nrAvaliacoes"), rs.getDouble("valorNota")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return avaliacoes;
	}

	public void retornarListaAvaliacoes() {
		List<Avaliacao> avaliacoes = new AvaliacaoDao().listar();

		for (Avaliacao a : avaliacoes) {
			System.out.println("Código do aluno: " + a.getCodAluno());
			System.out.println("Nome da disciplina: " + a.getCodDisciplina());
			System.out.println("Número de avaliações: " + a.getNrAvaliacoes());
			System.out.println("Valor da nota: " + a.getValorNota());
		}
	}

	@Override
	public boolean alterar(Avaliacao t) {
		String sql = "update avaliacao set codAluno = ?, codDisciplina = ?, nrAvaliacoes = ?, valorNota = ?";
		sql += " where codAluno = ? and codDisciplina = ? and nrAvaliacoes = ?";
		try (PreparedStatement stm = Conexao.conectar().prepareStatement(sql);) {
			stm.setInt(1, t.getCodAluno());
			stm.setInt(2, t.getCodDisciplina());
			stm.setInt(3, t.getNrAvaliacoes());
			stm.setDouble(4, t.getValorNota());
			stm.setInt(5, t.getCodAluno());
			stm.setInt(6, t.getCodDisciplina());
			stm.setInt(7, t.getNrAvaliacoes());
			
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean ConfirmaAlteracao() {

		Avaliacao a = new AvaliacaoDao().consultaUmaAvaliacao(0,0,3);
		a.setValorNota(8);

		if (!alterar(a)) {
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A ALTERAÇÃO!");
			return false;
		}
		System.out.println("AVALIACAO ALTERADA COM SUCESSO!");
		return true;
	}

}
