package br.com.devs.excecoes;

import java.util.Scanner;

public class lancandoExceções {

	public static void main(String[] args) {

		validarExceptionLancada();
		
	}
	// lançando a exceção 
	static void validaIdade(int idade) throws Exception {
		if (idade < 17) {
			throw new Exception("Menor de idade");
		}
	}
	//metodo que trata a exceçao lançada
	static void validarExceptionLancada() {
		try {
			validaIdade(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	

}
