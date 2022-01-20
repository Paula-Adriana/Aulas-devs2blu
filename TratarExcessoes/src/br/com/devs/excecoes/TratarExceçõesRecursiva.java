package br.com.devs.excecoes;

import java.util.Scanner;

public class TratarExce��esRecursiva {

	public static void main(String[] args) {

		digitaNomeIdadeRecursiva();
	}

	static void digitaNomeIdadeRecursiva() {
		Scanner entrada = new Scanner(System.in);
		boolean deuExcessao = true;
		String idade = " ";
		String nome = " ";
		while (deuExcessao) {
			System.out.print("Informe nome: ");
			nome = entrada.next();
			System.out.print("Informe idade: ");
			idade = entrada.next();
			try {
				int idadeNumerica = Integer.parseInt(idade); // wrapper
				deuExcessao = false;
			} catch (NumberFormatException e) {
				System.err.println("Idade inv�lida");// err: em vermelho
				deuExcessao = true;
			}
		}
		System.out.println(nome + " voc� tem " + idade + " anos.");

		entrada.close();

	}

}