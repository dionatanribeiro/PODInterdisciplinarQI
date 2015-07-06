package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class TipoFiliacao extends WeakModel implements Serializable{

	private static final long serialVersionUID = -4056960566084955381L;

	public TipoFiliacao(String descricao) {
		super(descricao);
	}

}