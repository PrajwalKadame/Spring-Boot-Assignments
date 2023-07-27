package com.SangamOne.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SangamOne.school.entity.SubjectDetails;

public interface SubjectRepo extends JpaRepository<SubjectDetails, Integer>{

}
