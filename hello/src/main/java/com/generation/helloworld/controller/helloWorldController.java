package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class helloWorldController {

	
	@GetMapping("/hello world")
	public String turma47() {
  return "hello world ";
	}
	@GetMapping("/BSM")
	public String listaBSM() {
		
  return "Mentalidade de Crescimento\r\n"
  		+ "Persistência\r\n"
  		+ "Responsabilidade Pessoal\r\n"
  		+ "Orientação ao Futuro\r\n"
  		+ "Comunicação\r\n"
  		+ "Orientação ao Detalhe\r\n"
  		+ "Proatividade\r\n"
  		+ "Trabalho em Equipe";
  
	}@GetMapping("/Objetivos")
	public String MeusObjetivo() {
		
	  return "Mentalidade de Crescimento\r\n"
	  		+ "Persistência aprendendo SQL\r\n"
	  		+ "Quero aprender a colocar meu site no ar com spring\r\n"
	  		+ "Deixar meu site funcional com a conecção com o banco dedos"
	  	    ;
	  	
	  
}
}
