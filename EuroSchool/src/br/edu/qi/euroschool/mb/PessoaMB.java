package br.edu.qi.euroschool.mb;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.AbstractMB;
import br.edu.qi.euroschool.model.Pessoa;

@ManagedBean
@SessionScoped
public class PessoaMB extends AbstractMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB(beanName = "PessoaDao")
	private AbstractDao<Pessoa> dao;

	private String nome;

	public void cadastrar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Rapaz");
		dao.insert(pessoa);
	}

	@Override
	public void validaCampos() {
		// TODO Auto-generated method stub

	}

	@Override
	public String salvar() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}