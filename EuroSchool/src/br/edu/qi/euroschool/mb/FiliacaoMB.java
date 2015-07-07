package br.edu.qi.euroschool.mb;

import java.io.Serializable;
import java.util.ArrayList;

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

	//@EJB(beanName = "FiliacaoBean")
	//GenericBean<Filiacao> bean;
	
	private TipoFiliacao tipoFiliacao;
	
	private static final long serialVersionUID = 8764298144153063175L;

	@Override
	public String salvar() {
		validaCampos();		 
		//bean.salvar(new Filiacao(getDescricao()));
		return "home";
	}

	@Override
	public void validaCampos() {
		if (getDescricao().isEmpty()) {
			
		}
	}
	
	public ArrayList<Filiacao> getTipoFiliacoes(){
		ArrayList<Filiacao> lista = new ArrayList<Filiacao>();
		lista.add(new Filiacao("Teste"));
		lista.add(new Filiacao("Teste 2"));
		lista.add(new Filiacao("Teste 3"));
		return lista;
	}

	public TipoFiliacao getTipoFiliacao() {
		return tipoFiliacao;
	}

	public void setTipoFiliacao(TipoFiliacao tipoFiliacao) {
		this.tipoFiliacao = tipoFiliacao;
	}

}
