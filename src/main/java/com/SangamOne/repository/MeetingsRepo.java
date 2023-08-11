package com.SangamOne.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SangamOne.entity.Meetings;
import com.SangamOne.entity.Users;

public interface MeetingsRepo extends JpaRepository<Meetings, Integer>{

	
	@Query(value="select u1.user_name, u2.user_name, meeting_date, meeting_time from meetings join users u1 join users u2 where meetings.user1=u1.user_id and meetings.user2=u2.user_id", nativeQuery=true)
	public List<Meetings> findByMeetings();

}
