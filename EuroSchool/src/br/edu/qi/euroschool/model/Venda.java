package br.edu.qi.euroschool.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.edu.qi.euroschool.core.AbstractEntity;

@Entity
public class Venda extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 8591680186760210L;

	@Column(columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;

	private double valorTotal;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pessoaId", referencedColumnName = "ID", nullable = false, unique = true)
	public Pessoa pessoa;
	
	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
