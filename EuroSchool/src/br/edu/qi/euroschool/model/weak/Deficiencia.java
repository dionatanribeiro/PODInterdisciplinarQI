package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Deficiencia extends WeakModel implements Serializable {

	private static final long serialVersionUID = -7551592004440598504L;

	public Deficiencia(String descricao) {
		super(descricao);
	}
	
	public Deficiencia(){
		super();
	}


}