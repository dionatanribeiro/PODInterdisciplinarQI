package br.edu.qi.euroschool.mb;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.core.WeakMB;
import br.edu.qi.euroschool.model.Turma;

@ManagedBean
@ViewScoped
public class TurmaMB extends WeakMB implements Serializable{

	private static final long serialVersionUID = 4224321469359297635L;

	@EJB(beanName = "TurmaBean")
	GenericBean<Turma> bean;
	
	@Override
	public void validaCampos() {
		if (getDescricao().isEmpty()) {
			
		}
	}
	
	public List<Turma> getListTurma() {
		return bean.selectAll();
	}

	@Override
	public String salvar() {
		validaCampos();
		bean.salvar(new Turma());
		return "home";
	}

}
