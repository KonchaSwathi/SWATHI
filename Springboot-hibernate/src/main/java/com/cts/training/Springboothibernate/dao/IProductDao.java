package com.cts.training.Springboothibernate.dao;

import java.util.List;

import com.cts.training.Springboothibernate.entity.Product;

public interface IProductDao {

	List<Product> findAll();
	Product findById(Integer id);
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Integer id);
}
