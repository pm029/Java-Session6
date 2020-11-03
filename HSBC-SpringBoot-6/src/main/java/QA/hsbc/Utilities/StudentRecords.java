package QA.hsbc.Utilities;

import java.util.ArrayList;
import org.springframework.stereotype.Service;
import QA.hsbc.Entities.Student;

@Service
public class StudentRecords {

		ArrayList<Student> list= new ArrayList<Student>();
		
		public StudentRecords() {
			Student stu1 = new Student();
			stu1.regno=102;
			stu1.name="Shafeeq";
			stu1.marks=149;
			
			list.add(stu1);
					
		}
		
		public ArrayList<Student> showStudents(){
			return list;
		}
		
		public void addrecord(Student st) {
			list.add(st);
			
		}
		
		public void searchforstudent searchstudent {
		for (i=0; i<student.get(i);i++);
				if (student[i].regno==R);
					ref=student.get(i);
		}
		
}
