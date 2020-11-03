package QA.hsbc.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.hsbc.Entities.Student;
import QA.hsbc.Utilities.StudentRecords;

@RestController
public class StudentController {
	
	@Autowired
	StudentRecords sturef;
	
	@GetMapping("/showallstudents")
	public ArrayList<Student> showstudents() {
		return sturef.showStudents();
	}
	
	@GetMapping("savedrecord/{regno}/{name}/{marks}")
	public String saverecord(@PathVariable("regno") int regno1, 
			@PathVariable("name") String name1, @PathVariable("marks") int marks1) {
		Student ref=new Student();
		ref.regno=regno1;
		ref.name=name1;
		ref.marks=marks1;
		
		sturef.addrecord(ref);
		return "record saved";
	}
	
	@GetMapping("/showRecord/{name}")
	public  ArrayList<Student> showstudents2() {
		return sturef.showStudents();
	}

}
