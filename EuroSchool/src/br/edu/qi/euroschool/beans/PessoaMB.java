package br.edu.qi.euroschool.beans;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.qi.euroschool.dao.PessoaDao;
import br.edu.qi.euroschool.model.Pessoa;

@ManagedBean
@SessionScoped
public class PessoaMB implements Serializable{

	private static final long serialVersionUID = 1L;

	@EJB
	private PessoaDao dao;
	
	public void cadastrar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Teste");
		dao.insert(pessoa);
	}
	
}