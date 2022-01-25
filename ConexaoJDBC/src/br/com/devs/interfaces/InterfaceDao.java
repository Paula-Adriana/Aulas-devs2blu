package br.com.devs.interfaces;

import java.util.List;

import br.com.devs.entidades.Carro;

public interface InterfaceDao<T> {
	
	public boolean salvar(T t);
	public boolean update(T t);
	public boolean excluir(T t);
	public T retornarUm(int id);
	public List<T> retornartodos();
	
}
