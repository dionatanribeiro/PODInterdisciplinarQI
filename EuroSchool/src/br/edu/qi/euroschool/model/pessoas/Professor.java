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
public class Professor extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = -2742172652694601714L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdPessoa", referencedColumnName = "ID", nullable = false, unique = false)
	private Pessoa pessoa;
	
	private String formacao;
	
	@OneToOne(cascade=CascadeType.ALL) 
	@JoinTable(name="professor_turma", 
			   joinColumns={@JoinColumn(name="IdProfessor", 
			   	referencedColumnName="id")}, 
			   inverseJoinColumns={@JoinColumn(name="IdTurma", 
			   	referencedColumnName="id")})
	@NotFound(action = NotFoundAction.IGNORE)
	private Turma turma;

	public Professor(String formacao, Pessoa pessoa) {
		super();
		this.formacao = formacao;
		this.pessoa = pessoa;		
	}
	
	public Professor() {
		super();
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
