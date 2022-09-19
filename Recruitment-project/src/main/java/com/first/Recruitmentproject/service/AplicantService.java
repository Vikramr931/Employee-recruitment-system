package com.first.Recruitmentproject.service;

import java.util.List;

import com.first.Recruitmentproject.model.Applicant;

public interface AplicantService {
	List<Applicant> getAllApplicants();
    void saveApplicats(Applicant applicant);
    Applicant getApplicantById(long id);
    void deleteApplicantById(long id);
}
