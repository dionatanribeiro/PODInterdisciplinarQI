package br.edu.qi.euroschool.model.itens;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.AbstractEntity;

@Entity
public class Produto extends AbstractEntity {

	private int quantidade;
	private String local;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}
	
}
