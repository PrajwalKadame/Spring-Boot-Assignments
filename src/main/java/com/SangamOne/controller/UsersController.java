package com.SangamOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.entity.Users;
import com.SangamOne.repository.UsersRepo;

@RestController
@RequestMapping(value="/user")
public class UsersController {
	
	@Autowired
	UsersRepo usersRepo;
	
	@PostMapping("/addUsers")
	public String addUsers(@RequestBody Users users){
	 	usersRepo.save(users);
		return "Inserted";
	}
	
	@GetMapping("/viewUsers")
	public List<Users> viewUsers(){
	 	return usersRepo.findAll();
	
	}
	
	

}
