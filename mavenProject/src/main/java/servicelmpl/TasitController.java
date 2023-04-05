package servicelmpl;

import java.io.Serializable;
import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.query.Query;

import entity.Tasit;
import service.IDatabaseCrud;

public class TasitController implements Serializable , IDatabaseCrud<Tasit> {

	@Override
	public void create(Tasit entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Tasit entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Tasit entity) {
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<Tasit> sorgulaKritrle(long minKm){
		Session session = databaseConnectionHibernate();
		String hql = "select s from Tasit as s where s.guncelKm > :key";
		Query<Tasit> query = session.createQuery(hql,Tasit.class);
		
		return list;
	}

}
