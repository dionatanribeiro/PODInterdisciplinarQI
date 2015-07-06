package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.weak.TipoFiliacao;

@Stateless
@Local
public class TipoFiliacaoDao extends TemplateDao<TipoFiliacao> implements AbstractDao<TipoFiliacao>{

	@Override
	public void insert(TipoFiliacao TipoFiliacao) {
		super.persistEntity(TipoFiliacao);
	}

	@Override
	public List<TipoFiliacao> selectAll() {
		return super.listEntity();
	}

}
