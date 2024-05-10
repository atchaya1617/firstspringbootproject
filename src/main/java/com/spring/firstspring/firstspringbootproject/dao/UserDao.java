package com.spring.firstspring.firstspringbootproject.dao;

	import java.util.Optional;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Component;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestParam;

	import com.spring.firstspring.firstspringbootproject.dto.UserDto;
import com.spring.firstspring.firstspringbootproject.repo.UserRepo;

	@Component
	public class UserDao {
		@Autowired
		UserRepo repo;
		public UserDto saveUser(UserDto adhar) {
			return repo.save(adhar);
		}
		
		public UserDto findById(int id) {
			Optional<UserDto> opuser = repo.findById(id);
			if(opuser.isPresent()) {
				return opuser.get();
			}return null;
		}
		
		public UserDto updatUser(UserDto user,int id) {
		UserDto existingUser = findById(id);
		if(existingUser!=null) {
			user.setuId(id);
			return repo.save(user);
		}return null;
		} // exception for user not saved
		
		public UserDto deleteUser(int id) {
			UserDto user = findById(id);
			if(user!=null) {
				repo.delete(user);
				return user;
			}return null;
		}

		public UserDto getalladhar() {
			// TODO Auto-generated method stub
			return null;
		}

		

	}


