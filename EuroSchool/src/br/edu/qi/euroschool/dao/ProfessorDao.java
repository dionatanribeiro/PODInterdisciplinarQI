package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.pessoas.Professor;

@Stateless
@Local
public class ProfessorDao extends TemplateDao<Professor> implements AbstractDao<Professor>{

	@Override
	public void insert(Professor professor) {
		super.persistEntity(professor);
	}

	@Override
	public List<Professor> selectAll() {
		return super.listEntity();
	}

}
