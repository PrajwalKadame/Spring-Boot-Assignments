package com.SangamOne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;





@Entity
@Table(name="meetings")
public class Meetings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "meeting_id")
	private int meetingId;
	
	@Column(name = "user1")
	private int users1;
	
	@Column(name = "user2")
	private int users2;
	
	
	@Column(name = "meeting_date")
	private String meetingDate;
	
	@Column(name = "meeting_time")
	private String meetingTime;
	
	@ManyToOne()
	@JoinColumn(name = "user_id",insertable = false, updatable=false)
	private Users user1;
	
	@ManyToOne()
	@JoinColumn(name = "user_id",insertable = false, updatable=false)
	private Users user2;

	public int getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(int meetingId) {
		this.meetingId = meetingId;
	}

	public int getUsers1() {
		return users1;
	}

	public void setUsers1(int users1) {
		this.users1 = users1;
	}

	public int getUsers2() {
		return users2;
	}

	public void setUsers2(int users2) {
		this.users2 = users2;
	}

	public String getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(String meetingDate) {
		this.meetingDate = meetingDate;
	}

	public String getMeetingTime() {
		return meetingTime;
	}

	public void setMeetingTime(String meetingTime) {
		this.meetingTime = meetingTime;
	}

	
	
}
