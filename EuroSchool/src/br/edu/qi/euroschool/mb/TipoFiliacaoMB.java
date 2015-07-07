package br.edu.qi.euroschool.mb;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.core.WeakMB;
import br.edu.qi.euroschool.model.weak.TipoFiliacao;

@ManagedBean
@ViewScoped
public class TipoFiliacaoMB extends WeakMB implements Serializable {

	@EJB(beanName = "TipoFiliacaoBean")
	GenericBean<TipoFiliacao> bean;
	
	private static final long serialVersionUID = 8764298144153063175L;

	@Override
	public String salvar() {
		validaCampos();		 
		bean.salvar(new TipoFiliacao(getDescricao()));
		return "home";
	}

	@Override
	public void validaCampos() {
		if (getDescricao().isEmpty()) {
			
		}
	}
}
