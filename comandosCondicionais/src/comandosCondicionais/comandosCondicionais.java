package comandosCondicionais;

public class comandosCondicionais {

	public static void main(String[] args) {
		//Comando condicional simples
		
		int idade = 10;
		if (idade < 18) {
			System.out.println("Menor de idade");
		}

		//Comando condicional composto com "else"
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
		
		//Comando condicional composto com "else"
		if (idade < 18) {
			System.out.println("Menor de idade");
		} else if (idade <= 64) {
			System.out.println("Adulto");
		} else if (idade <= 80) {
			System.out.println("Idoso");
		} else {
			System.out.println("Muito idoso");
		}
	}

}
