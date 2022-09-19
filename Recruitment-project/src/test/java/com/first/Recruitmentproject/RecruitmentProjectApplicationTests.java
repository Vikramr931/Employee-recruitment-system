package com.first.Recruitmentproject;



import static org.junit.Assert.assertThat;

import org.junit.Test;
 
import org.springframework.boot.test.context.SpringBootTest;

import com.first.Recruitmentproject.model.Applicant;
import com.first.Recruitmentproject.model.ApplicantConvert;
import com.first.Recruitmentproject.model.ApplicantDto;



@SpringBootTest
class RecruitmentProjectApplicationTests {
	
	
	 @Test
	    public void testToEntity() {
	        Applicant app = new Applicant();
	        
	        ApplicantDto dto=ApplicantConvert.CONVERT.getDto(app);
	        
	        
	        
	      
	       

//	        assertThat(dto.getStudentName1()).isEqualto();
//
//	        assertEquals(entity.getStudentId(), dto.getStudentId());
//	        assertEquals(entity.getFirstName(), dto.getFirstName());
//	        assertEquals(entity.getLastName(), dto.getLastName());
//	        assertEquals(entity.getYear(), dto.getYear());
	    }

}
