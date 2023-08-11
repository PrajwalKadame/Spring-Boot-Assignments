package com.SangamOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SangamOne.entity.Meetings;
import com.SangamOne.entity.Users;
import com.SangamOne.repository.MeetingsRepo;
import com.SangamOne.repository.UsersRepo;



@RestController
@RequestMapping(value="/meeting")
public class MeetingsController {
	
	@Autowired
	MeetingsRepo meetingRepo;
	

	@PostMapping("/addMeetings")
		public String addMeetings(@RequestBody Meetings meetings){
		 	meetingRepo.save(meetings);
			return "Inserted";
		}
	
	
	@GetMapping("/viewMeetings")
	public List<Meetings> findByMeetings(){
		return meetingRepo.findByMeetings();
	}

}
