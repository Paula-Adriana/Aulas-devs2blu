package br.com.devs.minhaExcecao;

import javax.swing.JOptionPane;

public class MinhasExcecoes {

	public static void main(String[] args) {
		try {
			lerIdade();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static void lerIdade() throws Exception {
		String idade = JOptionPane.showInputDialog("Informe idade: ");
		int idadeConvertida = Integer.parseInt(idade);
		
		if (idadeConvertida < 0) {
			throw new IdadeNegativa("Idade não pode ser negativa.");
		}
	}
}
