package br.edu.qi.euroschool.model.weak;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import br.edu.qi.euroschool.core.WeakModel;
import br.edu.qi.euroschool.model.Pessoa;

@Entity
public class Deficiencia extends WeakModel implements Serializable {

	private static final long serialVersionUID = -7551592004440598504L;

	private String grau;

	@OneToOne(cascade=CascadeType.ALL) 
	@JoinTable(name="deficiencia_pessoa", 
			   joinColumns={@JoinColumn(name="IdDeficiencia", 
			   	referencedColumnName="id")}, 
			   inverseJoinColumns={@JoinColumn(name="IdPessoa", 
			   	referencedColumnName="id")})
	@NotFound(action = NotFoundAction.IGNORE)
	private Pessoa pessoa;
	
	public Deficiencia(String descricao) {
		super(descricao);
	}

	public Deficiencia() {
		super();
	}

	public String getGrau() {
		return grau;
	}

	public void setGrau(String grau) {
		this.grau = grau;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}