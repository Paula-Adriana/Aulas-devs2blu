package array;

public class ArrayAula {
	public static void main(String[] args) {

		int[] listaNumeros = new int[10];

		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = i;
			if (i == 8) {
				listaNumeros[i] = 99;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (listaNumeros[i] == 99) {
				break;
			}
			System.out.println(listaNumeros[i]);
		}

		System.out.println();
		System.out.println("Lista 2");
		// System.out.println("O tamanho do meu array é " + listaNumeros.length);
		for (int numeros : listaNumeros) {
			System.out.println(numeros);
		}
	}
}
