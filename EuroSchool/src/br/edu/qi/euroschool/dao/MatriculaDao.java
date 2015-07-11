package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.Matricula;

@Stateless
@Local
public class MatriculaDao extends TemplateDao<Matricula> implements AbstractDao<Matricula>{

	@Override
	public void insert(Matricula Matricula) {
		super.persistEntity(Matricula);
	}

	@Override
	public List<Matricula> selectAll() {
		return super.listEntity();
	}

}
