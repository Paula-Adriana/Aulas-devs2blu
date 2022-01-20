package br.com.devs.excecoes;

import java.util.Scanner;

public class lancandoExce��es {

	public static void main(String[] args) {

		validarExceptionLancada();
		
	}
	// lan�ando a exce��o 
	static void validaIdade(int idade) throws Exception {
		if (idade < 17) {
			throw new Exception("Menor de idade");
		}
	}
	//metodo que trata a exce�ao lan�ada
	static void validarExceptionLancada() {
		try {
			validaIdade(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	

}
