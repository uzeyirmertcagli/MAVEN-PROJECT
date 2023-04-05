import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.Person;
import entity.UserEntity;
import jakarta.persistence.TypedQuery;
import servicelmpl.UserController;
import utils.HibernateUtil;

public class main {

	public static void main(String[] args) {
//		
//		UserController userController = new UserController();
//		UserEntity user = new UserEntity();
//		user.setName("MERT");											VER�TABANINA EKLEME
//		user.setSurname("�A�LI");
//		user.setEmail("mertcagli00@gmail.com");
//		userController.create(user);

//		UserEntity entity = userController.find(1);						VER�TABANINDA OLAN DE�ER� GET�RME
//		entity.bilgileriYazdir();

		
//		UserEntity entity = new UserEntity();							
//		entity.setId(1);												VER�TABANINDAN DE�ER S�LME
//		userController.delete(entity);
		
//		UserController userController = new UserController();
//		UserEntity entity = new UserEntity();
//		entity.setId(2);
//		entity.setName("�ZEY�R MERT");
//		entity.setSurname("�A�LI");										VER�TABANINDA K� DE�ER� G�NCELLEME (HEPS�)		
//		entity.setEmail("mertcagli00@gmail.com");
//		userController.update(entity);
		
//		UserController userController = new UserController();
//		UserEntity entity = new UserEntity();
//		entity.setId(2);												VER�TABANINDA K� DE�ER� G�NCELLEME (BEL�RT�LEN KOLON)
//		entity.setName("MERT");
//		userController.updateKontrollu(entity);
		
//		UserController userController = new UserController();
//		for(UserEntity user  : userController.list()) {					VER�TABANINDA K� DE�ERLER� L�STELEME
//			user.bilgileriYazdir();
//		}

	
//		Session session = HibernateUtil.getSessionfactory().openSession();
//		String hql = "select s from UserEntity as s";
//		TypedQuery<UserEntity> typedQuery = session.createQuery(hql,UserEntity.class);
//		
//		ArrayList<UserEntity> entities = (ArrayList<UserEntity>)typedQuery.getResultList();
//		for(UserEntity entity:entities)
//			entity.bilgileriYazdir();
		
		
//		Session session = HibernateUtil.getSessionfactory().openSession();
//		String hql="select sum(s.id) from UserEntity as s";
//		TypedQuery<Long> typedQuery = session.createQuery(hql,Long.class);
//		
//		long l = typedQuery.getSingleResult();
//		System.out.println(l);
		
		Session session = HibernateUtil.getSessionfactory().openSession();
		String hql="select s from Person as s";
		TypedQuery<Person> typedQuery = session.createQuery(hql,Person.class);
		
		ArrayList<Person> entities = (ArrayList<Person>)typedQuery.getResultList();
		for(Person entity : entities) {
			System.out.println(entity.getPasaport().getValiDate());
		}
		
		
		
		
		
		
		
		
		
		
	}
	

}
