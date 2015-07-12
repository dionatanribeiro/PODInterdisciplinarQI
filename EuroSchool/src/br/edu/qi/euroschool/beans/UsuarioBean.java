package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.Usuario;

@Stateless
@Local
public abstract class UsuarioBean implements GenericBean<Usuario> {

	@EJB(beanName = "UsuarioDao")
	AbstractDao<Usuario> dao;
	
	@Override
	public void salvar(Usuario usuario) {
		dao.insert(usuario);
	}
	
	@Override
	public List<Usuario> selectAll() {
		return dao.selectAll();
	}

}
