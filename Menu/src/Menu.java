import java.util.Scanner;

public class Menu {
/*Programa mostra um Menu com opções para o usuário.*/
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		do {

			System.out.println();
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Incluir");
			System.out.println("2 - Alterar");
			System.out.println("3 - Excluir");
			System.out.println("4 - Consultar");
			System.out.println("9 - Sair");
			numero = entrada.nextInt();
			if (numero == 9) {
				System.out.println("Programa encerrado!");
				break;
			}

			switch (numero) {
			case 1: {
				System.out.println("Você escolheu - Incluir");
				break;
			}
			case 2: {
				System.out.println("Você escolheu -  Alterar");
				break;
			}
			case 3: {
				System.out.println("Você escolheu - Excluir");
				break;
			}
			case 4: {
				System.out.println("Você escolheu - Consultar");
				break;
			}
			default:
				System.out.println("Opção inválida");

			}
		} while (numero != 9);
		entrada.close();

	}
}
