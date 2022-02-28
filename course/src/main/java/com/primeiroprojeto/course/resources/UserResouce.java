package com.primeiroprojeto.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiroprojeto.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u =new User(1L,"Dayana","dayana@gmail.com", "81999380505", "12345");
		return ResponseEntity.ok().body(u);
		
	}
	

}

//Controlador Rest que responde no caminho /users