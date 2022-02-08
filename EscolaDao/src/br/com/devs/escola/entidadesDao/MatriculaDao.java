package br.com.devs.escola.entidadesDao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.devs.escola.entidades.Matricula;
import br.com.devs.escola.entidades.Matricula;
import br.com.devs.escola.entidades.Matricula;
import br.com.devs.escola.entidades.Matricula;
import br.com.devs.escola.entidades.Matricula;
import br.com.devs.escola.interfaces.InterfaceDao;
import br.com.devs.escola.uteis.Conexao;

public class MatriculaDao implements InterfaceDao<Matricula>{

	@Override
	public boolean incluir(Matricula t) {
			String sql = "insert into matricula (codAluno, codDisciplina,"
					+ " dataMatricula, statusMatricula) values(?,?,?,?)";
			try {
				PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
				stm.setInt(1, t.getCodAluno());
				stm.setInt(2, t.getCodDisciplina());
				stm.setDate(3, t.getDataMatricula());
				stm.setString(4, t.getStatusMatricula());
				stm.execute();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return true;
		}
		
		public boolean ConfirmaInclusao(Matricula matricula) {
			if (!incluir(matricula)) {
				System.out.println("NÃO FOI POSSÍVEL REALIZAR A INCLUSÃO!");
				return false;
			}
			System.out.println("MATRICULA SALVA COM SUCESSO NO BANCO DE DADOS!");
			return true;
		}
		
		public Matricula consultaUmaMatricula(int codAluno, int codDisciplina) {
			Matricula matricula = null;
			String sql = "select * from matricula where codAluno = " + codAluno + " and codDisciplina = " 
			+ codDisciplina;
			try {
					PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
					ResultSet rs = stm.executeQuery();
					
				if (rs.next()) {
					matricula = new Matricula (rs.getInt("codAluno"),
					rs.getInt("codDisciplina"),
					rs.getDate("dataMatricula"),
					rs.getString("statusMatricula"));
				}	
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return matricula;
		}

	@Override
	public boolean excluir(Matricula t) {
		String sql = "delete from matricula where codAluno = ? and codDisciplina = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setInt(1, t.getCodAluno());
			stm.setInt(2, t.getCodDisciplina());
			stm.execute();
		} catch (SQLException e) {
		   e.printStackTrace();
		}		
		return true;
	}

	public boolean ConfirmaExclusao (int codAluno, int codDisciplina) {
	Matricula matricula = new MatriculaDao().consultaUmaMatricula(0, 0);
	if (new MatriculaDao().excluir(matricula)) {
		System.out.println("MATRICULA EXCLUÍDA COM SUCESSO!");
		return true;
	}
	else {
		System.out.println("NÃO FOI POSSÍVEL REALIZAR A EXCLUSÃO!");
		return false;
	}
}
	
	@Override
	public List<Matricula> listar() {
		List<Matricula> matriculas = new ArrayList<>();
		String sql = "select * from matricula";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				matriculas.add(new Matricula(rs.getInt("codAluno"), rs.getInt("codDisciplina"),
						rs.getDate("dataMatricula"), rs.getString("statusMatricula")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return matriculas;
	}

	public void retornarListaMatriculas() {
		List<Matricula> matriculas = new MatriculaDao().listar();

		for (Matricula m : matriculas) {
			System.out.println("Código do aluno: " + m.getCodAluno());
			System.out.println("Nome da disciplina: " + m.getCodDisciplina());
			System.out.println("Data da matricula: " + m.getDataMatricula());
			System.out.println("Status da matricula: " + m.getStatusMatricula());
		}
	}

	@Override
	public boolean alterar(Matricula t) {
		String sql = "update matricula set codAluno = ?, codDisciplina = ?, dataMatricula = ?, statusMatricula = ?";
		sql += " where codAluno = ? and codDisciplina = ?";
		try (PreparedStatement stm = Conexao.conectar().prepareStatement(sql);) {
			stm.setInt(1, t.getCodAluno());
			stm.setInt(2, t.getCodDisciplina());
			stm.setDate(3, t.getDataMatricula());
			stm.setString(4, t.getStatusMatricula());
			stm.setInt(5, t.getCodAluno());
			stm.setInt(6, t.getCodDisciplina());
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public boolean ConfirmaAlteracao() {

		Matricula m = new MatriculaDao().consultaUmaMatricula(0,0);
		m.setStatusMatricula("R");

		if (!alterar(m)) {
			System.out.println("NÃO FOI POSSÍVEL REALIZAR A ALTERAÇÃO!");
			return false;
		}
		System.out.println("MATRICULA ALTERADA COM SUCESSO!");
		return true;
	}

}