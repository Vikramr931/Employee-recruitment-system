package com.first.Recruitmentproject.model;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ApplicantConvert {
	ApplicantConvert  CONVERT= Mappers.getMapper(ApplicantConvert.class);
	
	@Mapping(source="studentName1", target="studentName")
	@Mapping(source="aptitudeRound1", target="aptitudeRound")
	@Mapping(source="codinground1", target="codinground")
	@Mapping(source="technicalround1", target="technicalround")
	@Mapping(source="hrround1", target="hrround")
	Applicant getEntity(ApplicantDto dto);
	
	@Mapping(source="studentName", target="studentName1")
	@Mapping(source="aptitudeRound", target="aptitudeRound1")
	@Mapping(source="codinground", target="codinground1")
	@Mapping(source="technicalround", target="technicalround1")
	@Mapping(source="hrround", target="hrround1")
	ApplicantDto getDto(Applicant entity);

}
