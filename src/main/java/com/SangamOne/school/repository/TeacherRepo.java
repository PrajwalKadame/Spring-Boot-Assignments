package com.SangamOne.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.school.entity.TeacherDetails;

public interface TeacherRepo extends JpaRepository<TeacherDetails, Integer>{

}
