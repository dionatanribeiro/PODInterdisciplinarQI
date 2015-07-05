package br.edu.qi.euroschool.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.edu.qi.euroschool.core.WeakMB;

@ManagedBean
@ViewScoped
public class ReligiaoMB extends WeakMB implements Serializable {

	private static final long serialVersionUID = 8764298144153063175L;
	
	public String salvar() {		
		if (this.getDescricao().isEmpty()){
			setMsg("Informe a descrição.");
			return "";
		}else{
			return "home";
		}		
	}
}
