package servicelmpl;

import java.io.Serializable;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.Bolum;
import entity.Student;
import service.IDatabaseCrud;

public class BolumController implements Serializable , IDatabaseCrud<Bolum> {

	@Override
	public void create(Bolum entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Bolum entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Bolum entity) {
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<Bolum> list(){
		Session session = databaseConnectionHibernate();
		String hql="select s from Bolum as s";
		Query<Bolum> query = session.createQuery(hql,Bolum.class);
		ArrayList<Bolum> list = (ArrayList<Bolum>)query.getResultList();
		System.out.println("Sorgu Çalýþtýrýldý");
		return list;
	}
}
