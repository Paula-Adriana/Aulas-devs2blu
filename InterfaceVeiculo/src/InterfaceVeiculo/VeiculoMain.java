package InterfaceVeiculo;

public class VeiculoMain {

	public static void main(String[] args) {
		
		Automovel auto = new Automovel();
		System.out.println("O automóvel acelerou até " + auto.acelerar() + " Km/h" + " abasteceu " + auto.abastecer() + "lts");
		auto.frear();
		
		Moto moto = new Moto();
		System.out.println("A moto acelerou até " + moto.acelerar() + " Km/h" + " abasteceu " + moto.abastecer() + "lts");
		moto.frear();
		
	}

}
