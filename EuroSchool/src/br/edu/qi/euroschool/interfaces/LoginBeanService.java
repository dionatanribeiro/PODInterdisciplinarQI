package br.edu.qi.euroschool.interfaces;

import javax.ejb.Local;

@Local
public interface LoginBeanService {

	boolean validarLogin(String user, String password);
	
}
