package br.edu.qi.euroschool.model.pessoas;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import br.edu.qi.euroschool.core.AbstractEntity;
import br.edu.qi.euroschool.model.Pessoa;
import br.edu.qi.euroschool.model.Turma;

@Entity
public class Aluno extends AbstractEntity implements Serializable{

	private static final long serialVersionUID = -3616743309401147394L;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdPessoa", referencedColumnName = "ID", nullable = false, unique = false)
	private Pessoa pessoa;
	
	private String formaPagamento;
	
	@ManyToMany(mappedBy="listaAluno")
	private List<Turma> turmas;
	
	public Aluno(String formaPagamento) {
		super();
		this.formaPagamento = formaPagamento;
	}
	
	public Aluno(String formaPagamento, Pessoa pessoa) {
		super();
		this.formaPagamento = formaPagamento;
		this.pessoa = pessoa;
	}
	
	public Aluno() {
		super();
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
