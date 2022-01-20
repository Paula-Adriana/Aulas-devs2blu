package br.com.devs.principal;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import br.com.devs.entidades.Carro;
import br.com.devs.uteis.Conexao;

public class Principal {
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.setPlaca("LZZ8758");
		carro.setMarca("Volks");
		carro.setModelo("Fuscão preto");
		carro.salvar();
	
	if (carro.salvar()) {
		System.out.println("Carro salvo com sucesso!");
	}
	}
	
	static void testeConexao() {
		System.out.println("olá");
		if (Conexao.conectar() != null) {
			System.out.println("Conectado");

		} else {
			System.out.println("Erro ao conectar");
		}

	}
}
//no dbeaver
/*create  table carro (
	id serial primary key,
	placa varchar(7),
	modelo varchar(20),
	marca varchar(20)
);*/
