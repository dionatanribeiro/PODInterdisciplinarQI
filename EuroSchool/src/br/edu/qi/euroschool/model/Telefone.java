package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;

import br.edu.qi.euroschool.core.AbstractEntity;

@Entity
public class Telefone extends AbstractEntity implements Serializable{
	
	private static final long serialVersionUID = -3807877615121718970L;
	private String numero;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	

}
