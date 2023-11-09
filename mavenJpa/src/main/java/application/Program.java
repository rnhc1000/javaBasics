package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		Pessoa pessoa = em.find(Pessoa.class, 2);
		System.out.println(pessoa);
		em.getTransaction().begin();
		em.remove(pessoa);
		em.getTransaction().commit();
		System.out.println("Done!");
		em.close();
		emf.close();
	}

}
