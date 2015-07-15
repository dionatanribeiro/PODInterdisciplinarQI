package br.edu.qi.euroschool.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.dao.TurmaDao;
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

	@Override
	public List<Turma> selectAll() {
		return dao.selectAll();
	}
	
	public List<Turma> selectByPeriodo(Date inicio, Date fim){
		ArrayList<Turma> turmasNoPeriodio = (ArrayList<Turma>) ((TurmaDao) dao).selectByPeriodo(inicio, fim);
		if (turmasNoPeriodio != null) {
			return turmasNoPeriodio;
		} else {
			return null;
		}
	}

}
