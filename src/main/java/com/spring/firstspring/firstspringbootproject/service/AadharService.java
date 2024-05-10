package com.spring.firstspring.firstspringbootproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.spring.firstspring.firstspringbootproject.dao.AadharDao;
import com.spring.firstspring.firstspringbootproject.dto.AadharDto;
import com.spring.firstspring.firstspringbootproject.util.ResponseStructure;

@Service
public class AadharService {
	
	@Autowired
	AadharDao dao;
	
	public ResponseStructure<AadharDto> saveAadhar(AadharDto adhar) {
		ResponseStructure<AadharDto> structure = new ResponseStructure<AadharDto>();
		AadharDto savedaadhar = dao.saveAadhar(adhar);
		if(savedaadhar !=null) {
			structure.setData(savedaadhar);
			structure.setMessage("aadhar saved success");
			structure.setStatus(HttpStatus.CREATED.value());
			return structure;
		}return null; // exception adhar not saved
	}
	
	public ResponseStructure<AadharDto> findAadhar(int id){
		ResponseStructure<AadharDto> structure = new ResponseStructure<AadharDto>();
		AadharDto exAdhar = dao.findById(id);
		if(exAdhar!= null) {
			structure.setData(exAdhar);
			structure.setMessage("aadhar found with the given id");
			structure.setStatus(HttpStatus.FOUND.value());
			return structure;		
			}return null; // exception for adhar not found for the given id
	}
	
	public ResponseStructure<AadharDto> updateAadhar(AadharDto adhar, int id) {
		ResponseStructure<AadharDto> structure = new ResponseStructure<AadharDto>();
		AadharDto exAadhar = dao.findById(id);
		if(exAadhar!=null) {
			structure.setData(exAadhar);
			structure.setMessage("aadhar updated successfully");
			structure.setStatus(HttpStatus.OK.value());
			return structure;	
			//return dao.updateAadhar(exAadhar, id);
		}return null; //exception for adhar not found for the given id
	}
	
	public ResponseStructure<AadharDto> deleteAdhar(int id){
		ResponseStructure<AadharDto> structure = new ResponseStructure<AadharDto>();
		AadharDto exAdhar = dao.findById(id);
		if(exAdhar!=null) {
			structure.setData(exAdhar);
			structure.setMessage("aadhar deleted successfully");
			structure.setStatus(HttpStatus.OK.value());
			return structure;	
		}return null;
		}


	public ResponseStructure<List<AadharDto>> getall() {
		ResponseStructure<List<AadharDto>> structure = new ResponseStructure<>();

		structure.setData(dao.getalladhar());
		structure.setMessage("aadhar found with the given id");
		structure.setStatus(HttpStatus.FOUND.value());
		return structure;
	}
	
}
