package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Etnia extends WeakModel implements Serializable {

	private static final long serialVersionUID = 8883830144453068399L;

	public Etnia(String descricao) {
		super(descricao);
	}


}