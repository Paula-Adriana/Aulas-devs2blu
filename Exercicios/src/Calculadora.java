import java.util.Scanner;

public class Calculadora {
/*Programa de calculadora em que o usu�rio escolhe a op��o matem�tica dispon�vel*/
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numero, n1, n2;

		do {
			System.out.println();
			System.out.println("Escolha uma das op��es abaixo:");
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
				System.out.println("Voc� escolheu - Soma!");
				System.out.print("Digite o primeiro n�mero: ");
				n1 = entrada.nextInt();
				System.out.print("Digite o segundo n�mero: ");
				n2 = entrada.nextInt();
				System.out.println("O resultado �: " + (n1 + n2));
				break;
			}
			case 2: {
				System.out.println("Voc� escolheu -  Subtra��o!");
				System.out.print("Digite o primeiro n�mero: ");
				n1 = entrada.nextInt();
				System.out.print("Digite o segundo n�mero: ");
				n2 = entrada.nextInt();
				System.out.println("O resultado �: " + (n1 - n2));
				break;
			}
			case 3: {
				System.out.println("Voc� escolheu - Multiplica��o!");
				System.out.print("Digite o primeiro n�mero: ");
				n1 = entrada.nextInt();
				System.out.print("Digite o segundo n�mero: ");
				n2 = entrada.nextInt();
				System.out.println("O resultado �: " + (n1 * n2));
				break;
			}
			case 4: {
				System.out.println("Voc� escolheu - Divis�o!");
				System.out.print("Digite o primeiro n�mero: ");
				n1 = entrada.nextInt();
				System.out.print("Digite o segundo n�mero: ");
				n2 = entrada.nextInt();
				while (n2 == 0) {
					System.out.print("Informe um n�mero diferente de zero: ");
					n2 = entrada.nextInt();
				}
				System.out.println("O resultado �: " + (n1 / n2) + " e o resto da divis�o �: " + (n1 % n2));
				break;
			}
			default:
				System.out.println("Op��o inv�lida");

			}
		}
		while (numero != 9);
		entrada.close();

	}

}
