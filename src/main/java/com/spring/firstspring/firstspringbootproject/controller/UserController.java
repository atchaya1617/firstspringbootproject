package com.spring.firstspring.firstspringbootproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.firstspring.firstspringbootproject.dto.UserDto;
import com.spring.firstspring.firstspringbootproject.service.AadharService;
import com.spring.firstspring.firstspringbootproject.service.UserService;
import com.spring.firstspring.firstspringbootproject.util.ResponseStructure;

@RestController
@RequestMapping("user")

public class UserController {

		@Autowired
		UserService service;
		
		@PostMapping 
		public ResponseStructure<UserDto>  saveAadharDto(@RequestBody UserDto user) {
			return service.saveUser(user);
		}
		
		@GetMapping
		public ResponseStructure<UserDto>  findUser(@RequestParam int id) {
			return service.findUser(id);
		}
		
		@DeleteMapping 
		public ResponseStructure<UserDto> deleteUser(@RequestParam int id) {
			return service.deleteUser(id);
			
		}
		
		@PutMapping
		public ResponseStructure<UserDto>  updateUser(@RequestBody UserDto user, @RequestParam int id) {
			return service.updateUser(user, id);
		}
		
//		@GetMapping("getall")
//		public ResponseStructure<List<UserDto>> getallUser(){
//			return service.getall();
//		}
//		

	}

