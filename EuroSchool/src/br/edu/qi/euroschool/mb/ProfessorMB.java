package br.edu.qi.euroschool.mb;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.edu.qi.euroschool.core.AbstractMB;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.Pessoa;
import br.edu.qi.euroschool.model.pessoas.Professor;

@ManagedBean
@ViewScoped
public class ProfessorMB extends AbstractMB implements Serializable {


	@EJB(beanName = "ProfessorBean")
	GenericBean<Professor> bean;

	private static final long serialVersionUID = 8764298144153063175L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdPessoa", referencedColumnName = "ID", nullable = false, unique = false)
	private Pessoa pessoa;
	private String formacao;

	public String salvar() {
		validaCampos();
		bean.salvar(new Professor(getFormacao(), getPessoa()));
		return "home";
	}
	
	public List<Professor> getListProfessor() {
		return bean.selectAll();
	}

	public void validaCampos() {
		if (getFormacao().isEmpty()) {

		}
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

}
