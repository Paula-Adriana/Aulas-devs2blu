import java.text.DecimalFormat;
import java.util.Scanner;

/*Uma ag�ncia banc�ria possui v�rios clientes que podem fazer investimentos 
   com rendimentos mensais, conforme a tabela a seguir:

    Tipo	Descri��o		Rendimento mensal
     1		Poupan�a		1,5%
     2		Poupan�a plus		2.0%
     3		Fundos de renda		4.0%
			
   Fa�a um programa que leia o c�digo do cliente, o tipo da conta e o valor investido 
   e que calcule e mostre o rendimento mensal de acordo com o tipo do investimento. 
   Ao final do programa mostre o total de juros pagos. 
   A leitura terminar� quando o c�digo do cliente digitado for menor ou igual a 0.*/
public class Agencia {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");
		int codigoCliente = 1, tipoConta;
		double valorInvestido, rendimentoMensal = 0, totalJuros = 0;

		do {
			System.out.print("Digite seu c�digo: ");
			codigoCliente = entrada.nextInt();
			if (codigoCliente <= 0) {
				System.out.println("Programa encerrado!");
				break;
			}

			System.out.print("Digite seu tipo de conta: \n"
					+ "1 - Poupan�a \n"
					+ "2 - Poupan�a Plus \n"
					+ "3 - Fundos de renda \n");
			tipoConta = entrada.nextInt();

			System.out.print("Qual � o valor investido: ");
			valorInvestido = entrada.nextDouble();

			switch (tipoConta) {
			case 1:
				rendimentoMensal = valorInvestido * 1.015;
				totalJuros = rendimentoMensal - valorInvestido;
				break;
			case 2:
				rendimentoMensal = valorInvestido * 1.02;
				totalJuros = rendimentoMensal - valorInvestido;
				break;
			case 3:
				rendimentoMensal = valorInvestido * 1.04;
				totalJuros = rendimentoMensal - valorInvestido;
				break;
			}
			System.out.println();
			System.out.println("***********************");
			System.out.println("Valor investido: " + formatador.format(valorInvestido) + " reais.");
			System.out.println("Rendimento mensal: " + formatador.format(rendimentoMensal));
			System.out.println("Total de Juros: " + formatador.format(totalJuros));
			System.out.println("***********************");
			System.out.println();

		} while (codigoCliente > 0);

		entrada.close();

	}

}
