package InterfaceVeiculo;

public class Moto implements Veiculo {

	@Override
	public int acelerar() {
		int velocidade = 60;
		return velocidade;
	}

	@Override
	public float abastecer() {
		float litragem = 8;
		return litragem;
	}

	@Override
	public void frear() {
		System.out.println("A moto freou");
	}
}
