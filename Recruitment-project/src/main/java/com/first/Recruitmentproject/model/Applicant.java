package com.first.Recruitmentproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applicants_db")
public class Applicant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(name = "student_name")
    private String studentName;
	
	@Column(name = "aptitude_round")
    private String aptitudeRound;
	
	@Column(name = "coding_round")
    private String codingRound;
	
	@Column(name = "technical_round")
    private String technicalRound;
	
	@Column(name = "hr_round")
    private String hrRound	;
	
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getAptitudeRound() {
		return aptitudeRound;
	}
	public void setAptitudeRound(String aptitudeRound) {
		this.aptitudeRound = aptitudeRound;
	}
	public String getCodingRound() {
		return codingRound;
	}
	public void setCodingRound(String codingRound) {
		this.codingRound = codingRound;
	}
	public String getTechnicalRound() {
		return technicalRound;
	}
	public void setTechnicalRound(String technicalRound) {
		this.technicalRound = technicalRound;
	}
	public String getHrRound() {
		return hrRound;
	}
	public void setHrRound(String hrRound) {
		this.hrRound = hrRound;
	}
    
}
