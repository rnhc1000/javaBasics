package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa pessoaOne = new Pessoa(null, "Ricardo Ferreira", "ricardo@ferreiras.dev.br");
		Pessoa pessoaTwo = new Pessoa(null, "Ricardo Ferreira", "rnhc1000@gmail.com");
		Pessoa pessoaThree = new Pessoa(null, "Ricardo Ferreira", "rnhc1000@hotmail.com");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(pessoaOne);
		em.persist(pessoaTwo);
		em.persist(pessoaThree);
		em.getTransaction().commit();
		System.out.println(pessoaOne);
		System.out.println(pessoaTwo);
		System.out.println(pessoaThree);
	}

}
