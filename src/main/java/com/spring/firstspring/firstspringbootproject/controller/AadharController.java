package com.spring.firstspring.firstspringbootproject.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.firstspring.firstspringbootproject.dto.AadharDto;
import com.spring.firstspring.firstspringbootproject.service.AadharService;
import com.spring.firstspring.firstspringbootproject.util.ResponseStructure;

@RestController
@RequestMapping("aadhar")
public class AadharController {
	@Autowired
	AadharService service;
	
	@PostMapping 
	public ResponseStructure<AadharDto>  saveAadharDto(@RequestBody AadharDto aadhar) {
		return service.saveAadhar(aadhar);
	}
	
	@GetMapping
	public ResponseStructure<AadharDto>  findAadhar(@RequestParam int id) {
		return service.findAadhar(id);
	}
	
	@DeleteMapping 
	public ResponseStructure<AadharDto> deleteAadhar(@RequestParam int id) {
		return service.deleteAdhar(id);
		
	}
	
	@PutMapping
	public ResponseStructure<AadharDto>  updateAadhar(@RequestBody AadharDto aadhar, @RequestParam int id) {
		return service.updateAadhar(aadhar, id);
	}
	
	@GetMapping("getall")
	public ResponseStructure<List<AadharDto>> getallAadhars(){
		return service.getall();
	}
	

}
