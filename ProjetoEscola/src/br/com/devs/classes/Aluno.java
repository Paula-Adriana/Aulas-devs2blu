package br.com.devs.classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import br.com.devs.util.Conexao;

public class Aluno {

	public Aluno() {
	}

	// Atributos
	private int codAluno;
	private String nomeAluno;
	private String nomeMae;
	private String nomePai;
	private String dataNascimento;
	private double medAluno;
	private String statusAluno;

	// getters and setters
	public int getCodAluno() {
		return codAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public double getMedAluno() {
		return medAluno;
	}

	public String getStatusAluno() {
		return statusAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public void setMedAluno(double mediaAluno) {
		this.medAluno = mediaAluno;
	}

	public void setStatusAluno(String statusAluno) {
		this.statusAluno = statusAluno;
	}

	// Incluir
	public boolean incluirAluno() {
		String sql = "insert into aluno (nomeAluno, nomeMae, "
				+ "nomePai, dataNascimento) values(?,?,?,?)";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setString(1, this.nomeAluno);
			stm.setString(2, this.nomeMae);
			stm.setString(3, this.nomePai);
			stm.setObject(4, this.formataDataNascimento(dataNascimento));
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	public static LocalDate formataDataNascimento(String dataNascimento) {
//		cria um formatador para que a data seja enviada ao banco de dados com um formato que ele entenda 
		DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("d/MM/yyyy");

//		converter de String para LocalDate
		LocalDate dataNasc = LocalDate.parse(dataNascimento, formatadorData);

		return dataNasc;
	}

	// Alterar
	public boolean alterarAluno() {
		String sql = "update aluno set nomeAluno = ?, nomeMae = ?, nomePai = ?, dataNascimento = ?";
		sql += " where codAluno = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setString(1, this.nomeAluno);
			stm.setString(2, this.nomeMae);
			stm.setString(3, this.nomePai);
			stm.setObject(4, this.formataDataNascimento(dataNascimento));
			stm.setInt(5, this.codAluno);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	// Consultar
	public Aluno consultarAluno(int codAluno) {

		Aluno aluno = new Aluno();
		String sql = "select * from aluno where codAluno = " + codAluno;
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			if (rs.next()) {
				aluno.setCodAluno(rs.getInt("codAluno"));
				aluno.setNomeAluno(rs.getString("nomeAluno"));
				aluno.setNomeMae(rs.getString("nomeMae"));
				aluno.setNomePai(rs.getString("nomePai"));
				aluno.setDataNascimento(rs.getString("dataNascimento"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aluno;
	}

	// Excluir
	public boolean excluirAluno(int codAluno) {
		String sql = "delete from aluno where codAluno = ?";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			stm.setInt(1, codAluno);
			stm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return true;
	}

	// Listar
	public List<Aluno> listarAlunos() {
		List<Aluno> alunos = new ArrayList<>();
		String sql = "select * from aluno";
		try {
			PreparedStatement stm = Conexao.conectar().prepareStatement(sql);
			ResultSet rs = stm.executeQuery();
			while (rs.next()) {
				Aluno aluno = new Aluno();
				aluno.setCodAluno(rs.getInt("codAluno"));
				aluno.setNomeAluno(rs.getString("nomeAluno"));
				aluno.setNomeMae(rs.getString("nomeMae"));
				aluno.setNomePai(rs.getString("nomePai"));
				aluno.setDataNascimento(rs.getString("dataNascimento"));
				alunos.add(aluno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alunos;
	}
}