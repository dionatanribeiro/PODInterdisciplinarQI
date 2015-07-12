package br.edu.qi.euroschool.model.itens;

import br.edu.qi.euroschool.core.AbstractEntity;
import br.edu.qi.euroschool.model.Item;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Servico extends AbstractEntity {

	private String especificacao;
	private int duracao;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdItem", referencedColumnName = "ID", nullable = false, unique = false)
	private Item item;

	public String getEspecificacao() {
		return especificacao;
	}

	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
