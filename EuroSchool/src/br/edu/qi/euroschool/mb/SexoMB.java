package br.edu.qi.euroschool.mb;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.core.WeakMB;
import br.edu.qi.euroschool.model.weak.Sexo;

@ManagedBean
@ViewScoped
public class SexoMB extends WeakMB implements Serializable {

	private static final long serialVersionUID = 3395647637671119694L;
	
	@EJB(beanName = "SexoBean")
	GenericBean<Sexo> bean;

	@Override
	public String salvar() {
		validaCampos();		 
		bean.salvar(new Sexo(getDescricao()));
		return "home";
	}

	@Override
	public void validaCampos() {
		if (getDescricao().isEmpty()) {
			
		}
	}
	
	public List<Sexo> getListSexo() {
		return bean.selectAll();
	}
}
