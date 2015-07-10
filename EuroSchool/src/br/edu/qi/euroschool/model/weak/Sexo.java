package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Sexo extends WeakModel implements Serializable {

	private static final long serialVersionUID = -4526191311525527806L;

	public Sexo(String descricao) {
		super(descricao);
	}

	public Sexo(){
		super();
	}

}