package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.weak.Etnia;

@Stateless
@Local
public class EtniaDao extends TemplateDao<Etnia> implements AbstractDao<Etnia>{

	@Override
	public void insert(Etnia etnia) {
		super.persistEntity(etnia);
	}

	@Override
	public List<Etnia> selectAll() {
		return super.listEntity();
	}

}
