package operadoresLogicos;

public class operadoresLogicos {

	public static void main(String[] args) {
		
		int numero1, numero2, numero3, numero4;
		numero1 = 10;
		numero2 = 10;
		
		if (numero1 == numero2) {
			System.out.println("Teste 1 - Ambos são iguais");
		}
		
		numero3 = 10;
		numero4 = 10;
		if ((numero1 == numero2) && (numero3 == numero4)) {
			System.out.println("Teste 2 - Todos são iguais");
		}
		
		numero3 = 10;
		numero4 = 20;
		if ((numero1 == numero2) || (numero3 == numero4)) {
			System.out.println("Teste 3 - Alguém é diferente");
		}
		
		numero1 = 10;
		numero2 = 20;
		numero3 = 10;
		numero4 = 20;
		if ((numero1 != numero2) || (numero3 == numero4)) {
			System.out.println("Teste 4 - Todos são diferentes");
	}

}}
