package com.cg.hello;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();


		Helloworld hw = new Helloworld(1,"Hello");
//		hw.setMessageId(1);
//		hw.setMessage("Hello to jpa");
		em.persist(hw);
		// Creating a second entity object
//		Helloworld hwo= new Helloworld();
//		hwo.setMessageId(2);
//		hwo.setMessage("HelloWorld");
//		em.persist(hwo);


		transaction.commit();


//		Helloworld hw1 = em.find(Helloworld.class, 1);
//		em.getTransaction().begin();
//		hw1.setMessage("Hello jpa");
//		em.getTransaction().commit();

//		Helloworld hw2 = em.find(Helloworld.class, 2);
//		transaction.begin();
//		em.getTransaction();
//		em.remove(hw2);
//		em.getTransaction().commit();
		em.close();

	}

}
