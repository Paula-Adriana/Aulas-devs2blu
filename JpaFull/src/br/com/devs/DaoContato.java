package br.com.devs;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoContato {
	EntityManagerFactory emf;
	EntityManager em;

	public DaoContato() {
		emf = Persistence.createEntityManagerFactory("JPAPU");
		em = emf.createEntityManager();
	}

	public void salvar(Contato contato) {
		em.getTransaction().begin();
		em.persist(contato);
		em.getTransaction().commit();
		em.close();
	}
	
	public Contato pegarUm (Long id) {
		Contato contato = em.find(Contato.class, id);
		return contato;
	}
	public boolean update(Contato contato) {
    	 Contato contatoVindodoBanco = em.find(Contato.class, contato.getId());
    	 contatoVindodoBanco.setNome(contato.getNome());
    	 contatoVindodoBanco.setEmail(contato.getEmail());
    	 contatoVindodoBanco.setCelular(contato.getCelular());
    	 
    	 em.getTransaction().begin();
    	 em.merge(contato);
    	 em.getTransaction().commit();
    	 em.close();
    	 
    	 return true;
     }
}
	

