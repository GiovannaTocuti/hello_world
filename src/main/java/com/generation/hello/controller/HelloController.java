package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/hello-world")
public class HelloController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!! <br><br> Orientação ao Futuro <br> Responsabilidade Pessoal <br> Mentalidade de Crescimento <br> Persistência <br><br> Aprender a usar o Spring Boot";
	}
	
}
