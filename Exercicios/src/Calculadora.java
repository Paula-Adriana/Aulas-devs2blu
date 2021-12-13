import java.util.Scanner;

public class Calculadora {
/*Programa de calculadora em que o usuário escolhe a opção matemática disponível*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero, n1, n2;

		do {
			System.out.println();
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Somar");
			System.out.println("2 - Subtrair");
			System.out.println("3 - Multiplicar");
			System.out.println("4 - Dividir");
			System.out.println("9 - Sair");
			numero = entrada.nextInt();
			if (numero == 9) {
				System.out.println("Programa encerrado!");
				break;
			}

			switch (numero) {
			case 1: {
				System.out.println("Você escolheu - Soma!");
				System.out.print("Digite o primeiro número: ");
				n1 = entrada.nextInt();
				System.out.print("Digite o segundo número: ");
				n2 = entrada.nextInt();
				System.out.println("O resultado é: " + (n1 + n2));
				break;
			}
			case 2: {
				System.out.println("Você escolheu -  Subtração!");
				System.out.print("Digite o primeiro número: ");
				n1 = entrada.nextInt();
				System.out.print("Digite o segundo número: ");
				n2 = entrada.nextInt();
				System.out.println("O resultado é: " + (n1 - n2));
				break;
			}
			case 3: {
				System.out.println("Você escolheu - Multiplicação!");
				System.out.print("Digite o primeiro número: ");
				n1 = entrada.nextInt();
				System.out.print("Digite o segundo número: ");
				n2 = entrada.nextInt();
				System.out.println("O resultado é: " + (n1 * n2));
				break;
			}
			case 4: {
				System.out.println("Você escolheu - Divisão!");
				System.out.print("Digite o primeiro número: ");
				n1 = entrada.nextInt();
				System.out.print("Digite o segundo número: ");
				n2 = entrada.nextInt();
				while (n2 == 0) {
					System.out.print("Informe um número diferente de zero: ");
					n2 = entrada.nextInt();
				}
				System.out.println("O resultado é: " + (n1 / n2) + " e o resto da divisão é: " + (n1 % n2));
				break;
			}
			default:
				System.out.println("Opção inválida");

			}
		}
		while (numero != 9);
		entrada.close();

	}

}
