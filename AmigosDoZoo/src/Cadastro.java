import java.util.Date;

public class Cadastro {
	
	private int codigoAnimal; 
	private char tipoAnimal;
	private String especie; 
	private int idadeAnimal;
	private Date dataChegada;
	private Date dataLiberacao;
	private String apelido;
	private char sexo;
	private String padraoCorPelo;
	private boolean filhote;
	private int quantidadeFilhotes;
	
	public void listaAnimal() {
		System.out.println("Código: " + codigoAnimal);
		System.out.println("Apelido: " + apelido);
		System.out.println("Espécie: " + especie);
	}

	public int getCodigoAnimal() {
		return codigoAnimal;
	}

	public void setCodigoAnimal(int codigoAnimal) {
		this.codigoAnimal = codigoAnimal;
	}

	public char getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(char tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public int getIdadeAnimal() {
		return idadeAnimal;
	}

	public void setIdadeAnimal(int idadeAnimal) {
		this.idadeAnimal = idadeAnimal;
	}

	public Date getDataChegada() {
		return dataChegada;
	}

	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}

	public Date getDataLiberacao() {
		return dataLiberacao;
	}

	public void setDataLiberacao(Date dataLiberacao) {
		this.dataLiberacao = dataLiberacao;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getPadraoCorPelo() {
		return padraoCorPelo;
	}

	public void setPadraoCorPelo(String padraoCorPelo) {
		this.padraoCorPelo = padraoCorPelo;
	}

	public boolean isFilhote() {
		return filhote;
	}

	public void setFilhote(boolean filhote) {
		this.filhote = filhote;
	}

	public int getQuantidadeFilhotes() {
		return quantidadeFilhotes;
	}

	public void setQuantidadeFilhotes(int quantidadeFilhotes) {
		this.quantidadeFilhotes = quantidadeFilhotes;
	}
	
	
	
	
	
	
	
}
