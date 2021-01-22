package com.cg.customer.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.customer.Customer;

public class Mainapp {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		
		Customer customer = new Customer();
		customer.setCid(101);
		customer.setCname("Arjun");
		customer.setCnumber(1768727652);
		
		Customer customer1 = new Customer();
		customer1.setCid(102);
		customer1.setCname("Manoj");
		customer1.setCnumber(817782762);
		
		em.persist(customer);
		em.persist(customer1);
		transaction.commit();
		em.close();

	}

}
