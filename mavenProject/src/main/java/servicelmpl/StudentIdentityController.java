package servicelmpl;

import java.io.Serializable;

import org.hibernate.Session;

import entity.Student;
import entity.Student_identity;
import service.IDatabaseCrud;

public class StudentIdentityController implements Serializable , IDatabaseCrud{

	@Override
	public void create(Object entity) {
		Session session = databaseConnectionHibernate();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		System.out.println("STUDENT YENÝ KAYIT YAPILDI!");
		
	}

	@Override
	public void delete(Object entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Object entity) {
		// TODO Auto-generated method stub
		
	}
	
	public Student_identity find(long id) {
		Session session = databaseConnectionHibernate();
		Student_identity studentIdentity = session.find(Student_identity.class, id);
		if(studentIdentity==null) {
			System.out.println("STUDENT BULUNAMADI");
			return null;
		} else {
			return studentIdentity;
		}

	}
}
