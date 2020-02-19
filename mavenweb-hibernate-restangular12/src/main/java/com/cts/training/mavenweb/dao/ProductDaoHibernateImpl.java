package com.cts.training.mavenweb.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.training.mavenweb.entity.Product;

@Repository
@Transactional
public class ProductDaoHibernateImpl implements IProductDao {

	// dependency
	private SessionFactory sessionFactory;
	
	@Autowired
	public ProductDaoHibernateImpl(SessionFactory sessionFactory) {
		// TODO Auto-generated constructor stub
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		// get the Hibernate Session object (Persistant Context)
		Session session = this.sessionFactory.getCurrentSession();
		
		
		// Student : entity class name
		// query generated by Hibernate is returned as Object
		Query<Product> query =  session.createQuery("from Student", Product.class);
		List<Product> students = query.getResultList();
		return students;
	}

	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		// get the Hibernate Session object (Persistant Context)
		// every time new session object is required
		// as persistant context works within a method
		Session session = this.sessionFactory.getCurrentSession();
		Product student = session.find(Product.class, id);
		
		return student;
	}

	@Override
	public boolean add(Product student) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		
		session.save(product);
		
		return true;
	}

	@Override
	public boolean update(Product student) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		
		session.update(product));
		return true;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		
		session.remove(this.findById(id));
		return true;
	}

}