package br.com.devs.main;

import java.util.List;

import br.com.devs.entidades.Carro;
import br.com.devs.entidadesDao.DaoCarro;

public class main {
	
	
	public static void main(String[] args) {
		chamaSalvar();
	}
	
	static void chamaRetornarTodos() {
		List<Carro> carros = new DaoCarro().retornartodos();
		for(Carro c : carros) {
			System.out.println(c.getId());
			System.out.println(c.getPlaca());
			System.out.println(c.getMarca());
			System.out.println(c.getModelo());
			System.out.println("");
		}
	}
	
	static void chamaUpdatePorObjeto() {
		Carro carro = new DaoCarro().retornarUm(13);
		carro.setModelo("charrete");
		if(new DaoCarro().update(carro)) {
			System.out.println("Carro alterado com sucesso");
		}
	}
	
	static void chamaExcluirporObjeto() {
		Carro carro = new DaoCarro().retornarUm(1);
		if(new DaoCarro().excluir(carro)) {
			System.out.println("Carro excluido com sucesso");
		}
	}
	
	static void chamaSalvar() {
		DaoCarro dao = new DaoCarro();

		Carro carro1 = new Carro("GTY8569", "teste2", "Volks");
		if (dao.salvar(carro1)) {
			System.out.println("Carro salvo com sucesso");
		}
	}
}
