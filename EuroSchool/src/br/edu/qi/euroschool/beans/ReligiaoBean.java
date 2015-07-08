package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.weak.Religiao;

@Stateless
@Local
public class ReligiaoBean implements GenericBean<Religiao>{

	@EJB(beanName = "ReligiaoDao")
	AbstractDao<Religiao> dao;
	
	@Override
	public void salvar(Religiao religiao) {
		dao.insert(religiao);
	}

	@Override
	public List<Religiao> selectAll() {
		return dao.selectAll();
	}
	
}
