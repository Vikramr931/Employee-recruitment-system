package com.first.Recruitmentproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.Recruitmentproject.model.Applicant;
import com.first.Recruitmentproject.repository.ApplicantRepository;


@Service
public class ApplicantServiceImp implements AplicantService {
    
	@Autowired
	private ApplicantRepository applicantRepository;
	
	@Override
	public List<Applicant> getAllApplicants() {
		return applicantRepository.findAll();
		
	}

	@Override
	public void saveApplicats(Applicant applicant) {
		this.applicantRepository.save(applicant);
		
	}

	@Override
	public Applicant getApplicantById(long id) {
		Optional<Applicant> optional = applicantRepository.findById(id);
		Applicant applicant=null;
		if(optional.isPresent()) {
			applicant=optional.get();
			
		}else {
			throw new IllegalArgumentException("objctArray and columnArray length is not same.");
			
		}
		return applicant;
	}

	@Override
	public void deleteApplicantById(long id) {
		this.applicantRepository.deleteById( id);
		
	}

}
