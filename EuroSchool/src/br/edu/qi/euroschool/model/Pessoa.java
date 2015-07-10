package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.edu.qi.euroschool.core.AbstractEntity;
import br.edu.qi.euroschool.model.weak.Religiao;

@Entity
public class Pessoa extends AbstractEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	private String nome;
	private Integer cep;
	private String logradouro;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdReligiao", referencedColumnName = "ID", nullable = false, unique = false)
	private Religiao religiao;

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

	public Religiao getReligiao() {
		return religiao;
	}

	public void setReligiao(Religiao religiao) {
		this.religiao = religiao;
	}

}
