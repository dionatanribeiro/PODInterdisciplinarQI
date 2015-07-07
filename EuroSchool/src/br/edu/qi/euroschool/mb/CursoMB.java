package br.edu.qi.euroschool.mb;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.core.WeakMB;
import br.edu.qi.euroschool.model.weak.Curso;

@ManagedBean
@ViewScoped
public class CursoMB extends WeakMB implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB(beanName = "CursoBean")
	private GenericBean<Curso> bean;
	
	@Override
	public void validaCampos() {
		if (getDescricao().isEmpty()) {
			
		}
	}

	@Override
	public String salvar() {
		validaCampos();
		bean.salvar(new Curso("blabla"));
		return "home";
	}

}
