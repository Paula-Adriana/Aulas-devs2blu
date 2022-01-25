package br.com.devs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoAgenda {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public DaoAgenda () {
		emf = Persistence.createEntityManagerFactory("JPAPU");
		em = emf.createEntityManager();
	}
	
	public void salvar(Agenda agenda) {
		em.getTransaction().begin();
		em.persist(agenda);
		em.getTransaction().commit();
		em.close();
	}
}


