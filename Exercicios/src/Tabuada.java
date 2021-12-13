import java.util.Iterator;
import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		System.out.println("Qual número você deseja saber a tabuada: ");
		numero = entrada.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + (numero*i));
		}

		entrada.close();
	}
}
