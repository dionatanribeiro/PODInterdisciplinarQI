package br.edu.qi.euroschool.mb;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.core.WeakMB;
import br.edu.qi.euroschool.model.weak.Etnia;

@ManagedBean
@ViewScoped
public class EtniaMB extends WeakMB implements Serializable {

	private static final long serialVersionUID = -2188909155334490668L;

	@EJB(beanName = "EtniaBean")
	GenericBean<Etnia> bean;

	@Override
	public String salvar() {
		validaCampos();		 
		bean.salvar(new Etnia(getDescricao()));
		return "home";
	}

	@Override
	public void validaCampos() {
		if (getDescricao().isEmpty()) {
			
		}
	}
	
	public List<Etnia> getListEtnia() {
		return bean.selectAll();
	}
}
