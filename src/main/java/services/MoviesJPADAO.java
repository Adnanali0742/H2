package services;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import fr.adnan.datamodel.Movies;

public class MoviesJPADAO {
	
	@Inject
	SessionFactory sf;
	
	public void create(Movies movies) {
		System.out.println("Creating records..........!");
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(movies);
		tx.commit();
		
	}
	
	public void update(Movies movies, int id, String name, String date) {
		System.out.println("Updating records..........!");
		movies.setId(id);
		movies.setName(name);
		movies.setDate(date);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.saveOrUpdate(movies);
		tx.commit();
		
	}
	
	public void delete(Movies movies) {
		System.out.println("Deleting records..........!");
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.delete(movies);
		tx.commit();		

	}
	
	public List<Movies> search(Movies movies) {
		System.out.println("Reading records..........!");
		Query<Movies> query = sf.openSession().createQuery("from Movies");
		List<Movies> list = query.list();
		System.out.println(list);
		return list;
		
	}
	

}
