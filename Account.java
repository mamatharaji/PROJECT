package com.sbi.project.layer2;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="project_account")
public class Account {

	@Id
	@Column(name="account_number")
	private Integer account_number;
	
	@Column(name="password")
	private String password;
	
	@Column(name="balance")
	private Float balance;
	
	@OneToOne
	@JoinColumn(name="applicant_id")
	Applicant applicant;
	
	@OneToMany(mappedBy="account",cascade=CascadeType.ALL,fetch = FetchType.EAGER )
	List<Payee> payee= new ArrayList<Payee>();
	

}

