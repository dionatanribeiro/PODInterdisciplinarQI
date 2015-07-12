package br.edu.qi.euroschool.dao;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.Query;

import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.interfaces.LoginDaoService;
import br.edu.qi.euroschool.model.Usuario;

@Stateless
@Local
public class LoginDao extends TemplateDao<Usuario> implements LoginDaoService{

	@Override
	public boolean validarLogin(String login, String password) {
		Query query = getEntityManager().createQuery("select u from Usuario u " +
				"where u.login = :login and " +
				" u.senha = :password");
		query.setParameter("login", login);
		query.setParameter("password", password);
		
		boolean isFindLogin = query.getResultList().isEmpty();
		if (!isFindLogin) {
			return true;
		} else {
			return false;
		}
	}
	
}
