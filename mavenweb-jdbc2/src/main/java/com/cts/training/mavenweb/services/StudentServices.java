package com.cts.training.mavenweb.services;

import java.util.List;

import com.cts.training.mavenweb.dao.IStudentDao;
import com.cts.training.mavenweb.entity.Student;

public class StudentServices implements IStudentService {
	  
	private IStudentDao studentDao;

	@Override
	public List<Student> findAllStudents() {
		// TODO Auto-generated method stub
		return this.studentDao.findAll();
	}

	@Override
	public Student findstudentById(Integer id) {
		// TODO Auto-generated method stub
		return this.studentDao.findById(id);
	}

	@Override
	public boolean addstudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentDao.add(student);
	}

	@Override
	public boolean updatestudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentDao.update(student);
	}

	@Override
	public boolean deletestudent(Integer id) {
		// TODO Auto-generated method stub
		return this.studentDao.delete(id);
	}

}
