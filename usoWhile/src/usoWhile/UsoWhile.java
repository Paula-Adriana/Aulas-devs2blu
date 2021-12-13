package usoWhile;

import javax.swing.JOptionPane;

public class UsoWhile {

	public static void main(String[] args) {
		
		float nota, media = 0;
		int quantidadeDeNotas, contaNotas;
		quantidadeDeNotas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas"));
		
		
		contaNotas = 1;
		while (contaNotas <= quantidadeDeNotas) {
			nota = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota número: " + contaNotas));
			media = media + (nota / quantidadeDeNotas);
			media = Math.round(media * 100.0f)/100.0f;
			contaNotas++; 
			
		}
		
		System.out.println("A média do aluno é " + media);
	}

}
