package br.edu.qi.euroschool.util;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

public class MBUtils {

	private static final String CAMPOS_OBRIGATORIOS_NAO_PREENCHIDOS = "Campos obrigatórios não preenchidos!";
	
	public static void buildMessage(String idElementoNaTela, String mensagem) {
		FacesMessage facesMessage = new FacesMessage(mensagem);
		FacesContext.getCurrentInstance().addMessage(idElementoNaTela,
				facesMessage);
	}

	public static ExternalContext getContexto() {
		return FacesContext.getCurrentInstance().getExternalContext();
	}

	public static void setAttribute(String nome, Object valor) {
		getContexto().getSessionMap().put(nome, valor);
	}

	public static Object getAttribute(String nome) {
		return getContexto().getSessionMap().get(nome);
	}
	
	public static void encerrarSessao(){
		getContexto().invalidateSession();		
	}
	
	public static void redirecionarPara(String url) throws IOException{
		getContexto().redirect(url);
	}
	
	public static void erroCamposObrigatorios() {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", CAMPOS_OBRIGATORIOS_NAO_PREENCHIDOS));
	}
}
