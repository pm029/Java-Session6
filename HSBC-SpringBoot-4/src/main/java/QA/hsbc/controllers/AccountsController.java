package QA.hsbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

	
	@RestController
	public class AccountsController{
		
		@GetMapping("/hsbc/accounts")
		public String aboutus() {
			return "Accounts Department of HSBC";
		}
	}


