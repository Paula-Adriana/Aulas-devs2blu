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
				System.out.print("Informe a " + (j + 1) + "ª nota: ");
				numeroNotas = entrada.nextInt();
				somaNota += numeroNotas;
			}
			media = somaNota / quantidadeNotas;
			mediaTurma += media / quantidadeAlunos;

			if (media < 6) {
				situacao = "Reprovado!";
			} else if (media < 7.5) {
				situacao ="Em recuperação!";
			} else {
				situacao ="Aprovado!";
			}
			if (media > melhorMedia) {
				melhorMedia = media;
			}
			System.out.println();
			System.out.println("****************************");
			System.out.println("Nome do aluno: " + nome);
			System.out.printf("Média: %.2f \n", media);
			System.out.println("Situação: " + situacao);
			System.out.println();
			System.out.println("****************************");	
			media = 0;
			somaNota = 0;
		}
		System.out.printf("A melhor média da turma foi: " + melhorMedia + ""
				+ " e a média geral foi: %.2f",mediaTurma);
		
		entrada.close();
	}

}
