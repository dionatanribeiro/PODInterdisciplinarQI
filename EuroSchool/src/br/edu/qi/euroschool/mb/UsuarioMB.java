package br.edu.qi.euroschool.mb;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.qi.euroschool.core.AbstractMB;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.Pessoa;
import br.edu.qi.euroschool.model.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioMB extends AbstractMB implements Serializable{

	private static final long serialVersionUID = -4779216431970580936L;

	@EJB(beanName = "UsuarioBean")
	GenericBean<Usuario> bean;
	
	private String login;
	private String senha;
	private Pessoa pessoa;
	
	@Override
	public void validaCampos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String salvar() {
		validaCampos();
		Usuario usuario = new Usuario();
		usuario.setLogin(login);
		usuario.setSenha(senha);
		usuario.setPessoa(pessoa);
		bean.salvar(usuario);
		return "home";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
}
