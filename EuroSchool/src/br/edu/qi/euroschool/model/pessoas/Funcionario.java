package br.edu.qi.euroschool.model.pessoas;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.edu.qi.euroschool.core.AbstractEntity;
import br.edu.qi.euroschool.model.Pessoa;

@Entity
public class Funcionario extends AbstractEntity implements Serializable{

	private static final long serialVersionUID = 8046037200590576980L;
	
	@Column(columnDefinition = "DATETIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtAdmissao;
	
	private String cargo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdPessoa", referencedColumnName = "ID", nullable = false, unique = false)
	private Pessoa pessoa;

	public Date getDtAdmissao() {
		return dtAdmissao;
	}

	public void setDtAdmissao(Date dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
