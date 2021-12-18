package classe;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pessoa pes = new Pessoa();
		ArrayList<Pessoa> listaPessoa = new ArrayList<>();
		pes.nome = "José";
		pes.idade = 25;
		listaPessoa.add(pes);
		pes.imprimirDados();

		
		// Incluindo varios itens no arraylist usando uma classe
		for (int i = 0; i < 2; i++) {
			Pessoa pe = new Pessoa();
			System.out.print("Digite o nome: ");
			pe.nome = entrada.next();
			System.out.print("Digite a idade: ");
			pe.idade = entrada.nextInt();
			listaPessoa.add(pe);
		}

		for (Pessoa pessoa : listaPessoa) {
			pessoa.imprimirDados();

			entrada.close();

		}
	}
}
