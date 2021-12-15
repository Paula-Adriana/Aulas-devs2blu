package Construtor;

import Construtor.Aluno.STATUS;

public class AlunoMain {

	public static void main(String[] args) {
		Aluno alu = new Aluno(8, 8, 8, 8);
		System.out.println("A média do aluno é " + alu.calculaMedia());
		double mediaAluno = alu.calculaMedia();
		if (mediaAluno < 6) {
			System.out.println(STATUS.REPROVADO);	
		} else {
			System.out.println(STATUS.APROVADO);
		}

	}

}
