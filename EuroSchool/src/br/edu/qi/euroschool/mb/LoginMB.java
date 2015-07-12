package br.edu.qi.euroschool.mb;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;

import br.edu.qi.euroschool.beans.SessionBean;
import br.edu.qi.euroschool.interfaces.LoginBeanService;
import br.edu.qi.euroschool.util.MBUtils;

@ManagedBean
@SessionScoped
public class LoginMB implements Serializable {

	@EJB(beanName = "LoginBean")
	LoginBeanService bean;
	
	private static final long serialVersionUID = 1094801825228386363L;

	private String pwd;
	private String msg;
	private String user;

	public String validaUsuario() {
		boolean isValid = bean.validarLogin(user, pwd);
		if (isValid) {
			HttpSession session = SessionBean.getSession();
			session.setAttribute("username", user);
			return "home";
		} else {
			MBUtils.erroLogin();
			return "login";
		}
	}
	
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String logout() {
		HttpSession session = SessionBean.getSession();
		session.invalidate();
		return "login";
	}
	
}
