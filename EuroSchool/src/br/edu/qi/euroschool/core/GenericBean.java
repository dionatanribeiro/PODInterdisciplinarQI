package br.edu.qi.euroschool.core;

public class GenericBean {

	private AbstractDao dao;
	
	public GenericBean (AbstractDao daoResponsavel){
		this.dao  = daoResponsavel;
	}
	
	public void salvar (AbstractModel model){
		this.dao.salvar(model);
	}
}
