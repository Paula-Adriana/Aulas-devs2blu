package br.com.devs.escola.interfaces;

import java.util.List;

import br.com.devs.escola.entidades.Aluno;

public interface InterfaceDao <T> {
	
	public boolean incluir(T t); 

	public boolean excluir(T t);

	public List<T> listar();

	boolean alterar(T t);
}
