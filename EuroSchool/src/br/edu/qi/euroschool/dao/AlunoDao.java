package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.pessoas.Aluno;

@Stateless
@Local
public class AlunoDao extends TemplateDao<Aluno> implements AbstractDao<Aluno>{

	@Override
	public void insert(Aluno Aluno) {
		super.persistEntity(Aluno);
	}

	@Override
	public List<Aluno> selectAll() {
		return super.listEntity();
	}

}
