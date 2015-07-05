package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;

@Local
public interface AbstractDao<T> {

	void insert (T t);
	List<T> selectAll();
	
}
