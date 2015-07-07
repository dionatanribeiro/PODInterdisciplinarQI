package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.Turma;

@Stateless
@Local
public class TurmaDao extends TemplateDao<Turma> implements AbstractDao<Turma> {

	@Override
	public void insert(Turma turma) {
		super.persistEntity(turma);
	}

	@Override
	public List<Turma> selectAll() {
		return super.listEntity();
	}

}
