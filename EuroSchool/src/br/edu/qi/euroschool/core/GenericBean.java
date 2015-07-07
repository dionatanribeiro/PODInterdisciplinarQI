package br.edu.qi.euroschool.core;

import javax.ejb.Local;

@Local
public interface GenericBean<T> {

	public void salvar(T t);
}
