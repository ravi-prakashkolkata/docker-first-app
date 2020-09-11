package com.developer.dockerfirstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
public class HelloController {
	
	@GetMapping("/v1/hello")
	public String hello()
	{
		return "hello there 1 first application on docker ";
	}

}
