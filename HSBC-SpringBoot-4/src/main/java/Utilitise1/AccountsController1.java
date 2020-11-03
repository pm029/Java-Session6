package Utilitise1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController1 {
	@Autowired
	Accounts ref;
	
	@GetMapping("/hsbc/TestCaculation/{salary}")
	public String salaryCalculation(@PathVariable("salary")int sal) {
		
		return "Your tax is" +ref.tax(sal);
	}
	
	@GetMapping("/hsbc/TestCaculation/{name}/{salary}")
	public String salaryCalculation(@PathVariable("name") String name,@PathVariable("salary")int sal) {
		
		return name + "Your tax is" +ref.tax(sal);
}
}