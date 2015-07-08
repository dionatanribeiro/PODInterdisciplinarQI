package br.edu.qi.euroschool.core;

import java.util.List;

import javax.ejb.Local;

@Local
public interface GenericBean<T> {

	public void salvar(T t);
	public List<T> selectAll();
	
}
