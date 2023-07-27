package com.SangamOne.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.school.entity.StudentDetails;
import com.SangamOne.school.repository.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo studentRepo;
	
	
	@PostMapping("/addStudent")
	public String addStudent1(@RequestBody StudentDetails studentDetails ) {
		studentRepo.save(studentDetails);
		return "Inserted";
	}
	
	@GetMapping("/viewStudent")
	public List<StudentDetails> getAllStudents() {
		return studentRepo.findAll();		
	}

}
