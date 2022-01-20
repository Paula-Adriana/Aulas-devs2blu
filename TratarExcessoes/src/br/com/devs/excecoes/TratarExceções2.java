package br.com.devs.excecoes;

public class TratarExceções2 {

	public static void main(String[] args) {
		carros();
	}
		static void carros() {
			String[] vagas = {"Fusca", "Kombi", "TL", "Brasilia"};
			try {
				System.out.println(vagas[4]);
			} catch (Exception e) {
				System.out.println("Posição inexistente");//como será tratada a excessão
			}
			System.out.println("Fim do programa");
			
		}
		
		
	}
		
	

