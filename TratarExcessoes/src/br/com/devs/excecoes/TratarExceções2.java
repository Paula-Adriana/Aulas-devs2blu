package br.com.devs.excecoes;

public class TratarExce��es2 {

	public static void main(String[] args) {
		carros();
	}
		static void carros() {
			String[] vagas = {"Fusca", "Kombi", "TL", "Brasilia"};
			try {
				System.out.println(vagas[4]);
			} catch (Exception e) {
				System.out.println("Posi��o inexistente");//como ser� tratada a excess�o
			}
			System.out.println("Fim do programa");
			
		}
		
		
	}
		
	

