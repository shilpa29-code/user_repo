package com.user.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.project.dto.ResponseDto;
import com.user.project.entity.User;
import com.user.project.service.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

	private UserService userService;

	public UserController(UserService userService) {

		this.userService = userService;
	}

	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User savedUser = userService.saveUser(user);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<ResponseDto> getUser(@PathVariable("id") Long userId) {
		ResponseDto responseDto = userService.getUser(userId);
		return ResponseEntity.ok(responseDto);
	}
}
