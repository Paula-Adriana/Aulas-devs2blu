package br.com.devs.excecoes;

public class TratarExce��es1 {

	public static void main(String[] args) {
		try {
			int x = 10;
			int y = 0;
			int z = x / y;
		} 
		catch (Exception e) {
			System.out.println("O valor n�o pode ser dividido por zero!");
			System.out.println("erro: " + e.getMessage());
			System.out.println("Classe de erro " + e.toString());
		}
		
	}

}
