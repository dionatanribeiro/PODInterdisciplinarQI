package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.weak.Deficiencia;

@Stateless
@Local
public class DeficienciaDao extends TemplateDao<Deficiencia> implements AbstractDao<Deficiencia>{

	@Override
	public void insert(Deficiencia deficiencia) {
		super.persistEntity(deficiencia);
	}

	@Override
	public List<Deficiencia> selectAll() {
		return super.listEntity();
	}

}
