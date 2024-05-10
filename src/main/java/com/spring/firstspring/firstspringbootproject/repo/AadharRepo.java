package com.spring.firstspring.firstspringbootproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.firstspring.firstspringbootproject.dto.AadharDto;

public interface AadharRepo extends JpaRepository <AadharDto, Integer> {

}
