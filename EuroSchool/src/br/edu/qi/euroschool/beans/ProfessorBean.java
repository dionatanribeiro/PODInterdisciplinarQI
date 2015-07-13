package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.pessoas.Professor;

@Stateless
@Local
public class ProfessorBean implements GenericBean<Professor> {

	@EJB(beanName = "ProfessorDao")
	AbstractDao<Professor> dao;
	
	@Override
	public void salvar(Professor professor) {
		dao.insert(professor);
	}
	
	@Override
	public List<Professor> selectAll() {
		return dao.selectAll();
	}
	
}
