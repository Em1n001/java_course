package com.example.ProjectBook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ProjectBook.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
