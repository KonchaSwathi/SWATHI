package com.cts.training.mavenweb.services;

import java.util.List;

import com.cts.training.mavenweb.entity.Student;

public interface IStudentService {
	
	  List<Student> findAllStudents();
	 Student findstudentById(Integer id);
	 boolean addstudent(Student student);
	 boolean updatestudent(Student student);
	 boolean deletestudent(Integer id);
	

}
