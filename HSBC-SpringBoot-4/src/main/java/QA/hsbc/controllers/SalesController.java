package QA.hsbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesController {
	
	@GetMapping ("/hsbc/sales")
	public String aboutUs() {
		return "Sales department of HSBC";
		}
}
