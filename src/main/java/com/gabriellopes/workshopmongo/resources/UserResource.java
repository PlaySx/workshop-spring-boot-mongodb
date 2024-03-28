package com.gabriellopes.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriellopes.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Silva", "maria@gmail.com");
		User isabela = new User("2", "Isabela Miranda", "isabela@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, isabela));
		return ResponseEntity.ok().body(list);
	}
}
