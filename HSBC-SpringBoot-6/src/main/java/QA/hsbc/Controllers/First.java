package QA.hsbc.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import QA.hsbc.Utilities.Records;

@RestController
public class First {
	
	@Autowired
	Records ref;
	
	@GetMapping("/showrecords")
	public ArrayList<String> displayallrecords(){
		return ref.showEmployees();
	}
	
	@GetMapping("/addrecord/{name}")
	public String addingRecord(@PathVariable("name") String na){
		ref.addRecord(na);
		return "Record Saved";
	}
	
	@GetMapping("/removerecrod/{name}")
	public String removeRecord(@PathVariable("r") int rno){
		ref.removeRecord(rno);
		return "Record Deleted";
	}
			

}
