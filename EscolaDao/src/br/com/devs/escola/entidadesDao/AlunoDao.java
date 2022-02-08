package br.com.devs.escola.entidadesDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devs.escola.entidades.Aluno;
import br.com.devs.escola.interfaces.InterfaceDao;
import br.com.devs.escola.uteis.Conexao;

public class AlunoDao implements InterfaceDao<Aluno> {

	@Override
	public boolean incluir(Aluno t) {
		String sql = "insert into aluno (nomeAluno, nomeMae, nomePai, dataNascimento, medaluno, statusAluno) values(?,?,?,?,?,?)";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setString(1, t.getNomeAluno());
			stm.setString(2, t.getNomeMae());
			stm.setString(3, t.getNomePai());
			stm.setDate(4, t.getDataNascimento());
			stm.setDouble(5, t.getMedAluno());
			stm.setString(6, t.getStatusAluno());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean ConfirmaInclusao(Aluno aluno) {
		if (!incluir(aluno)) {
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A INCLUSÃO!");
			return false;
		}

		System.out.println("ALUNO SALVO COM SUCESSO NO BANCO DE DADOS!");
		return true;
	}

	@Override
	public boolean alterar(Aluno t) {
		String sql = "update aluno set nomeAluno = ?, nomeMae = ?, nomePai = ?, dataNascimento = ?, medAluno = ?, statusAluno = ?";
		sql += " where codAluno = ?";
		try (PreparedStatement stm = Conexao.conectar().prepareStatement(sql);) {
			stm.setString(1, t.getNomeAluno());
			stm.setString(2, t.getNomeMae());
			stm.setString(3, t.getNomePai());
			stm.setDate(4, t.getDataNascimento());
			stm.setDouble(5, t.getMedAluno());
			stm.setString(6, t.getStatusAluno());
			stm.setInt(7, t.getCodAluno());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public boolean ConfirmaAlteracao() {
		Aluno a = new AlunoDao().consultaUmAluno(1);
		a.setNomeAluno("Iracema");
		
		if (!alterar(a)) {
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A ALTERAÇÃO!");
			return false;
		}

		System.out.println("ALUNO ALTERADO COM SUCESSO!");
		return true;
	}

	@Override
	public boolean excluir(Aluno t) {
		String sql = "delete from aluno where codAluno = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setInt(1, t.getCodAluno());
			stm.execute();
		} catch (SQLException e) {
		   e.printStackTrace();
		}		
		return true;
	}
	
	public boolean ConfirmaExclusao(int codAluno) {
		Aluno aluno = new AlunoDao().consultaUmAluno(4);
		if (new AlunoDao().excluir(aluno)) {
			System.out.println("ALUNO EXCLUÍDO COM SUCESSO!");
			return true;
		}
		else {
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A EXCLUSÃO!");
			return false;
		}
		
	}
	
	public Aluno consultaUmAluno(int codAluno) {
		Aluno aluno = null;
		String sql = "select * from aluno where codAluno = " + codAluno;
		try {
				PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
				ResultSet rs = stm.executeQuery();
					
			
			if (rs.next()) {
				aluno = new Aluno(rs.getInt("codAluno"),
				rs.getString("nomeAluno"),
				rs.getString("nomeMae"),
				rs.getString("nomePai"),
				rs.getDate("dataNascimento"),
				rs.getDouble("medAluno"),
				rs.getString("statusAluno"));
				
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aluno;
	}
	
	@Override
	public List<Aluno> listar() {
		List<Aluno> alunos = new ArrayList<>();
		String sql = "select * from aluno";
		try {
				PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
				ResultSet rs = stm.executeQuery();
					
			
			while (rs.next()) {
				alunos.add (new Aluno(rs.getInt("codAluno"),
				
				rs.getString("nomeAluno"),
				rs.getString("nomeMae"),
				rs.getString("nomePai"),
				rs.getDate("dataNascimento"),
				rs.getDouble("medAluno"),
				rs.getString("statusAluno")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alunos;
	}
	
	public void retornarListaAlunos() {
		List<Aluno> alunos = new AlunoDao().listar();
		
		for (Aluno a : alunos) {
			System.out.println("Código do aluno: " + a.getCodAluno());
			System.out.println("Nome do aluno: " + a.getNomeAluno());
			System.out.println("Nome da mãe: " + a.getNomeMae());
			System.out.println("Nome do pai: " + a.getNomePai());
			System.out.println("Data de nascimento: " + a.getDataNascimento());
		}
	}
	
	}


