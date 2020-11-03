package QA.hsbc.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Information {
	@GetMapping ("/info/{name}/{address}")
	public String information(@PathVariable("name") String n, @PathVariable("address") String A) {
		return n+ " lives in " + A;
	}

}
