package br.edu.qi.euroschool.beans;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;

@Stateless
@Local
public class ReligiaoBean extends GenericBean{

	public ReligiaoBean(AbstractDao daoResponsavel) {
		super(daoResponsavel);
	}

	
}
