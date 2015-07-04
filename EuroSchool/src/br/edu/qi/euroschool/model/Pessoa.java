package br.edu.qi.euroschool.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa {

	@Id
	private Integer idPessoa;

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

}
