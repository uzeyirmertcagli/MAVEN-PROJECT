package servicelmpl;

import java.io.Serializable;
import java.security.PublicKey;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.Student;
import entity.UserEntity;

import service.IDatabaseCrud;

public class StudentController implements Serializable , IDatabaseCrud<Student>{

	@Override
	public void create(Student entity) {
		Session session = databaseConnectionHibernate();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		System.out.println("STUDENT YENÝ KAYIT YAPILDI!");
		
		
	}

	@Override
	public void delete(Student entity) {
		Student findEntity =find(entity.getId());
		if(findEntity!=null) {
			Session session = databaseConnectionHibernate();
			session.getTransaction().begin();
			session.remove(entity);
			session.getTransaction().commit();
			System.out.println("Silme Yapýldý.");
		}
		
	}

	@Override
	public void update(Student entity) {
		Student findEntity =find(entity.getId());
		if(findEntity!=null) {
			findEntity.setName(entity.getName());
			findEntity.setSurname(entity.getSurname());
			findEntity.setTelefon(entity.getTelefon());
			
			Session session =databaseConnectionHibernate();
			session.getTransaction().begin();
			session.merge(findEntity);
			session.getTransaction().commit();
			System.out.println("Güncelleme Yapýldý.");
		}
		
	}
	
	public Student find(long id) {
		Session session = databaseConnectionHibernate();
		Student student = session.find(Student.class, id);
		if(student==null) {
			System.out.println("STUDENT BULUNAMADI");
			return null;
		} else {
			return student;
		}
		

	}
	public ArrayList<Student> list(){
		Session session = databaseConnectionHibernate();
		
		String hql = "select s from Student as s ";
		Query<Student> query = session.createQuery(hql,Student.class);
		
		ArrayList<Student> list = (ArrayList<Student>)query.getResultList();
		System.out.println("SORGU ÇALIÞTIRILDI!");
		return list;
	}
	
	public long idToplamlari() {
		Session session = databaseConnectionHibernate();
		String hql="select sum(s.id) from Student as s";
		Query<Long> query = session.createQuery(hql,Long.class);
		
		long sonuc = query.getSingleResult();
		
		return sonuc;
	}
	
	public ArrayList<Student> id2DenBuyukListe(){
		Session session = databaseConnectionHibernate();
		String hql="select s from Student as s where s.id > 2";
		Query<Student> query = session.createQuery(hql,Student.class);
		
		ArrayList<Student> list = (ArrayList<Student>)query.getResultList();
		System.out.println("2'den Büyük ÝD Kayýtlarý Geldi.");
		return list;
	}
	
	public ArrayList<Student> idNdenKucukListe(long n){
		Session session = databaseConnectionHibernate();
		String hql="select s from Student as s where s.id < :key";
		Query<Student> query = session.createQuery(hql,Student.class);
		query.setParameter("key", n);
		
		ArrayList<Student> list = (ArrayList<Student>)query.getResultList();
		return list;
	}

	public ArrayList<Student> adaGoreSorgula(String ad){
		Session session = databaseConnectionHibernate();
		String hql="select s from Student as s where s.name='MERT";
		Query<Student> query = session.createQuery(hql,Student.class);
		query.setParameter("key",ad);
		ArrayList<Student> list = (ArrayList<Student>)query.getResultList();
		return list;
	}
	
	public ArrayList<Student> bolumAdinaGoreStudentList(String bolumAdi){
		Session session = databaseConnectionHibernate();
		String hql="select s from Student as s where s.identity.bolum=:key";
		Query<Student> query = session.createQuery(hql,Student.class);
		query.setParameter("key",bolumAdi);
		ArrayList<Student> list = (ArrayList<Student>)query.getResultList();
		return list;
	}
	
	public ArrayList<Object[]> cokluAlanGetir(){
		Session session = databaseConnectionHibernate();
		String hql="select s.id , s.name from Student as s";
		Query<Object[]> query = session.createQuery(hql,Object[].class);
		ArrayList<Object[]> list = (ArrayList<Object[]>)query.getResultList();
		return list;
	
	}
	
	//adý burak identity bolum Kýmya olanlarý listele
	
	
	public ArrayList<Student> sorgulaKriterle(String ad , String bolum){
		Session session = databaseConnectionHibernate();
		String hql="select s from Student as s where s.name=:adKriter and s.identity.bolum=:bolumKriter";
		Query<Student> query = session.createQuery(hql,Student.class);
		query.setParameter("adKriter",ad);
		query.setParameter("bolumKriter",bolum);
		ArrayList<Student> list = (ArrayList<Student>)query.getResultList();
		return list;
	}
	
}
