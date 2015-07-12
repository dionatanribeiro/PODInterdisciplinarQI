package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.weak.Etnia;

@Stateless
@Local
public class EtniaBean implements GenericBean<Etnia>{

	@EJB(beanName = "EtniaDao")
	AbstractDao<Etnia> dao;
	
	@Override
	public void salvar(Etnia etnia) {
		dao.insert(etnia);
	}

	@Override
	public List<Etnia> selectAll() {
		return dao.selectAll();
	}
	
}
