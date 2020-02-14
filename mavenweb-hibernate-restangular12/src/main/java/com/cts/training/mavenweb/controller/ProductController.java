package com.cts.training.mavenweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.mavenweb.dao.IProductDao;
import com.cts.training.mavenweb.entity.Product;
import com.cts.training.mavenweb.services.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	// dependency
	/*@Autowired
	private IStudentDao studentDao;*/
	
	@Autowired
	private IProductService productService;
	
	@RequestMapping("/all")
	public String showAll(Model model) {
		// get data from DAO layer
		// List<Student> students = this.studentDao.findAll();
		List<Product> students = this.productservices.findAllProducts();
		
		// add to model object
		model.addAttribute("products",products);
		
		// return the view page
		return "product-list";
	}
	
	@RequestMapping("/entry")
	public String entry(Model model) {
		
		Product student = new Product(); // empty bag
		
		// add empty bag to model , to be mapped with spring form
		model.addAttribute("student", student);
		
		return "student-entry";
	}
	
	@RequestMapping("/save")  // ALL TYPES OF HTTP VERB
	public String save(@ModelAttribute Product student) {
		// add validation
		
		// send student object to DAO via SERVICE
		this.studentService.addStudent(student);
		
		// terminate the original request and start a new one
		
		// redirect to /all
		// return a redirect url
		return "redirect:/student/all";
	}
	
	@RequestMapping("/update")
	public String update(@RequestParam Integer id, Model model) {
		
		// send id to DAO via SERVICE and get the student object to edit
		Product student = this.studentService.findStudentById(id);
		
		// add student to model , to be mapped with spring form
		model.addAttribute("student", student);
		
		return "student-update";
	}
	
	
	// Path Variable
		@RequestMapping("/delete/{studentId}")
		public String delete(@PathVariable Integer studentId) {
			// send studentId to DAO via SERVICE
			this.studentService.deleteStudent(studentId);
			
			// terminate the original request and start a new one
			
			// redirect to /all
			// return a redirect url
			return "redirect:/student/all";
		}
	
	@RequestMapping("/save-update")
	public String saveUpdate(@ModelAttribute Product student) {
		// add validation
		
		// send student object to DAO via SERVICE
		System.out.println(student.getName() + " : " + student.getId());
		this.studentService.updateStudent(student);
		
		// terminate the original request and start a new one
		
		// redirect to /all
		// return a redirect url
		return "redirect:/student/all";
	}
	
	
	
}











