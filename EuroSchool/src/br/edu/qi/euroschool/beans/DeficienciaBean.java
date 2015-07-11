package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.weak.Deficiencia;

@Stateless
@Local
public class DeficienciaBean implements GenericBean<Deficiencia>{

	@EJB(beanName = "DeficienciaDao")
	AbstractDao<Deficiencia> dao;
	
	@Override
	public void salvar(Deficiencia deficiencia) {
		dao.insert(deficiencia);
	}

	@Override
	public List<Deficiencia> selectAll() {
		return dao.selectAll();
	}
	
}
