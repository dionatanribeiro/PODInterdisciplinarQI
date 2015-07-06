package br.edu.qi.euroschool.model.itens;

import br.edu.qi.euroschool.core.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class Servico extends AbstractEntity {
	
	private String especificacao;
	private int duracao;
	
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
}
