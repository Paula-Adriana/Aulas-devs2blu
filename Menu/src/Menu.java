import java.util.Scanner;

public class Menu {
/*Programa mostra um Menu com op��es para o usu�rio.*/
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero;
		do {

			System.out.println();
			System.out.println("Escolha uma das op��es abaixo:");
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
				System.out.println("Voc� escolheu - Incluir");
				break;
			}
			case 2: {
				System.out.println("Voc� escolheu -  Alterar");
				break;
			}
			case 3: {
				System.out.println("Voc� escolheu - Excluir");
				break;
			}
			case 4: {
				System.out.println("Voc� escolheu - Consultar");
				break;
			}
			default:
				System.out.println("Op��o inv�lida");

			}
		} while (numero != 9);
		entrada.close();

	}
}
