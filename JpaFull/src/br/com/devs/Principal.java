package br.com.devs;

public class Principal {
	public static void main(String[] args) {
		chamaSalvar();
	}

	static void chamaUpdate() {
		   Contato contato = new DaoContato().pegarUm(1L);
		   contato.setCelular("(47)7070-9090");	   
		  if(new DaoContato().update(contato)) {
			  System.out.println("Alterado com sucesso");
		  }
	   }
	   
	   static void chamaSalvar() {
		   Contato contato = new Contato();
			contato.setNome("jose");
			contato.setEmail("jose@gmail.com");
			contato.setCelular("(47) 999-7070");

			new DaoContato().salvar(contato);
		}
	   
	   static void chamaPegaUm() {
		  Contato contato = new DaoContato().pegarUm(2L); 
		  System.out.println("Nome: " + contato.getNome());
		  System.out.println("Email: " + contato.getEmail());
		  System.out.println("Celular: " + contato.getCelular());
	   }
	
	
	
}
