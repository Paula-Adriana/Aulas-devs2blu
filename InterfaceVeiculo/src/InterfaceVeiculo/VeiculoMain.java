package InterfaceVeiculo;

public class VeiculoMain {

	public static void main(String[] args) {
		
		Automovel auto = new Automovel();
		System.out.println("O autom�vel acelerou at� " + auto.acelerar() + " Km/h" + " abasteceu " + auto.abastecer() + "lts");
		auto.frear();
		
		Moto moto = new Moto();
		System.out.println("A moto acelerou at� " + moto.acelerar() + " Km/h" + " abasteceu " + moto.abastecer() + "lts");
		moto.frear();
		
	}

}
