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
public class EscolaFuturo02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contaNotas = 0, contaAluno = 0, quantidadeAluno, quantidadeNotas;
		double notas, mediaAluno, mediaTurma = 0, melhorMedia = 0, somaNotas = 0;
		String nome, situacao;

		System.out.print("Digite o n�mero de alunos: ");
		quantidadeAluno = entrada.nextInt();

		while (contaAluno < quantidadeAluno) {

			System.out.print("Digite o nome do aluno: ");
			nome = entrada.next();
			

			System.out.print("Digite quantas notas ser�o informadas: ");
			quantidadeNotas = entrada.nextInt();

			while (contaNotas < quantidadeNotas) {
				System.out.print("Digite a " + (contaNotas + 1) + "� nota: ");
				notas = entrada.nextInt();
				somaNotas += notas;
				contaNotas++;
			}
			mediaAluno = somaNotas / quantidadeNotas;
			mediaTurma += mediaAluno / quantidadeAluno;

			if (mediaAluno < 6) {
				situacao = "Reprovado!";
			} else if (mediaAluno < 7.5) {
				situacao = "Em recupera��o!";
			} else {
				situacao = "Aprovado!";
			}
			System.out.println();
			System.out.println("***************************");
			System.out.println("Nome do aluno: " + nome);
			System.out.printf("M�dia: %.2f \n", mediaAluno);
			System.out.println("Situa��o: " + situacao);
			System.out.println("***************************");

			if (mediaAluno > melhorMedia) {
				melhorMedia = mediaAluno;
			}
			
			contaAluno++;
			mediaAluno = 0;
			somaNotas = 0;
			contaNotas = 0;
		}
		System.out.printf("A m�dia da turma foi: %.2f e melhor a m�dia foi: " + melhorMedia, mediaTurma);

		entrada.close();

	}

}
