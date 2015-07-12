package br.edu.qi.euroschool.mb;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class MessagesMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private static final String NENHUM_REGISTRO_FOI_ENCONTRADO = "Nenhum registro foi encontrado";
	
	public String getTabelaVazia() {
		return NENHUM_REGISTRO_FOI_ENCONTRADO;
	}
	
	public static void erro() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", "Ocorreu um problema durante a execução da operação!"));
	}
	
}
