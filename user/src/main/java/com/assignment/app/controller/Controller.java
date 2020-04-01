package com.assignment.app.controller;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.app.service.UserService;
import com.assignment.app.user.User;
import com.assignment.app.userdto.UserDTO;

@RestController
public class Controller {

	@Autowired
	UserService userService;

	@GetMapping("/user/{id}")
	public UserDTO getUser(@PathVariable Integer id) {
		User user = userService.getUsers().stream().filter(o -> o.getId() == id).collect(Collectors.toList()).get(0);

		return new UserDTO(user.getName(), user.getAge(), user.getEmail());
	}
}
