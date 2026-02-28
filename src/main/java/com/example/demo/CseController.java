package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CseController {
	@GetMapping("/cseadd")
	public int addCSE(@RequestParam int a, @RequestParam int b) {
		return a + b;
	}
	
	@GetMapping("/getRoll")
	public String getRoll(@RequestParam String roll) {
		return "Hi!!!...This is done through Spring Boot by Siva(" + roll + ")";
	}
}
