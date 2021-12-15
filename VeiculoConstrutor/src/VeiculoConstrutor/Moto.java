package VeiculoConstrutor;

public class Moto {
	private int velocidade;
	private float litragem;
	private String frenagem;
	private String tipoCombustivel;	
	
	public Moto(int velocidade, float litragem, String frenagem, String tipoCombustivel) {
		super();
		this.velocidade = velocidade;
		this.litragem = litragem;
		this.frenagem = frenagem;
		this.tipoCombustivel = tipoCombustivel;
	}
	
	public void listarDados() {
		System.out.println("Velocidade: " + this.velocidade + " km/h.");
		System.out.println("Litragem: " + this.litragem + "l.");
		System.out.println("Frenagem: " + this.frenagem);
		System.out.println("Tipo de combustível: " + this.tipoCombustivel);
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public float getLitragem() {
		return litragem;
	}
	public void setLitragem(float litragem) {
		this.litragem = litragem;
	}
	public String getFrenagem() {
		return frenagem;
	}
	public void setFrenagem(String frenagem) {
		this.frenagem = frenagem;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
	
	
	
	
	
	
	
	
	
}
