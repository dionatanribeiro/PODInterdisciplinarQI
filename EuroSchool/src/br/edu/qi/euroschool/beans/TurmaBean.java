package br.edu.qi.euroschool.beans;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.Turma;

@Stateless
@Local
public class TurmaBean implements GenericBean<Turma> {

	@EJB(beanName = "TurmaDao")
	AbstractDao<Turma> dao;
	
	@Override
	public void salvar(Turma turma) {
		dao.insert(turma);
	}

}
