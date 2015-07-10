package br.edu.qi.euroschool.mb;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.core.WeakMB;
import br.edu.qi.euroschool.model.weak.Religiao;

@ManagedBean
@ViewScoped
public class ReligiaoMB extends WeakMB implements Serializable {

	@EJB(beanName = "ReligiaoBean")
	GenericBean<Religiao> bean;

	private static final long serialVersionUID = 8764298144153063175L;

	@Override
	public String salvar() {
		validaCampos();		 
		bean.salvar(new Religiao(getDescricao()));
		return "home";
	}

	@Override
	public void validaCampos() {
		if (getDescricao().isEmpty()) {
			
		}
	}
	
	public List<Religiao> getListReligiao() {
		return bean.selectAll();
	}
}
