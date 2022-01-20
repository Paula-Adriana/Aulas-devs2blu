package br.com.devs.minhaExcecao;

public class IdadeNegativa extends Exception {
	
	private static final long serialVersionUID = 1L;

	//construtor nao retorna / mesmo nome da classe
	public IdadeNegativa (String msg) {
		super(msg);
	
	}

}
