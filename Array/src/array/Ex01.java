package array;

import java.util.Scanner;

/*Crie um array com 10 posições contendo inteiros e outro de 10 contendo strings.
 * Depois cadastre os nomes com seus respectivos códigos nos dois Arrays e liste os 
 * códigos com os nomes lado a lado.*/
public class Ex01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] numero = new int[10];
		String[] nomes = new String[10];

		for (int i = 0; i < numero.length; i++) {
			System.out.print("Informe o " + (i + 1) + "º código: ");
			numero[i] = entrada.nextInt();
			
			System.out.print("Informe o " + (i + 1) + "º nome: ");
			nomes[i] = entrada.next();
		}
		
			for (int i = 0; i < nomes.length; i++) {
				System.out.println();
				System.out.println(numero[i] + " - " + nomes[i]);
			}
			
			
		
		
		entrada.close();
	}
}
