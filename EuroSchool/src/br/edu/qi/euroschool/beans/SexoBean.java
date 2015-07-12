package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.weak.Sexo;

@Stateless
@Local
public class SexoBean implements GenericBean<Sexo>{

	@EJB(beanName = "SexoDao")
	AbstractDao<Sexo> dao;
	
	@Override
	public void salvar(Sexo sexo) {
		dao.insert(sexo);
	}

	@Override
	public List<Sexo> selectAll() {
		return dao.selectAll();
	}

}
