package cts.training.spring.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cts.training.spring.web.model.Student;
@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/dashboard")
	public String home() {
		return "studenthome";
	}

	@RequestMapping("/profile")
	public String profile() {
		return "student-profile";
	}

	
	@RequestMapping()
	public String defaultMethod() {
		return "studenthome";
	}
	public String saveData(Student student) {
		System.out.println("/nName:"+student.getName());
		System.out.println("email:"+student.getEmail());
		return null;
	}

}


