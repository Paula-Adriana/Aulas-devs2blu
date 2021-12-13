import java.text.DecimalFormat;
import java.util.Scanner;

/*Faça um programa que receba o valor de um carro e mostre uma tabela 
   com os seguintes dados: preço final, quantidade de parcelas e valor da parcela. 
   Considere o seguinte:

   O preço final para compra à vista tem um desconto de 20%;
   Se for a prazo, a quantidades de parcelas pode ser: 
      6, 12, 18, 24, 30, 36, 42, 48, 54 e 60.
		
   Os percentuais de acréscimo seguem a tabela a seguir.  
			
	Parcelas	Acréscimo
	6		3%
	12		6%
	18		9%
	24		12%
	30		15%
	36		18%
	42		21%
	48		24%
	54		27%
	60		30%*/
public class TabelaCarro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("R$ #,##0.00");

		double valorCarro, valorFinal = 0, valorParcela = 0;
		int quantidadeParcela, formaPagamento;

		System.out.print("Digite o valor do carro: ");
		valorCarro = entrada.nextDouble();

		System.out.print("Como deseja pagar: 1 - à vista | 2 - à prazo: ");
		formaPagamento = entrada.nextInt();
		if (formaPagamento == 1) {
			valorFinal = valorCarro * 0.80;
			System.out.printf("O valor do carro com pagamento à vista possui 20%% de desconto,"
					+ " sendo o valor final de: " + formatador.format(valorFinal) + " reais.");
		} else {
			System.out.println("Em quantas parcelas deseja pagar: 6, 12, 18, 24, 30, 36, 42, 48, 54 ou 60");
			quantidadeParcela = entrada.nextInt();

			switch (quantidadeParcela) {
			case 6: {
				valorFinal = valorCarro * 1.03;
				quantidadeParcela = 6;
				valorParcela = valorFinal / quantidadeParcela;
			}
				break;

			case 12: {
				valorFinal = valorCarro * 1.06;
				quantidadeParcela = 12;
				valorParcela = valorFinal / quantidadeParcela;
			}
				break;
			case 18: {
				valorFinal = valorCarro * 1.09;
				quantidadeParcela = 18;
				valorParcela = valorFinal / quantidadeParcela;
			}
				break;
			case 24: {
				valorFinal = valorCarro * 1.12;
				quantidadeParcela = 24;
				valorParcela = valorFinal / quantidadeParcela;
			}
				break;
			case 30: {
				valorFinal = valorCarro * 1.15;
				quantidadeParcela = 30;
				valorParcela = valorFinal / quantidadeParcela;
			}
				break;
			case 36: {
				valorFinal = valorCarro * 1.18;
				quantidadeParcela = 36;
				valorParcela = valorFinal / quantidadeParcela;
			}
				break;
			case 42: {
				valorFinal = valorCarro * 1.21;
				quantidadeParcela = 42;
				valorParcela = valorFinal / quantidadeParcela;
			}
				break;
			case 48: {
				valorFinal = valorCarro * 1.24;
				quantidadeParcela = 48;
				valorParcela = valorFinal / quantidadeParcela;
			}
				break;
			case 54: {
				valorFinal = valorCarro * 1.27;
				quantidadeParcela = 54;
				valorParcela = valorFinal / quantidadeParcela;
			}
				break;
			case 60: {
				valorFinal = valorCarro * 1.30;
				quantidadeParcela = 60;
				valorParcela = valorFinal / quantidadeParcela;
			}
				break;

			}

			System.out.println("Valor final do carro: " + formatador.format(valorFinal) + " reais.");
			System.out.println("Quantidade de parcelas: " + quantidadeParcela + ".");
			System.out.println("Valor da parcela: " + formatador.format(valorParcela) + " reais.");
		}
		entrada.close();
	}
}
