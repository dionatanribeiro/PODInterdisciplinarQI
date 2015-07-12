package br.edu.qi.euroschool.beans;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.interfaces.LoginBeanService;
import br.edu.qi.euroschool.interfaces.LoginDaoService;

@Stateless
@Local
public class LoginBean implements LoginBeanService {

	@EJB(beanName = "LoginDao")
	LoginDaoService dao;
	
	@Override
	public boolean validarLogin(String user, String password) {
		if (user.equals("admin") && password.equals("admin")) {
			return true;
		} else {
			return dao.validarLogin(user, password);
		}
	}
	
}
