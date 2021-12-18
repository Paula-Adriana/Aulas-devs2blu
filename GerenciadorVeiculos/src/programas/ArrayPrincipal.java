package programas;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayPrincipal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> listaCarros = new ArrayList<>();
		
		//Adicionando elementos
		listaCarros.add("Mazda");
		listaCarros.add("Mercedes");
		listaCarros.add("BMW");
		listaCarros.add("Toyota");
		listaCarros.add("Honda");
		System.out.println(listaCarros);
		
		//Verificar se a lista está vazia
		if (listaCarros.isEmpty()) {
			System.out.println("Lista vazia");
		} else {
			System.out.println("Lista com registros.");
		}
		
		//Buscando o conteúdo de um index específico
		int posicao3 = 3;
		System.out.println("O veículo da posição 3 é o: " + listaCarros.get(posicao3));
		
		//Invertendo posições
		int posicao2 = 2;
		String marcaSalva;
		marcaSalva = listaCarros.get(posicao2);
		listaCarros.set(posicao2, listaCarros.get(posicao3));
		listaCarros.set(posicao3, marcaSalva);
		System.out.println(listaCarros);
		
		//Saber posição de um elemento.
		System.out.println(listaCarros.indexOf("BMW"));
		
		//Removendo um elemento sabendo a posicao
		listaCarros.remove(posicao2);
		
		//Adicionando pelo usuario
		System.out.print("Digite a quantidade de carros: ");
		int quantidadeCarro = entrada.nextInt();
		String marca;
		for (int i = 0; i < quantidadeCarro; i++) {
			System.out.print("Informe a marca do carro: ");
			marca = entrada.next();
			listaCarros.add(marca);
			
		}
		System.out.println(listaCarros);
		
		
		
		
		
		entrada.close();

	}

}
