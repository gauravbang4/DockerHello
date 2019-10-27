package com.example.demo.repo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class Repository {


	@GetMapping
	public String hello()
	{
		return  "hello Doicker";
	}


}