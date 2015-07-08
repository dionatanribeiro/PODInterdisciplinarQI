package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.weak.TipoFiliacao;

@Stateless
@Local
public class TipoFiliacaoBean implements GenericBean<TipoFiliacao> {

	@EJB(beanName = "TipoFiliacaoDao")
	AbstractDao<TipoFiliacao> dao;
	
	@Override
	public void salvar(TipoFiliacao t) {
		dao.insert(t);
	}

	@Override
	public List<TipoFiliacao> selectAll() {
		return dao.selectAll();
	}

}
