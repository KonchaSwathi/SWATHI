package com.cts.training.hibernatemapping.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cts.training.hibernatemapping.HibernateMappingApplication;
import com.cts.training.hibernatemapping.entity.Course;
import com.cts.training.hibernatemapping.entity.Review;
@RunWith(SpringRunner.class) // Test Runner
@SpringBootTest(classes =  HibernateMappingApplication.class )
class ReviewsDaoTests {
	
	@Autowired
	private ReviewDao reviewDao;

	@Autowired
	private CourseDao courseDao;
	
	@Test
	void testaddReviewAndCourse() {
		Course course = new Course();
		course.setName("Javascript");
		Review review = new Review();
		review.setReview("outstandig");
		Review added = this.reviewDao.addReviewAndCourse(review,course);
		assertEquals("javascript", added.getCourse());
  }
	
	@Test
	void testaddReviewtoExistingCourse() {
		Course course =this.courseDao.findById(2);
		Review review = new Review();
		review.setReview("mindblowing");
		Review added = this.reviewDao.addReviewAndCourse(review,course);
		assertEquals("awesome",added.getReview());
		
	 }
	
}
	
	
	


