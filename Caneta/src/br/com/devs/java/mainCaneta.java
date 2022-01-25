package br.com.devs.java;

import java.util.List;

import br.com.devs.entidades.Caneta;
import br.com.devs.entidadesDao.DaoCaneta;

public class mainCaneta {
	public static void main(String[] args) {
		chamaSalvar();
	}

	static void chamaRetornarTodos() {
		List<Caneta> canetas = new DaoCaneta().retornartodos();
		for (Caneta c : canetas) {
			System.out.println(c.getId());
			System.out.println(c.getCor());
			System.out.println(c.getPonta());
			System.out.println(c.getMarca());
			System.out.println("");
		}
	}

	static void chamaUpdatePorObjeto() {
		Caneta caneta = new DaoCaneta().retornarUm(1);
		caneta.setCor("Azul");
		if (new DaoCaneta().update(caneta)) {
			System.out.println("Caneta alterada com sucesso");
		}
	}

	static void chamaExcluirporObjeto() {
		Caneta caneta = new DaoCaneta().retornarUm(1);
		if (new DaoCaneta().excluir(caneta)) {
			System.out.println("Caneta excluida com sucesso");
		}
	}

	static void chamaSalvar() {
		DaoCaneta dao = new DaoCaneta();

		Caneta caneta = new Caneta("Amarelo", 0.2f, "BOC");
		if (dao.salvar(caneta)) {
			System.out.println("Caneta salva com sucesso");
		}
	}
}