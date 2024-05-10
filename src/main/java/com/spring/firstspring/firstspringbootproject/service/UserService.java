package com.spring.firstspring.firstspringbootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.spring.firstspring.firstspringbootproject.dao.UserDao;
import com.spring.firstspring.firstspringbootproject.dto.UserDto;
import com.spring.firstspring.firstspringbootproject.util.ResponseStructure;

@Service
public class UserService {
	
	@Autowired
	UserDao dao;
	
	public ResponseStructure<UserDto> saveUser(UserDto user) {
		ResponseStructure<UserDto> structure = new ResponseStructure<UserDto>();
		UserDto saveduser = dao.saveUser(user);
		if(saveduser !=null) {
			structure.setData(saveduser);
			structure.setMessage("user saved successfully");
			structure.setStatus(HttpStatus.CREATED.value());
			return structure;
		}return null; // exception user not saved
	}
	
	public ResponseStructure<UserDto> findUser(int id){
		ResponseStructure<UserDto> structure = new ResponseStructure<UserDto>();
		UserDto exUser = dao.findById(id);
		if(exUser!= null) {
			structure.setData(exUser);
			structure.setMessage("user found with the given id");
			structure.setStatus(HttpStatus.FOUND.value());
			return structure;		
			}return null; // exception for user not found for the given id
	}
	
	public ResponseStructure<UserDto> updateUser(UserDto adhar, int id) {
		ResponseStructure<UserDto> structure = new ResponseStructure<UserDto>();
		UserDto exUser = dao.findById(id);
		if(exUser!=null) {
			structure.setData(exUser);
			structure.setMessage("user updated successfully");
			structure.setStatus(HttpStatus.OK.value());
			return structure;	
			//return dao.updateUser(exUser, id);
		}return null; //exception for user not found for the given id
	}
	
	public ResponseStructure<UserDto> deleteUser(int id){
		ResponseStructure<UserDto> structure = new ResponseStructure<UserDto>();
		UserDto exUser = dao.findById(id);
		if(exUser!=null) {
			structure.setData(exUser);
			structure.setMessage("user deleted successfully");
			structure.setStatus(HttpStatus.OK.value());
			return structure;	
		}return null;
		}

//
//	public ResponseStructure<List<UserDto>> getall() {
//		ResponseStructure<UserDto> structure = new ResponseStructure<UserDto>();
//		UserDto exAdhar = dao.findById(id);
//		if( exUser!=null) {
//		structure.setData(dao.getalluser());
//		structure.setMessage("user found with the given id");
//		structure.setStatus(HttpStatus.FOUND.value());
//		return structure;
//		}return null;
//	}
	
}

