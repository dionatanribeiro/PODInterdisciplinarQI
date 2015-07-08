package br.edu.qi.euroschool.model.pessoas;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.edu.qi.euroschool.core.AbstractEntity;
import br.edu.qi.euroschool.model.Pessoa;

@Entity
public class Aluno extends AbstractEntity implements Serializable{

	private static final long serialVersionUID = -3616743309401147394L;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdPessoa", referencedColumnName = "ID", nullable = false, unique = false)
	private Pessoa pessoa;
	private String formaPagamento;
	
	public Aluno(String formaPagamento) {
		super();
		this.formaPagamento = formaPagamento;
	}
	
	public Aluno(String formaPagamento, Pessoa pessoa) {
		super();
		this.formaPagamento = formaPagamento;
		this.pessoa = pessoa;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
