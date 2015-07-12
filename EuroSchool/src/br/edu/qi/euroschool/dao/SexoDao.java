package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.weak.Sexo;

@Stateless
@Local
public class SexoDao extends TemplateDao<Sexo> implements AbstractDao<Sexo>{

	@Override
	public void insert(Sexo sexo) {
		super.persistEntity(sexo);
	}

	@Override
	public List<Sexo> selectAll() {
		return super.listEntity();
	}

}
