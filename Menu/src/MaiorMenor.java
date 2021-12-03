import java.util.Scanner;

public class MaiorMenor {
// Programa para que o usuário informe 10 números e ao final veja qual o menor e maior número digitado.
	
	public static void main(String[] args) {
		
		
		int [] numero = new int[10];
		int menor = 0, maior = 0;
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < numero.length; i++){
			System.out.print("Digite o " +(i+1)+"º numero: ");
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
		System.out.println("O menor número digitado foi: " + menor + " e o maior foi: " + maior);
				
		entrada.close();

	}

}
