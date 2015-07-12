package br.edu.qi.euroschool.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import br.edu.qi.euroschool.core.AbstractEntity;

@Entity
public class Usuario extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 3995055352229393673L;
	private String login;
	private String senha;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pessoaId", referencedColumnName = "ID", nullable = false, unique = true)
	public Pessoa pessoa;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
