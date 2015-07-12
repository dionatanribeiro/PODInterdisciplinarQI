package br.edu.qi.euroschool.dao;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.TemplateDao;
import br.edu.qi.euroschool.model.Usuario;

@Stateless
@Local
public class UsuarioDao extends TemplateDao<Usuario> implements	AbstractDao<Usuario> {

	@Override
	public void insert(Usuario usuario) {
		super.persistEntity(usuario);
	}

	@Override
	public List<Usuario> selectAll() {
		return super.listEntity();
	}

}
