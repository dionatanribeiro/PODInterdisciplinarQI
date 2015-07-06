package br.edu.qi.euroschool.model.weak;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Religiao extends WeakModel {

	public Religiao(String descricao) {
		super(descricao);
	}

}
