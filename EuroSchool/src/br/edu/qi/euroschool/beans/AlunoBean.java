package br.edu.qi.euroschool.beans;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import br.edu.qi.euroschool.core.AbstractDao;
import br.edu.qi.euroschool.core.GenericBean;
import br.edu.qi.euroschool.model.pessoas.Aluno;

@Stateless
@Local
public class AlunoBean implements GenericBean<Aluno> {

	@EJB(beanName = "AlunoDao")
	AbstractDao<Aluno> dao;
	
	@Override
	public void salvar(Aluno aluno) {
		dao.insert(aluno);
	}
	
	@Override
	public List<Aluno> selectAll() {
		return dao.selectAll();
	}
	
}
