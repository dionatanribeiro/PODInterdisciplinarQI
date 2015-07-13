package br.edu.qi.euroschool.model.pessoas;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

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
	
	@OneToOne(cascade=CascadeType.ALL) 
	@JoinTable(name="aluno_turma", 
			   joinColumns={@JoinColumn(name="IdAluno", 
			   	referencedColumnName="id")}, 
			   inverseJoinColumns={@JoinColumn(name="IdTurma", 
			   	referencedColumnName="id")})
	@NotFound(action = NotFoundAction.IGNORE)
	private Turma turma;
	
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

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
	
	@Override
	public String toString() {
//		return String.format("%s[id=%d]", getPessoa().getNome(), getId());
		return getPessoa().getNome();
	}

}
