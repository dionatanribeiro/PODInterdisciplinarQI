package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Pessoa extends AbstractEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nome;
	private Integer cep;
	private String logradouro;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCep() {
		return cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

}
