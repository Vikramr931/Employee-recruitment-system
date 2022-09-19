package com.first.Recruitmentproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.first.Recruitmentproject.model.Applicant;


@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Long> {

}
