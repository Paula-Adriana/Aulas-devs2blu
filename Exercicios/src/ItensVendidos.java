import java.util.Scanner;

/* Informar a quantidade de itens vendidos. Peça o codigo, descrição, valor unitário 
 * e quantidade vendida. Para cada item imprmir os dados, calcular o valor total
 * do item e ao final do programa imprimir o valor total da nota*/

public class ItensVendidos {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int quantidadeItens, codigo, quantidadeVendida;
		String descricao;
		double valorUnitario, valorTotalItem, valorTotalNota = 0;

		System.out.print("Informe a quantidade de itens: ");
		quantidadeItens = entrada.nextInt();
		
		for (int i = 1; i <= quantidadeItens; i++) {
			System.out.println("============================");
			System.out.println("Total item " + i);
			System.out.print("Informe o código: ");
			codigo = entrada.nextInt();

			System.out.print("Informe a descrição: ");
			descricao = entrada.next();

			System.out.print("Informe o valor unitário: ");
			valorUnitario = entrada.nextDouble();

			System.out.print("Informe a quantidade vendida: ");
			quantidadeVendida = entrada.nextInt();
			System.out.println();

			valorTotalItem = quantidadeVendida * valorUnitario;
			valorTotalNota += valorTotalItem;

			if (i == quantidadeItens) {
				System.out.println();
				System.out.println("============================");
				System.out.println("Valor total da nota: " + valorTotalNota);
				System.out.println("============================");
			}

		}
		
		entrada.close();
	}
}
