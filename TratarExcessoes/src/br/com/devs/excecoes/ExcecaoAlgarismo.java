package br.com.devs.excecoes;

import javax.swing.JOptionPane;

import br.com.devs.minhaExcecao.IdadeNegativa;

public class ExcecaoAlgarismo {
	public static void main(String[] args) {
		try {
			lerNumero();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	static boolean lerNumero() throws ValidaAlgarismo, IdadeNegativa {
		String numero = JOptionPane.showInputDialog("Informe o número: ");
		if(numero.matches("^[0-9]+")) { //.match e regex
			return true;						
		}else {
			return false;			
		}			
	} 
	
		
		//terminar
		
	}

