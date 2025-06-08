package com.example.ProjectBook.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.ProjectBook.DTO.UserRequestDTO;
import com.example.ProjectBook.entity.User;
import com.example.ProjectBook.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private PasswordEncoder passwordencoder;
	
	@Autowired
	private UserRepository userrepository;
	
	public void add(UserRequestDTO dto) {
		
		User user = new User();
		user.setId(null);
		user.setName(dto.getName());
		user.setSurname(dto.getSurname());
		String encode = passwordencoder.encode(dto.getPassword());
		user.setPassword(encode);
		user.setUsername(dto.getUsername());
	
		userrepository.save(user);
		
	}	
}
