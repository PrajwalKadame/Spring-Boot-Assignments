package com.SangamOne.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.school.entity.TeacherDetails;
import com.SangamOne.school.repository.TeacherRepo;

@RestController
public class TeacherController {
	
	@Autowired
	TeacherRepo teacherRepo;
	
	@PostMapping("/addTeacher")
	public String addTeacher(@RequestBody TeacherDetails teacherDetails) {
		teacherRepo.save(teacherDetails);
		return "Success";
	}
	
	@GetMapping("/viewTeacher")
	public List<TeacherDetails> getAllTeacher(){
		return teacherRepo.findAll();
	}

}
