
public class Gerencia extends Funcionario {

	public float comissao;
	public String descDepto;
	
	public void listarGerente() {
		System.out.println("Nome    : " + nome );
		System.out.println("Depto   : " + descDepto);
		System.out.println("Salário : " + salario);
	}
}
