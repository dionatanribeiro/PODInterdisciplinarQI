package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Religiao extends WeakModel implements Serializable{

	private static final long serialVersionUID = 3646794606752930191L;

	public Religiao(String descricao) {
		super(descricao);
	}
	
	public Religiao() {
		super();
	}

}
