package service;

import java.util.ArrayList;

import org.hibernate.Session;

import utils.HibernateUtil;

public interface IDatabaseCrud<T> {

	public void create (T entity);
	public void delete (T entity);
	public void update (T entity);
	default ArrayList<T> list() {
		return null;
	}
	
	default T find(long id) {
		return null;
	}
	
	default Session databaseConnectionHibernate() {
		return HibernateUtil.getSessionfactory().openSession();
	}
}
