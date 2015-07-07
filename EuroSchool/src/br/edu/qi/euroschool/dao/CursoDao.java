package br.edu.qi.euroschool.dao;

import java.util.List;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.weak.Curso;

public class CursoDao extends TemplateDao<Curso> implements AbstractDao<Curso> {

	@Override
	public void insert(Curso curso) {
		super.persistEntity(curso);
	}

	@Override
	public List<Curso> selectAll() {
		return super.listEntity();
	}

}
