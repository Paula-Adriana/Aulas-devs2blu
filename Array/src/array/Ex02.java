package array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		/* Com base no ex01 crie mais um vetor para guardar o salário de cada pessoa, ao término, 
		 * totalize os salários*/
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formato = new DecimalFormat("R$ #,##0.00");
		double somaSalarios = 0;

		int[] numero = new int[2];
		String[] nomes = new String[2];
		double[] salarios = new double[2];

		for (int i = 0; i < numero.length; i++) {

			System.out.print("Informe o " + (i + 1) + "º código: ");
			numero[i] = entrada.nextInt();
			
			System.out.print("Informe o " + (i + 1) + "º nome: ");
			nomes[i] = entrada.next();
			
			System.out.print("Informe o " + (i + 1) + "º salário: ");
			salarios[i] = entrada.nextDouble();
			
			somaSalarios += salarios[i];
		}

		for (int i = 0; i < nomes.length; i++) {
			System.out.println(numero[i] + " - " + nomes[i] + " - " + formato.format(salarios[i]));
			System.out.println();
		}
		System.out.println("Total salários: " + formato.format(somaSalarios));

		entrada.close();
	}

}