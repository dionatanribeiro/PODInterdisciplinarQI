package br.edu.qi.euroschool.beans;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.Filiacao;

@Stateless
@Local
public class FiliacaoBean implements GenericBean<Filiacao> {

	@EJB(beanName = "FiliacaoDao")
	AbstractDao<Filiacao> dao;
	
	@Override
	public void salvar(Filiacao filiacao) {
		dao.insert(filiacao);
	}
	
}
