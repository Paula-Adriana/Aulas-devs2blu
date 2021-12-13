
public class EmpresaRH {

	public static void main(String[] args) {
		
		Gerencia ger = new Gerencia();
		System.out.println("Dados do Gerente");
		ger.nome      = "Roberto Fonseca";
		ger.descDepto = "Gerencia de TI";
		ger.comissao  = 0.02f; // 2%
		ger.salario   = 12500.00f;
	    ger.listarGerente();
		
		System.out.println("Dados do Presidente");
		Presidente pre = new Presidente();
		pre.nome    = "Carlos Antonio Meirelles";
		pre.salario = 30000.00f;
		pre.nrAcionistas = 28;
		
		Diretoria dir = new Diretoria();
		dir.rentabilidade = 0.10f;
				
	}

}
