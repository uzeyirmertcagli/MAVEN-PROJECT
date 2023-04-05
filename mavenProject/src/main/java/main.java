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
//		user.setName("MERT");											VERÝTABANINA EKLEME
//		user.setSurname("ÇAÐLI");
//		user.setEmail("mertcagli00@gmail.com");
//		userController.create(user);

//		UserEntity entity = userController.find(1);						VERÝTABANINDA OLAN DEÐERÝ GETÝRME
//		entity.bilgileriYazdir();

		
//		UserEntity entity = new UserEntity();							
//		entity.setId(1);												VERÝTABANINDAN DEÐER SÝLME
//		userController.delete(entity);
		
//		UserController userController = new UserController();
//		UserEntity entity = new UserEntity();
//		entity.setId(2);
//		entity.setName("ÜZEYÝR MERT");
//		entity.setSurname("ÇAÐLI");										VERÝTABANINDA KÝ DEÐERÝ GÜNCELLEME (HEPSÝ)		
//		entity.setEmail("mertcagli00@gmail.com");
//		userController.update(entity);
		
//		UserController userController = new UserController();
//		UserEntity entity = new UserEntity();
//		entity.setId(2);												VERÝTABANINDA KÝ DEÐERÝ GÜNCELLEME (BELÝRTÝLEN KOLON)
//		entity.setName("MERT");
//		userController.updateKontrollu(entity);
		
//		UserController userController = new UserController();
//		for(UserEntity user  : userController.list()) {					VERÝTABANINDA KÝ DEÐERLERÝ LÝSTELEME
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
