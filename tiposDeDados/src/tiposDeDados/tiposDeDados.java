import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ForkJoinPool;

import javax.swing.JOptionPane;

public class TipoDadosPrincipal {
//rever
	public static void main(String[] args) throws ParseException {
		
		String nome;
		int idade;
		char sexo;
		float salario;
		double salarioAnual;
		Date dataNascimento;
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
		
		//entrada de dados direta
		/*
		nome = "João do Nascimento";
		idade = 58;
		sexo = 'M';
		salario = 1000.00f;
		salarioAnual = 12000.00;
		dataNascimento = formatador.parse("14/08/1963");
		String dataNasc = formatador.format(dataNascimento);*/
		
		nome = JOptionPane.showInputDialog("Informe o nome do sujeito");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
		sexo = JOptionPane.showInputDialog("Informe o sexo").charAt(0);
		salario = Float.parseFloat(JOptionPane.showInputDialog("Informe o salario mensal"));
		salarioAnual = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario anual"));
		dataNascimento = formatador.parse(JOptionPane.showInputDialog("Informe data de nascimento"));
		String dataNasc = formatador.format(dataNascimento);
		
		
		
				
		System.out.println("O " + nome + " tem " + idade + " anos, " + "é do sexo " + sexo + 
						 " recebe R$ " + salario + " e por ano R$" + salarioAnual + " e nasceu em " +
							dataNasc);
		
		
		
	}

}