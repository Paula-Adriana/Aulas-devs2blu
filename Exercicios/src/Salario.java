import java.text.DecimalFormat;
import java.util.Scanner;

/*Faça um programa que apresente o menu de opções a seguir, que permita ao usuário 
   escolher a opção desejada, receba os dados necessários para executar a operação e 
   mostre o resultado. 
   Verificar a possibilidade de opção inválida e não se preocupar com as restrições, 
   como salário inválido.  

		Menu de opções:  

		1. Novo salário
		2. Férias
		3. Décimo terceiro
		4. Sair  
		Digite a opção desejada :

   Na Opção 1: Receber o salário de um funcionário, calcular e mostrar o novo salário usando as 
               regras a seguir:  
		
		Salários			% aumento
		Inferior a R$ 350,00		15%
		De R$ 350,00 a R$ 600,00	10%
		Acima de R$ 600,00		 5%
		
   Na opção 2: Receber o salário de um funcionário, calcular e mostrar o valor de suas férias. 
               Sabe-se que as férias equivalem ao seu salário acrescido de l/3 do salário atual.  

   Na opção 3: Receber o salário de um funcionário e o número de meses de trabalho na empresa, 
               no máximo 12, calcular e mostrar o valor do décimo terceiro. 
               Sabe-se que o décimo terceiro equivale ao seu salário multiplicado pelo número de 
               meses de trabalho dividido por 12.  

   Na opção 4: sair do programa. */
public class Salario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		int opcao, mesesNaEmpresa;
		double salario, ferias, decimoTerceiro;
		do {
			System.out.println("Menu de opções: ");
			System.out.println("1. Novo salário ");
			System.out.println("2. Férias ");
			System.out.println("3. Décimo terceiro ");
			System.out.println("4. Sair ");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite seu salário: ");
				salario = entrada.nextDouble();
				System.out.println();
				System.out.println("***Tabela de Aumento Salarial***");
				System.out.println("--------------------------------");
				System.out.println("Salários             % aumento");
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
				System.out.println("De acordo com a tabela acima, seu novo salário é de: " + formatador.format(salario)
						+ " reais.");
				break;
			case 2:
				System.out.println("Digite seu salário: ");
				salario = entrada.nextDouble();
				ferias = (salario / 3) + salario;
				System.out.println("O valor total das suas férias é de: " + formatador.format(ferias) + " reais.");
				break;
			case 3:
				System.out.println("Digite seu salário: ");
				salario = entrada.nextDouble();
				do {
					System.out.println("Há quantos meses trabalha nesta empresa: " + "(máximo 12 meses)");
					mesesNaEmpresa = entrada.nextInt();
				} while (mesesNaEmpresa > 12);
				decimoTerceiro = (salario * mesesNaEmpresa) / 12;
				System.out.println(
						"O valor do seu décimo terceiro é de: " + formatador.format(decimoTerceiro) + " reais.");
				break;
			case 4:
				System.out.println("Programa Encerrado!");
				break;
			default:
				System.out.println("Digite uma opção válida");
				System.out.println();
			}

		} while (opcao == 0 || opcao >= 5);
		entrada.close();

	}
}
