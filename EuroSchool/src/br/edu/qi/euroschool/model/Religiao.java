package br.edu.qi.euroschool.model;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Religiao extends WeakModel {

	public Religiao(String descricao) {
		super(descricao);
	}

}
