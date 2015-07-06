package br.edu.qi.euroschool.core;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.ejb.Local;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

@Local
public abstract class TemplateDao<T> {

	EntityManagerFactory factory = null;
	EntityManager manager;
	
	protected void persistEntity(T t) {
		try {
			factory = Persistence.createEntityManagerFactory("EuroSchoolDB");
			manager = factory.createEntityManager();
			manager.getTransaction().begin();    
			manager.persist(t);
			manager.getTransaction().commit();  
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (factory != null) {
				factory.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	protected List<T> listEntity() {
		try {
			factory = Persistence.createEntityManagerFactory("EuroSchoolDB");
			manager = factory.createEntityManager();
			Query query = manager.createQuery("select t from " + getTypeClass().getName() + " t");
			List<T> listaResultado = query.getResultList(); 
			return listaResultado;
		} catch (Exception ex) {
			System.out.println(ex);
		} finally {
			if (factory != null) {
				factory.close();
			}
		}
		return null;
	}

	private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
        return clazz;
    }
	
}
