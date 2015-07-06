package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.Pessoa;

@Stateless
@Local
public class PessoaDao extends TemplateDao<Pessoa> implements AbstractDao<Pessoa>{

	@Override
	public void insert(Pessoa t) {
		super.persistEntity(t);
	}

	@Override
	public List<Pessoa> selectAll() {
		return super.listEntity();
	}

}
