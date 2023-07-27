package com.SangamOne.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.school.entity.SubjectDetails;
import com.SangamOne.school.repository.SubjectRepo;

@RestController
public class SubjectController {
	@Autowired
	SubjectRepo subjectRepo;

	@PostMapping("/addSubject")
	public String addSubject(@RequestBody SubjectDetails subjectDetails) {
		subjectRepo.save(subjectDetails);
		return "Inserted";
	}

	@GetMapping("/viewSubject")
	public List<SubjectDetails> viewSubject(){
		return subjectRepo.findAll();
	}
}
