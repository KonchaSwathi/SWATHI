package com.cts.training.mavenweb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.training.mavenweb.dao.IProductDao;
import com.cts.training.mavenweb.entity.Product;

// @Component
@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	@Qualifier("studentDaoHibernateImpl")
	// @Qualifier("studentDaoJdbcTemplateImpl")
	private IProductDao studentDao;
	
	@Override
	public List<Product> findAllStudents() {
		// add additional logic
		return this.studentDao.findAll();
	}

	@Override
	public Product findStudentById(Integer id) {
		// TODO Auto-generated method stub
		return this.studentDao.findById(id);
	}

	@Override
	public boolean addStudent(Product student) {
		// TODO Auto-generated method stub
		return this.studentDao.add(student);
	}

	@Override
	public boolean updateStudent(Product student) {
		// TODO Auto-generated method stub
		return this.studentDao.update(student);
	}

	@Override
	public boolean deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		return this.studentDao.delete(id);
	}

}
