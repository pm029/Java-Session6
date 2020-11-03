package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class FirstController {
	
	@GetMapping("/hello")
	public String tree() {
		//System.out.println("Request Received"); //if you want to see this on the webpage. change public string tree to public void tree.
		
		return "hello my friends";
	}

		@PostMapping("hello")
	public String AboutUs() {
		return "we are working here in HSBC";
	}
}
