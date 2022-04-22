package com.sbi.project.layer2;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="project_applicant")
public class Applicant {
	@Id
	@GeneratedValue
	@Column(name="applicant_id")
	private Integer applicantId;
	
	@Column(name="salutation")
	private String salutation;
	
	@Column(name="applicant_name")
	private String applicantName;
	
	@Column(name="applicant_father_name")
	private String applicantFatherName;
	
	@Column(name="dob")
	private LocalDate dob;
	
	@Column(name="gender")
	private Character gender;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private Integer phone;
	
	@Column(name="aadhar")
	private Integer aadhar;
	
	@Column(name="pan")
	private String pan;
	
	@Column(name="occupation")
	private String occupation;
	
	@Column(name="annua_income")
	private Double annualIncome;
	
	@Column(name="application_status")
	private String application_status;
	
	@Column(name="marital_status")
	private String marital_status;
	
	@Column(name="address")
	private String address;

	public Integer getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}

	public String getSalutation() {
		return salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantFatherName() {
		return applicantFatherName;
	}

	public void setApplicantFatherName(String applicantFatherName) {
		this.applicantFatherName = applicantFatherName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Integer getAadhar() {
		return aadhar;
	}

	public void setAadhar(Integer aadhar) {
		this.aadhar = aadhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getApplication_status() {
		return application_status;
	}

	public void setApplication_status(String application_status) {
		this.application_status = application_status;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@OneToOne(mappedBy="applicant")
	Account account;
	
	
	

//	CREATE TABLE PROJECT_APPLICANT(
//			 APPLICANT_ID             INT CONSTRAINT APP_ID_PK PRIMARY KEY,
//			 SALUTATION               VARCHAR(10) CONSTRAINT APP_SAL_NOTNUL NOT NULL,
//			 APPLICANT_NAME           VARCHAR(20) CONSTRAINT APP_NAME_NOTNUL NOT NULL,
//			 APPLICANT_FATHERNAME     VARCHAR(20) CONSTRAINT APP_FNAME_NOTNUL NOT NULL,
//			 DOB                      DATE CONSTRAINT APP_CHK_DOB CHECK (DOB < '2004-03-31'),
//			 GENDER		          CHAR(1) DEFAULT 'F',
//			 EMAIL		          VARCHAR(20) CONSTRAINT APP_MAIL_UNIQ UNIQUE,
//			 PHONE		          BIGINT CONSTRAINT APP_PH_UNIQ UNIQUE,
//			 AADHAR		          BIGINT CONSTRAINT APP_AADHAR_UNIQ UNIQUE,
//			 PAN	                  VARCHAR(10) CONSTRAINT APP_PAN_UNIQ UNIQUE,
//			 OCCUPATION               VARCHAR(20) CONSTRAINT APP_OCC_NOTNUL NOT NULL,
//			 ANNUALINCOME             BIGINT ,
//			 APPLICATION_STATUS       VARCHAR(20) CONSTRAINT APP_STAT_NOTNUL NOT NULL,
//			 MARITAL_STATUS           VARCHAR(20) CONSTRAINT APP_MAR_NOTNUL NOT NULL,
//			 ADDRESS                  VARCHAR(150) CONSTRAINT APP_ADDR_NOTNUL NOT NULL)

}
