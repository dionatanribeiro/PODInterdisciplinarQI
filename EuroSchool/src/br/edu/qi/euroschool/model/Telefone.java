package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.edu.qi.euroschool.core.AbstractEntity;

@Entity
public class Telefone extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = -3807877615121718970L;

	private String numero;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pessoaId", referencedColumnName = "ID", nullable = false, unique = true)
	private Pessoa pessoa;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
