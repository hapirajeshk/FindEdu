package com.fe.model.tutorial;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import javax.validation.constraints.Size;

import com.fe.commons.Adress;

@Entity
@Table(name="FINDEDU_TUTORIALS_MAIN")
public class Tutorials {
	
	@Id
	@Column(name="TUTORIAL_ID")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private  int tutorialId;
	
	@Size(min=4, max=10, message="size must be 4 to 8 ")
	@Column(name="TUTORIAL_NAME")
	private String tutorialName;
	
	@Column(name="TUTORIAL_PH_NO")
	@Size(min=4, max=10, message="size must be 4 to 8 ")
	private long tutoriaPhNo;
	
	@Column(name="TUTORIAL_EMAIL")
	private String tutorialEmail;
	
	@Column(name="TUTORIAL_PASSWORD")
	private String tutorialPassword;
	
	@Column(name="TUTORIAL_START_DATE")
	private Date startDate;
	
	@Embedded
	@Column(name="TUTORIAL_ADRESS")
	private Adress tutorialAdress;
	

	public Tutorials() {
	}

	
	public Adress getTutorialAdress() {
		return tutorialAdress;
	}


	public void setTutorialAdress(Adress tutorialAdress) {
		this.tutorialAdress = tutorialAdress;
	}


	public Date getStartDate() {
		return startDate;
	}



	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}





	public int getTutorialId() {
		return tutorialId;
	}



	public void setTutorialId(int tutorialId) {
		this.tutorialId = tutorialId;
	}



	public String getTutorialName() {
		return tutorialName;
	}



	public void setTutorialName(String tutorialName) {
		this.tutorialName = tutorialName;
	}



	public long getTutoriaPhNo() {
		return tutoriaPhNo;
	}



	public void setTutoriaPhNo(long tutoriaPhNo) {
		this.tutoriaPhNo = tutoriaPhNo;
	}



	public String getTutorialEmail() {
		return tutorialEmail;
	}



	public void setTutorialEmail(String tutorialEmail) {
		this.tutorialEmail = tutorialEmail;
	}



	public String getTutorialPassword() {
		return tutorialPassword;
	}



	public void setTutorialPassword(String tutorialPassword) {
		this.tutorialPassword = tutorialPassword;
	}

	

}
