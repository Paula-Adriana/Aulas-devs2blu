import java.util.Scanner;

public class MaiorMenor {
// Programa para que o usu�rio informe 10 n�meros e ao final veja qual o menor e maior n�mero digitado.
	
	public static void main(String[] args) {
		
		
		int [] numero = new int[10];
		int menor = 0, maior = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < numero.length; i++){
			System.out.print("Digite o " +(i+1)+"� numero: ");
			numero[i] = entrada.nextInt();
			
			if (i == 0) {
                maior = numero[i];
                menor = numero[i];
            }
			
			if(numero[i] > maior){ 
				maior = numero[i];
			} else if (numero[i] < menor) {
				menor = numero[i];
			}
		}
		System.out.println("O menor n�mero digitado foi: " + menor + " e o maior foi: " + maior);
				
		entrada.close();

	}

}
