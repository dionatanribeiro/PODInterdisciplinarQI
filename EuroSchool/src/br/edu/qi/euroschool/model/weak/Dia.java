package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Dia extends WeakModel implements Serializable {

	private static final long serialVersionUID = 7553189164134422925L;

	public Dia(String descricao) {
		super(descricao);
	}

	public Dia(){
		super();
	}

}