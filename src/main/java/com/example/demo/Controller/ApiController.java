package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	String str="Kamalesh";
	
	@GetMapping("/")
	public String getName()
	{
		return "Welcome "+str+" !";
	}
	 
}