package VeiculoConstrutor;

public class Veiculo {

	public static void main(String[] args) {
		
		Automovel auto = new Automovel(80, 44, "M�dia", "Gas.aditivada");
		auto.listarDados();
		
		Moto moto = new Moto(100, 10, "M�dia", "Alcool");
		moto.listarDados();
		
		

	}

}
