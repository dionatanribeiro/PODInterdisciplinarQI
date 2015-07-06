package br.edu.qi.euroschool.model;

import java.io.Serializable;

import br.edu.qi.euroschool.core.WeakModel;

public class Filiacao extends WeakModel implements Serializable {

	private static final long serialVersionUID = 5585849331795513627L;

	public Filiacao(String descricao) {
		super(descricao);
	}
	
	private int tipo;

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}
