package com.cts.training.mavenweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.mavenweb.entity.Product;
import com.cts.training.mavenweb.exception.ProductErrorResponse;
import com.cts.training.mavenweb.exception.ProductNotFoundException;
import com.cts.training.mavenweb.services.IProductService;

@RestController
@RequestMapping("/api")
public class ProductRestController {
	
	// dependency
	@Autowired
	private IProductService producttService;
	
	// @RequestMapping(value =  "/students", method = {RequestMethod.GET, RequestMethod.PUT} )
	@GetMapping("/students") // GET HTTP VERB
	public List<Product> exposeAll() {
		
		List<Product> products = this.productService.findAllProducts();
		
		return products;
	}
	
	// {<data variable>}
	@GetMapping("/students/{studentId}") // GET HTTP VERB
	public Product getById(@PathVariable Integer productId) {
		
		Product product = this.productService.findStudentById(productId);
		if(product == null)
			throw new ProductNotFoundException("product with id-" + productId + " not Found");
		return product;
	}
	
	// @RequestMapping(value =  "/students", method = RequestMethod.POST)
	@PostMapping("/products") // POST HTTP VERB
	public Product save(@RequestBody Product product) {
		this.productService.addStudent(product);
		return product;
	}
	
	@PutMapping("/products")
	public Product saveUpdate(@RequestBody Product product) {
		this.productService.updateStudent(product);
		return product;
	}
	
	@DeleteMapping("/students/{studentId}")
	public Product delete(@PathVariable Integer studentId) {
		
		Product student = this.productService.findproductById(product Id);
		
		// send studentId to DAO via SERVICE
		this.productService.deleteStudent(productId);
		
		return student;
	}
	
	// for exception handling
	@ExceptionHandler  // ~catch
	public ProductErrorResponse studentNotFoundHandler(ProductNotFoundException ex) {
		// create error object
		ProductErrorResponse error = new ProductErrorResponse(ex.getMessage(), 
															  HttpStatus.NOT_FOUND.value(), 
															  System.currentTimeMillis());
		return error;
	}
	
	
	
	/************ REST endpoints ************/
	// /api/student [GET]
	// /api/student/id [GET]
	// /api/student [POST]
	// /api/student [PUT]
	// /api/student/id [DELETE]
	
	
	
	
}
