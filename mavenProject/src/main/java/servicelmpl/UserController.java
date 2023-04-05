package servicelmpl;

import java.io.Serializable;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.UserEntity;
import service.IDatabaseCrud;

public class UserController implements Serializable,IDatabaseCrud<UserEntity> {

	private static final long serialVersionUID =1L;
	
	@Override
	public void create(UserEntity entity) {
		Session session =databaseConnectionHibernate();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		System.out.println("Ekleme Yapýldý.");
		
	}

	@Override
	public void delete(UserEntity entity) {
		UserEntity findEntity =find(entity.getId());
		if(findEntity!=null) {
			Session session = databaseConnectionHibernate();
			session.getTransaction().begin();
			session.remove(entity);
			session.getTransaction().commit();
			System.out.println("Silme Yapýldý.");
		}
		
		
	}

	@Override
	public void update(UserEntity entity) {
		UserEntity findEntity =find(entity.getId());
		if(findEntity!=null) {
			findEntity.setEmail(entity.getEmail());
			findEntity.setName(entity.getName());
			findEntity.setSurname(entity.getSurname());
			
			Session session =databaseConnectionHibernate();
			session.getTransaction().begin();
			session.merge(findEntity);
			session.getTransaction().commit();
			System.out.println("Güncelleme Yapýldý.");
		}
		
	}
	

	public void updateKontrollu(UserEntity entity) {
		UserEntity findEntity =find(entity.getId());
		if(findEntity!=null) {
			if(entity.getEmail()!=null)
				findEntity.setEmail(entity.getEmail());
			if(entity.getName()!=null)
				findEntity.setName(entity.getName());
			if(entity.getSurname()!=null)
				findEntity.setSurname(entity.getSurname());
			
			Session session =databaseConnectionHibernate();
			session.getTransaction().begin();
			session.merge(findEntity);
			session.getTransaction().commit();
			System.out.println("Güncelleme Yapýldý.");
		}
		
	}
	
	public UserEntity find(long id) {
		Session session =databaseConnectionHibernate();
		UserEntity userEntity;
		
		userEntity=session.find(UserEntity.class, id);
		if(userEntity!=null){
			System.out.println("Bulundu " + userEntity);
			return userEntity;
		} else {
			System.out.println("Bulunamadý .");
			return null;
		}
	}
	
	public ArrayList<UserEntity> list(){
		Session session = databaseConnectionHibernate();
		
		String hql = "select str from UserEntity as str where str.id >= :key";
		Query<UserEntity> query = session.createQuery(hql,UserEntity.class);
		
		long id=1L;
		query.setParameter("key",id);
		ArrayList<UserEntity> list = (ArrayList<UserEntity>) query.getResultList();
		System.out.println("Listelendi.");
		return list;
 	}

	
}
