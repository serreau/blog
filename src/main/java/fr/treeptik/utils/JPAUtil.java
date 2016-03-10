package fr.treeptik.utils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class JPAUtil {
//	public final static ApplicationContext CONTEXT = new ClassPathXmlApplicationContext("dispatcher-servlet.xml");
	@PersistenceContext
	@Autowired
	public EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
//	public static ApplicationContext getContext() {
//		return CONTEXT;
//	}
	
	
}
