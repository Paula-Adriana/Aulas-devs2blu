package InterfaceVeiculo;

public class Automovel implements Veiculo {

	@Override
	public int acelerar() {
		int velocidade = 80;
		return velocidade;
	}

	@Override
	public float abastecer() {
		float litragem = 44f;
		return litragem;
	}

	@Override
	public void frear() {
		System.out.println("Automóvel freou");
	}
	

}
