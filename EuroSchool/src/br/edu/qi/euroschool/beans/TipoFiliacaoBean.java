package br.edu.qi.euroschool.beans;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.weak.TipoFiliacao;

@Stateless
@Local
public class TipoFiliacaoBean implements GenericBean<TipoFiliacao> {

	@Override
	public void salvar(TipoFiliacao t) {
		// TODO Auto-generated method stub
	}

}
