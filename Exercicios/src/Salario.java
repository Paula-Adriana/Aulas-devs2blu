import java.text.DecimalFormat;
import java.util.Scanner;

/*Fa�a um programa que apresente o menu de op��es a seguir, que permita ao usu�rio 
   escolher a op��o desejada, receba os dados necess�rios para executar a opera��o e 
   mostre o resultado. 
   Verificar a possibilidade de op��o inv�lida e n�o se preocupar com as restri��es, 
   como sal�rio inv�lido.  

		Menu de op��es:  

		1. Novo sal�rio
		2. F�rias
		3. D�cimo terceiro
		4. Sair  
		Digite a op��o desejada :

   Na Op��o 1: Receber o sal�rio de um funcion�rio, calcular e mostrar o novo sal�rio usando as 
               regras a seguir:  
		
		Sal�rios			% aumento
		Inferior a R$ 350,00		15%
		De R$ 350,00 a R$ 600,00	10%
		Acima de R$ 600,00		 5%
		
   Na op��o 2: Receber o sal�rio de um funcion�rio, calcular e mostrar o valor de suas f�rias. 
               Sabe-se que as f�rias equivalem ao seu sal�rio acrescido de l/3 do sal�rio atual.  

   Na op��o 3: Receber o sal�rio de um funcion�rio e o n�mero de meses de trabalho na empresa, 
               no m�ximo 12, calcular e mostrar o valor do d�cimo terceiro. 
               Sabe-se que o d�cimo terceiro equivale ao seu sal�rio multiplicado pelo n�mero de 
               meses de trabalho dividido por 12.  

   Na op��o 4: sair do programa. */
public class Salario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		int opcao, mesesNaEmpresa;
		double salario, ferias, decimoTerceiro;
		do {
			System.out.println("Menu de op��es: ");
			System.out.println("1. Novo sal�rio ");
			System.out.println("2. F�rias ");
			System.out.println("3. D�cimo terceiro ");
			System.out.println("4. Sair ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite seu sal�rio: ");
				salario = entrada.nextDouble();
				System.out.println();
				System.out.println("***Tabela de Aumento Salarial***");
				System.out.println("--------------------------------");
				System.out.println("Sal�rios             % aumento");
				System.out.println("Inferior a R$ 350,00 ======== 15%");
				System.out.println("De R$ 350,00 a R$ 600,00 ==== 10%");
				System.out.println("Acima de R$ 600,00  ========== 5%");
				System.out.println();
				if (salario < 350) {
					salario *= 1.15;
				} else if (salario < 600) {
					salario *= 1.10;
				} else {
					salario *= 1.05;
				}
				System.out.println("De acordo com a tabela acima, seu novo sal�rio � de: " + formatador.format(salario)
						+ " reais.");
				break;
			case 2:
				System.out.println("Digite seu sal�rio: ");
				salario = entrada.nextDouble();
				ferias = (salario / 3) + salario;
				System.out.println("O valor total das suas f�rias � de: " + formatador.format(ferias) + " reais.");
				break;
			case 3:
				System.out.println("Digite seu sal�rio: ");
				salario = entrada.nextDouble();
				do {
					System.out.println("H� quantos meses trabalha nesta empresa: " + "(m�ximo 12 meses)");
					mesesNaEmpresa = entrada.nextInt();
				} while (mesesNaEmpresa > 12);
				decimoTerceiro = (salario * mesesNaEmpresa) / 12;
				System.out.println(
						"O valor do seu d�cimo terceiro � de: " + formatador.format(decimoTerceiro) + " reais.");
				break;
			case 4:
				System.out.println("Programa Encerrado!");
				break;
			default:
				System.out.println("Digite uma op��o v�lida");
				System.out.println();
			}

		} while (opcao == 0 || opcao >= 5);
		entrada.close();

	}
}
