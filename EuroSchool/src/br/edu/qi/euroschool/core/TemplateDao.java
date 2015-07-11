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

	private EntityManager getEntityManager() {
		if (factory == null) {
			factory = Persistence.createEntityManagerFactory("EuroSchoolDB");
			manager = factory.createEntityManager();
		}
		return manager;
	}
	
	protected void persistEntity(T t) {
		try {
			getEntityManager().getTransaction().begin();    
			getEntityManager().persist(t);
			getEntityManager().getTransaction().commit();  
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
			Query query = getEntityManager().createQuery("select t from " + getTypeClass().getName() + " t");
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
	
	@SuppressWarnings("unchecked")
	protected List<T> listEntity(String fields, String filtro) {
		try {
			String qry = "select "+ fields +" from " + getTypeClass().getName() + " t ";
			if (!filtro.isEmpty()){
				qry += "where " + filtro; 
			}
			Query query = getEntityManager().createQuery(qry);
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
	
	@SuppressWarnings("unchecked")
	protected T findById(Long id) {
		try {
			Query query = getEntityManager().createQuery("select t from " + getTypeClass().getName() + " t where id =" + id);
			T resultado = (T) query.getResultList().get(0); 
			return resultado;
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
                .getGenericSuperclass()).getActualTypeArguments()[0];
        return clazz;
    }
	
	public static void main(String[] args) {
		EntityManagerFactory teste = Persistence.createEntityManagerFactory("EuroSchoolDB");
	}
	
}
