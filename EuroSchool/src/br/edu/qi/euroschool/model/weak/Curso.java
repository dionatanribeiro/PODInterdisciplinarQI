package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Curso extends WeakModel implements Serializable {

	private static final long serialVersionUID = 9131807816782780366L;

	public Curso(String descricao) {
		super(descricao);
	}
	
	public Curso(){
		super();
	}

}