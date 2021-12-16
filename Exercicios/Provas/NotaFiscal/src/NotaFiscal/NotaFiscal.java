package NotaFiscal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NotaFiscal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("R$ #,##0.00");

		int numeroNota, tipoPagamento, quantidadeItens, codigoItem, quantidadeVendida;
		double precoItem = 0, precoTotal = 0, precoFinal = 0;
		String nomeCliente;

		System.out.print("Informe o número da nota fiscal: ");
		numeroNota = entrada.nextInt();

		System.out.print("Informe o nome do cliente: ");
		nomeCliente = entrada.next();

		System.out.print("Informe o tipo de pagamento: 1 - À vista | 2 - A prazo ");
		tipoPagamento = entrada.nextInt();

		System.out.print("Informe a quantidade de itens: ");
		quantidadeItens = entrada.nextInt();

		for (int i = 0; i < quantidadeItens; i++) {
			System.out.print("Informe o código do " + (i + 1) + "º item: ");
			codigoItem = entrada.nextInt();

			System.out.print("Informe a quantidade vendida: ");
			quantidadeVendida = entrada.nextInt();

			System.out.print("Informe o preço unitário: ");
			precoItem = entrada.nextDouble();

			switch (codigoItem) {
			case 35877:
				if (tipoPagamento == 1) {
					precoItem *= 0.95;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.03;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 35878:
				if (tipoPagamento == 1) {
					precoItem *= 0.97;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.06;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 35879:
				if (tipoPagamento == 1) {
					precoItem *= 0.95;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.03;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 35888:
				if (tipoPagamento == 1) {
					precoItem *= 0.95;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.01;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 48885:
				if (tipoPagamento == 1) {
					precoItem *= 0.975;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.01;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 48886:
				if (tipoPagamento == 1) {
					precoItem *= 0.975;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.01;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 48887:
				if (tipoPagamento == 1) {
					precoItem *= 0.975;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.01;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 48888:
				if (tipoPagamento == 1) {
					precoItem *= 0.975;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.01;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 52475:
				if (tipoPagamento == 1) {
					precoItem *= 0.97;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.06;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 52476:
				if (tipoPagamento == 1) {
					precoItem *= 0.97;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.06;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 52477:
				if (tipoPagamento == 1) {
					precoItem *= 0.95;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.08;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;
			case 52478:
				if (tipoPagamento == 1) {
					precoItem *= 0.95;
					precoTotal = precoItem * quantidadeVendida;
				} else {
					precoItem *= 1.08;
					precoTotal = precoItem * quantidadeVendida;
				}
				break;

			}
			precoFinal += precoTotal;

			System.out.println();
			System.out.println("----------- TOTAL DO ITEM ------------");
			System.out.println("Item informado: " + codigoItem);
			System.out.println("Preço unitário: " + formato.format(precoItem));
			System.out.println("Preço total do item " + formato.format(precoTotal));
			System.out.println();
			System.out.println("---------------------------------------");

		}

		System.out.println();
		System.out.println("******* FECHAMENTO NOTA FISCAL **********");
		System.out.println();
		System.out.println("Número da nota fiscal: " + numeroNota);
		System.out.println("Nome do cliente: " + nomeCliente);
		System.out.println("Número de itens informados: " + quantidadeItens);
		System.out.println("Valor final da compra: " + formato.format(precoFinal));
		System.out.println();
		System.out.println("****************************************");

		entrada.close();

	}

}
