package br.edu.qi.euroschool.dao;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.qi.euroschool.model.Pessoa;

@Stateless
@Local
public class PessoaDao {

	public void insert(Pessoa pessoa) {
		EntityManagerFactory factory = null;
		EntityManager manager;
		
		try {
			factory = Persistence.createEntityManagerFactory("pessoa");
			manager = factory.createEntityManager();
			manager.getTransaction().begin();    
			manager.persist(pessoa);
			manager.getTransaction().commit();  
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (factory != null) {
				factory.close();
			}
		}
	}

}
