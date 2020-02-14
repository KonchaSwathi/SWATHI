package com.cts.training.mavenweb.services;

import java.util.List;

import com.cts.training.mavenweb.entity.Product;

public interface IProductService {

	List<Product> findAllStudents();
	Product findStudentById(Integer id);
	boolean addStudent(Product student);
	boolean updateStudent(Product student);
	boolean deleteStudent(Integer id);
}
