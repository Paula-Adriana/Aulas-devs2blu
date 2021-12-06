import java.util.Scanner;

/* A Escola Futuro precisa controlar as notas e m�dias dos seus alunos.
Para isso precisa de um programa que fa�a o seguinte:
1 - Informar a quantidade de alunos
2 - Informar a quantidade de notas
3 - Informar nota a nota
4 - Calcular a m�dia 
5 - Para cada aluno verificar a situa��o
Se m�dia < 6 - Reprovado
Se m�dia >= 6 e < 7.5 - Em Recupera��o
Se m�dia >= 7.5 - Aprovado
6 - Para cada aluno imprimir o Nome, M�dia e Situa��o
7 - No final do programa imprimir a melhor m�dia e a m�dia da turma
*/
public class EscolaFuturo {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String situacao, nome;
		int quantidadeNotas, quantidadeAlunos;
		double somaNota = 0, media = 0, mediaTurma = 0, melhorMedia = 0;
		int numeroNotas = 0;

		System.out.print("Informe a quantidade de alunos: ");
		quantidadeAlunos = entrada.nextInt();

		for (int i = 1; i <= quantidadeAlunos; i++) {
			System.out.print("Informe o nome do aluno: ");
			nome = entrada.next();
			
			System.out.print("Informe a quantidade de notas: ");
			quantidadeNotas = entrada.nextInt();

			for (int j = 0; j < quantidadeNotas; j++) {
				System.out.print("Informe a " + (j + 1) + "� nota: ");
				numeroNotas = entrada.nextInt();
				somaNota += numeroNotas;
			}
			media = somaNota / quantidadeNotas;
			mediaTurma += media / quantidadeAlunos;

			if (media < 6) {
				situacao = "Reprovado!";
			} else if (media < 7.5) {
				situacao ="Em recupera��o!";
			} else {
				situacao ="Aprovado!";
			}
			if (media > melhorMedia) {
				melhorMedia = media;
			}
			System.out.println();
			System.out.println("****************************");
			System.out.println("Nome do aluno: " + nome);
			System.out.printf("M�dia: %.2f \n", media);
			System.out.println("Situa��o: " + situacao);
			System.out.println();
			System.out.println("****************************");	
			media = 0;
			somaNota = 0;
		}
		System.out.printf("A melhor m�dia da turma foi: " + melhorMedia + ""
				+ " e a m�dia geral foi: %.2f",mediaTurma);
		
		entrada.close();
	}

}
