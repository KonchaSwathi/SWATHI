package com.cts.training.mavenweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cts.training.mavenweb.entity.Student;

// @Component
@Repository
public class StudentDaoJdbcTemplateImpl implements IStudentDao {

	private JdbcTemplate jdbcTemplate;
	
	// SQL templates
	private final String SQL_FETCH_ALL = "select * from student";
	private final String SQL_FETCH_BY_ID = "select * from student where id=?";
	private final String SQL_INSERT = "insert into student(name,email) values(?, ?)";
	private final String SQL_UPDATE = "update student set name=?, email=? where id=?";
	private final String SQL_DELETE = "delete from student where id=?";
	
	class StudentRowMapper implements RowMapper<Student>{

				@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Student student = new Student();
			
			// mapping
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name").toUpperCase());
			student.setEmail(rs.getString("email"));
			
			return student;
		}
		
	}
	
	@Autowired
	public StudentDaoJdbcTemplateImpl(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Student> findAll() {
		List<Student> students = this.jdbcTemplate.query(this.SQL_FETCH_ALL,
														 new StudentRowMapper());				
														 // new BeanPropertyRowMapper<Student>(Student.class));
		
		return students;
	}

	@Override
	public Student findById(Integer id) {
		// TODO Auto-generated method stub
		Student student =  this.jdbcTemplate.queryForObject(this.SQL_FETCH_BY_ID,
										 new Object[] {id}, // place holder values
										 new BeanPropertyRowMapper<Student>(Student.class));
		System.out.println(student);
		return student;
	}

	@Override
	public boolean add(Student student) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_INSERT, new Object[] {student.getName(), student.getEmail()});
		// n : number of rows affected
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean update(Student student) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_UPDATE, new Object[] {student.getName(), student.getEmail(), student.getId()});
		// n : number of rows affected
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean delete(Integer id) {
		// TODO Auto-generated method stub
		int n = this.jdbcTemplate.update(this.SQL_DELETE, new Object[] {id});
		// n : number of rows affected
		if(n>0)
			return true;
		return false;
	}

}































