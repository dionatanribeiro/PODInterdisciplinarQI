package br.edu.qi.euroschool.interfaces;

import javax.ejb.Local;

@Local
public interface LoginDaoService {

	boolean validarLogin(String user, String password);
	
}
