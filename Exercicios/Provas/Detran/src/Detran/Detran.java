package Detran;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Detran {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("R$ #,##0.00");

		int quantidadeMotoristas, numeroCarteira, numeroMultas, naturezaMulta, pontos = 0;
		double multaLeve = 0, multaMedia = 0, multaGrave = 0, multaGravissima = 0, totalMultas = 0;

		System.out.print("Digite a quantidade de motoristas: ");
		quantidadeMotoristas = entrada.nextInt();

		for (int i = 0; i < quantidadeMotoristas; i++) {
			System.out.print("Digite o número da carteira do " + (i + 1) + "º motorista: ");
			numeroCarteira = entrada.nextInt();

			System.out.print("Digite o número de multas: ");
			numeroMultas = entrada.nextInt();

			for (int j = 0; j < numeroMultas; j++) {
				System.out.print("Digite a natureza da " + (j + 1) + "ª multa: 1 - LEVE | 2 - MÉDIA "
						+ "| 3 - GRAVE | 4 - GRAVÍSSIMA: ");
				naturezaMulta = entrada.nextInt();

				switch (naturezaMulta) {
				case 1:
					multaLeve++;
					pontos += 3;
					totalMultas += 88.00;
					break;
				case 2:
					multaMedia++;
					pontos += 4;
					totalMultas += 130.00;
					break;
				case 3:
					multaGrave++;
					pontos += 5;
					totalMultas += 195.0;
					break;
				case 4:
					multaGravissima++;
					pontos += 7;
					totalMultas += 293.00;
					break;

				}

			}
			System.out.println();
			System.out.println("****************QUADRO DE MULTAS****************");
			System.out.println("    NATUREZA | PONTUAÇAO | VALOR (R$)");
			System.out.println("      LEVE   | 3 PONTOS  |   88,00");
			System.out.println("      MÉDIA  | 4 PONTOS  |  130,00");
			System.out.println("      GRAVE  | 5 PONTOS  |  195,00");
			System.out.println("  GRAVÍSSIMA | 7 PONTOS  |  293,00");
			System.out.println("*************************************************");
			System.out.println();
			System.out.println("==============RESUMO DAS INFRAÇÕES===============");
			System.out.println("Carteira de motorista número: " + numeroCarteira);
			System.out.println("Número de multas de natureza Leve: " + multaLeve);
			System.out.println("Número de multas de natureza média: " + multaMedia);
			System.out.println("Número de multas de natureza grave: " + multaGrave);
			System.out.println("Número de multas de natureza gravíssima: " + multaGravissima);
			System.out.println("Total de pontos: " + pontos);
			System.out.println("Valor total de multas: " + formato.format(totalMultas) + " reais.");
			System.out.println("================================================");
			System.out.println();

			multaLeve = 0;
			multaMedia = 0;
			multaGrave = 0;
			multaGravissima = 0;
			pontos = 0;
			totalMultas = 0;

		}

		entrada.close();

	}

}
