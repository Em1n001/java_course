package com.example.ProjectBook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProjectBook.DTO.UserRequestDTO;
import com.example.ProjectBook.Service.UserService;

@RestController
@RequestMapping(path="/users")
public class UserContoller {
@Autowired
	private UserService userservice;
	
	
@PostMapping(path="/add")
	public void create(@RequestBody UserRequestDTO dto) {
	
	userservice.add(dto);
}
}
