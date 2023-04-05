package utils;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.*;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(UserEntity.class);
			configuration.addAnnotatedClass(CepTelefonu.class);
			configuration.addAnnotatedClass(Person.class);
			configuration.addAnnotatedClass(Pasaport.class);
			configuration.addAnnotatedClass(Student.class);
			configuration.addAnnotatedClass(Student_identity.class);
			configuration.addAnnotatedClass(Sirket.class);
			configuration.addAnnotatedClass(Bolum.class);
			configuration.addAnnotatedClass(Tasit.class);
			configuration.addAnnotatedClass(Ruhsat.class);
			SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			return factory;
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static SessionFactory getSessionfactory() {
		return sessionFactory;
	}

}
