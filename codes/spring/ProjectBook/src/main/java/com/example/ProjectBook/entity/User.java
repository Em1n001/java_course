package com.example.ProjectBook.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="users")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 private String name;
	 private String surname;
	 private String password;
	 private String username;
}
