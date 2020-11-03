package QA.hsbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HRController {

	@GetMapping ("/hsbc/hr")
	public String aboutUs() {
		return "HR department of HSBC";
	}
	
}
