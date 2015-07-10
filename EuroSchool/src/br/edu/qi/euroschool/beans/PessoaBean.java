package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.Pessoa;

@Stateless
@Local
public class PessoaBean implements GenericBean<Pessoa> {

	@EJB(beanName = "PessoaDao")
	AbstractDao<Pessoa> dao;
	
	@Override
	public void salvar(Pessoa pessoa) {
		dao.insert(pessoa);
	}
	
	@Override
	public List<Pessoa> selectAll() {
		return dao.selectAll();
	}
	
}
