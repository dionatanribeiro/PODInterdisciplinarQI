package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.Filiacao;

@Stateless
@Local
public class FiliacaoDao extends TemplateDao<Filiacao> implements AbstractDao<Filiacao>{

	@Override
	public void insert(Filiacao Filiacao) {
		super.persistEntity(Filiacao);
	}

	@Override
	public List<Filiacao> selectAll() {
		return super.listEntity();
	}

}
