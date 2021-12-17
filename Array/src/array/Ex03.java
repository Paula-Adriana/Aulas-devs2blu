package array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		/* Com base no ex02 liste os 3 maiores salarios */
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("R$ #,##0.00");

		double somaSalarios = 0;

		int[] numero = new int[4];
		String[] nomes = new String[4];
		double[] salarios = new double[4];

		for (int i = 0; i < numero.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º código: ");
			numero[i] = entrada.nextInt();

			System.out.print("Informe o " + (i + 1) + "º nome: ");
			nomes[i] = entrada.next();

			System.out.print("Informe o " + (i + 1) + "º salário: ");
			salarios[i] = entrada.nextDouble();

			somaSalarios += salarios[i];
		}

		for (int i = 0; i < salarios.length; i++) {
			for (int j = i + 1; j < salarios.length; j++) {
				double maior = 0;
				if (salarios[i] < salarios[j]) {
					maior = salarios[i];
					salarios[i] = salarios[j];
					salarios[j] = maior;
				}
			}
		}

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(numero[i] + " - " + nomes[i] + " - " + formato.format(salarios[i]));
			System.out.println();
		}
		System.out.println("Total: " + formato.format(somaSalarios));
		System.out.println("Três maiores salários: " + formato.format(salarios[0]) + ", " + formato.format(salarios[1])
				+ ", " + formato.format(salarios[2]));

		entrada.close();
	}

}