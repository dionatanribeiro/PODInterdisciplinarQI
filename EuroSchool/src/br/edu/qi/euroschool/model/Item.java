package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.WeakModel;

@Entity
public class Item extends WeakModel implements Serializable {

	private static final long serialVersionUID = 3905288319116824506L;

	public Item(String descricao) {
		super(descricao);
	}

	private float valor;

	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}

}
