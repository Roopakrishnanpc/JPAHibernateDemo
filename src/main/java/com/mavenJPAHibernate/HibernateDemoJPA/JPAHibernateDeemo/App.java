package com.mavenJPAHibernate.HibernateDemoJPA.JPAHibernateDeemo;

import com.mavenJPAHibernate.HibernateDemoJPA.JPAHibernateDeemo.Entity.JPAEntity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceUnit;



/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {

    	JPAEntity jpen=new JPAEntity();
    	jpen.setRollno(12);
    	jpen.setName("Ashwin");
    	jpen.setLearning("UI/UX");
    	EntityManagerFactory entityfactory=Persistence.createEntityManagerFactory("TestPersistence");
    	EntityManager entity = entityfactory.createEntityManager();
      //  JPAEntity jpa=entity.find(JPAEntity.class,1);
        entity.getTransaction().begin();
        entity.persist(jpen);
        entity.getTransaction().commit();
       // System.out.println(jpa);
    }
}
