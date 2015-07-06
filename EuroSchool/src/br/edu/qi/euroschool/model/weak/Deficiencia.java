package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Deficiencia extends WeakModel implements Serializable {

	public Deficiencia(String descricao) {
		super(descricao);
	}

	private static final long serialVersionUID = 7839482728905987633L;

}