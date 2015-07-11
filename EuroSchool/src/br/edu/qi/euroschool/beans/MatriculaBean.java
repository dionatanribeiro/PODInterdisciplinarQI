package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.Matricula;

@Stateless
@Local
public class MatriculaBean implements GenericBean<Matricula> {

	@EJB(beanName = "MatriculaDao")
	AbstractDao<Matricula> dao;
	
	@Override
	public void salvar(Matricula matricula) {
		dao.insert(matricula);
	}
	
	@Override
	public List<Matricula> selectAll() {
		return dao.selectAll();
	}
	
}
