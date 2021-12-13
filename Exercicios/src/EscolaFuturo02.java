import java.util.Scanner;

/* A Escola Futuro precisa controlar as notas e médias dos seus alunos.
Para isso precisa de um programa que faça o seguinte:
1 - Informar a quantidade de alunos
2 - Informar a quantidade de notas
3 - Informar nota a nota
4 - Calcular a média 
5 - Para cada aluno verificar a situação
Se média < 6 - Reprovado
Se média >= 6 e < 7.5 - Em Recuperação
Se média >= 7.5 - Aprovado
6 - Para cada aluno imprimir o Nome, Média e Situação
7 - No final do programa imprimir a melhor média e a média da turma
*/
public class EscolaFuturo02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int contaNotas = 0, contaAluno = 0, quantidadeAluno, quantidadeNotas;
		double notas, mediaAluno, mediaTurma = 0, melhorMedia = 0, somaNotas = 0;
		String nome, situacao;

		System.out.print("Digite o número de alunos: ");
		quantidadeAluno = entrada.nextInt();

		while (contaAluno < quantidadeAluno) {

			System.out.print("Digite o nome do aluno: ");
			nome = entrada.next();
			

			System.out.print("Digite quantas notas serão informadas: ");
			quantidadeNotas = entrada.nextInt();

			while (contaNotas < quantidadeNotas) {
				System.out.print("Digite a " + (contaNotas + 1) + "ª nota: ");
				notas = entrada.nextInt();
				somaNotas += notas;
				contaNotas++;
			}
			mediaAluno = somaNotas / quantidadeNotas;
			mediaTurma += mediaAluno / quantidadeAluno;

			if (mediaAluno < 6) {
				situacao = "Reprovado!";
			} else if (mediaAluno < 7.5) {
				situacao = "Em recuperação!";
			} else {
				situacao = "Aprovado!";
			}
			System.out.println();
			System.out.println("***************************");
			System.out.println("Nome do aluno: " + nome);
			System.out.printf("Média: %.2f \n", mediaAluno);
			System.out.println("Situação: " + situacao);
			System.out.println("***************************");

			if (mediaAluno > melhorMedia) {
				melhorMedia = mediaAluno;
			}
			
			contaAluno++;
			mediaAluno = 0;
			somaNotas = 0;
			contaNotas = 0;
		}
		System.out.printf("A média da turma foi: %.2f e melhor a média foi: " + melhorMedia, mediaTurma);

		entrada.close();

	}

}
