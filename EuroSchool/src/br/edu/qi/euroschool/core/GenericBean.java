package br.edu.qi.euroschool.core;

public class GenericBean {

	private AbstractDao dao;
	
	public GenericBean (AbstractDao daoResponsavel){
		this.dao  = daoResponsavel;
	}
	
	public GenericBean(){		
	}
	
	public void salvar (AbstractModel model){
		System.out.print("Salvou");
	}
}
