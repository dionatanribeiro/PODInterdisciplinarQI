package br.edu.qi.euroschool.model.pessoas;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.AbstractEntity;

@Entity
public class Professor extends AbstractEntity implements Serializable{

	private static final long serialVersionUID = -2742172652694601714L;

	private String formacao;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}
}
