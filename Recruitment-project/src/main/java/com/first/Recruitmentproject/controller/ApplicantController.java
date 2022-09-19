package com.first.Recruitmentproject.controller;



import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import com.first.Recruitmentproject.RecruitmentProjectApplication;
import com.first.Recruitmentproject.model.Applicant;
import com.first.Recruitmentproject.service.AplicantService;

@Controller
public class ApplicantController {
	
	
	
	 
	@Autowired
	private AplicantService aplicantService;
	//display list of Applicants
	
	private static final Logger logger = Logger.getLogger(RecruitmentProjectApplication.class); 
	
	
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listApplicant", aplicantService.getAllApplicants());
		logger.info("home page");
		return "index";
		
	}
	@GetMapping("/newApplicantForm")
	public String newApplicantForm(Model model) {
		Applicant applicant=new  Applicant();
		model.addAttribute("applicant", applicant);
		return "new_Applicant";
	}
	@PostMapping("/addApplicantData")
	public String addApplicantData(@ModelAttribute("applicant") Applicant applicant) {
		//save applicant to database
		aplicantService.saveApplicats(applicant);
		return "redirect:/";
		
		
	}
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value="id") long id, Model model) {
		// get applicant from the service
		Applicant applicant =aplicantService.getApplicantById(id);
		
		// set applicant as a model  attribute to pre-populate the form
		model.addAttribute("applicant",applicant);
		return "update_applicant";
		
	}
	
	@GetMapping("/deleteApplicant/{id}")
	public String deleteApplicant(@PathVariable(value="id") long id) {
		// call delete employee method
		this.aplicantService.deleteApplicantById(id);
		return "redirect:/";
	}
}
