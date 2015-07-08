package br.edu.qi.euroschool.mb;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.core.WeakMB;
import br.edu.qi.euroschool.model.Filiacao;
import br.edu.qi.euroschool.model.weak.TipoFiliacao;

@ManagedBean
@ViewScoped
public class FiliacaoMB extends WeakMB implements Serializable {

	@EJB(beanName = "FiliacaoBean")
	GenericBean<Filiacao> bean;

	private static final long serialVersionUID = 8764298144153063175L;

	private TipoFiliacao tipoFiliacao;

	@Override
	public String salvar() {
		validaCampos();
		bean.salvar(new Filiacao(getDescricao(), getTipoFiliacao()));
		return "home";
	}

	@Override
	public void validaCampos() {
		if (getDescricao().isEmpty()) {

		}
	}

	public TipoFiliacao getTipoFiliacao() {
		return tipoFiliacao;
	}

	public void setTipoFiliacao(TipoFiliacao tipoFiliacao) {
		this.tipoFiliacao = tipoFiliacao;
	}

}
