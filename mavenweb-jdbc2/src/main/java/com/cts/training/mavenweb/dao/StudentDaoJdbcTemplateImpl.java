package com.cts.training.mavenweb.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cts.training.mavenweb.entity.Student;

@Component
public class StudentDaoJdbcTemplateImpl implements IStudentDao {

	private JdbcTemplate jdbcTemplate;
	
	// SQL templates
	private final String SQL_FETCH_ALL = "select * from student12";
	private final String SQL_FETCH_BY_ID = "select * from student12 where id=?";
	private final String SQL_INSERT = "insert into student12(name,email,address) values(?, ?,?)";
	private final String SQL_UPDATE = "update student set name=?, email=? where id=?";
	private final String SQL_DELETE = "delete from student where id=?";
	
	
	@Autowired
	public StudentDaoJdbcTemplateImpl(DataSource dataSource) {
		
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Student> findAll() {
		
		List<Student> students = this.jdbcTemplate.query(this.SQL_FETCH_ALL,new BeanPropertyRowMapper<Student>(Student.class));
		
		return students;
	}

	@Override
	public Student findById(Integer id) {
		
		Student student =  this.jdbcTemplate.queryForObject(this.SQL_FETCH_BY_ID,
										 new Object[] {id}, // place holder values
										 new BeanPropertyRowMapper<Student>(Student.class));
		return student;
	}

	@Override
	public boolean add(Student student) {
		
		int n = this.jdbcTemplate.update(this.SQL_INSERT, new Object[] {student.getName(), student.getEmail(),student.getAddress()});
		
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean update(Student student) {
		
		int n = this.jdbcTemplate.update(this.SQL_UPDATE, new Object[] {student.getName(), student.getEmail(), student.getId()});

		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		
		int n = this.jdbcTemplate.update(this.SQL_DELETE, new Object[] {id});
		
		if(n>0)
			return true;
		return false;
	}

}































