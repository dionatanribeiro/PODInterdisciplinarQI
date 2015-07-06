package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Horario extends WeakModel implements Serializable{

	private static final long serialVersionUID = 659355606301514309L;

	public Horario(String descricao) {
		super(descricao);
	}

	
}
