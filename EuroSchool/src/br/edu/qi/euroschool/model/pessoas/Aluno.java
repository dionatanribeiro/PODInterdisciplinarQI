package br.edu.qi.euroschool.model.pessoas;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.AbstractEntity;

@Entity
public class Aluno extends AbstractEntity implements Serializable{

	private static final long serialVersionUID = -3616743309401147394L;
	
	private String formaPagamento;

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
}
