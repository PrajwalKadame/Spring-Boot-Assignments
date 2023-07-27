package com.SangamOne.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.school.entity.StudentDetails;

public interface StudentRepo extends JpaRepository<StudentDetails, Integer>{

}
