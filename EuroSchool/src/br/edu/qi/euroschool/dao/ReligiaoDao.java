package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.weak.Religiao;

@Stateless
@Local
public class ReligiaoDao extends TemplateDao<Religiao> implements AbstractDao<Religiao>{

	@Override
	public void insert(Religiao religiao) {
		super.persistEntity(religiao);
	}

	@Override
	public List<Religiao> selectAll() {
		return super.listEntity();
	}

}
