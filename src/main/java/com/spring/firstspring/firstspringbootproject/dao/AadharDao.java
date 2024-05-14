package com.spring.firstspring.firstspringbootproject.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.firstspring.firstspringbootproject.dto.AadharDto;
import com.spring.firstspring.firstspringbootproject.repo.AadharRepo;

@Component
public class AadharDao{
	@Autowired
	AadharRepo repo;
	public AadharDto saveAadhar(AadharDto adhar) {

		return repo.save(adhar);

	}
	
	public AadharDto findById(int id) {
		Optional<AadharDto> opadhar = repo.findById(id);
		if(opadhar.isPresent()) {
			return opadhar.get();
		}
		else {
			return null;
		}
	}
	
	public AadharDto updateAadhar(AadharDto aadhar,int id) {
	AadharDto existingAdhar = findById(id);
	if(existingAdhar!=null) {
		aadhar.setaId(id);
		return repo.save(aadhar);
	}return null;
	} // exception for adhar not saved
	
	public AadharDto deleteAdhar(int id) {
		AadharDto adhar = findById(id);
		if(adhar!=null) {
			repo.delete(adhar);
			return adhar;
		}return null;
	}

	public List<AadharDto> getalladhar() {
		return repo.findAll();
	}

	

}
