package com.cg.customer1.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.customer1.Customer;


public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");     //database
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
//		em.getTransaction().begin();
		
		Customer customer = new Customer();
		customer.setCustId(101);
//		customer.getCustId();
		customer.setCustname("Aahu");
		customer.setCustmobile(98798763);
		
//		Customer customer1 = new Customer();
//		customer1.setCustId(102);
//		customer1.setCustname("Varun");
//		customer1.setCustmobile(887626282);
		
		em.persist(customer);
//		em.persist(customer1);
		transaction.commit();
//		em.getTransaction().commit();
		em.close();

	}

}
