package com.spring.firstspring.firstspringbootproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.firstspring.firstspringbootproject.dto.UserDto;

public interface UserRepo extends JpaRepository <UserDto, Integer> {

}
