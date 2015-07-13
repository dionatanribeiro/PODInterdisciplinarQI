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
import br.edu.qi.euroschool.model.pessoas.Aluno;

@ManagedBean
@ViewScoped
public class AlunoMB extends AbstractMB implements Serializable {

	@EJB(beanName = "AlunoBean")
	GenericBean<Aluno> bean;

	private static final long serialVersionUID = 8764298144153063175L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IdPessoa", referencedColumnName = "ID", nullable = false, unique = false)
	private Pessoa pessoa;
	private String formaPagamento;

	public String salvar() {
		validaCampos();
		bean.salvar(new Aluno(getFormaPagamento(), getPessoa()));
		return "home";
	}
	
	public List<Aluno> getListAluno() {
		return bean.selectAll();
	}

	public void validaCampos() {
		if (getFormaPagamento().isEmpty()) {

		}
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}
