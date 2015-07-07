package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.weak.Curso;

@Stateless
@Local
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
