package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.weak.Curso;

@Stateless
@Local
public class CursoBean implements GenericBean<Curso> {

	@EJB(beanName = "CursoDao")
	AbstractDao<Curso> dao;
	
	@Override
	public void salvar(Curso curso) {
		dao.insert(curso);
	}

	@Override
	public List<Curso> selectAll() {
		return dao.selectAll();
	}

}
