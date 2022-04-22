package com.sbi.project.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="project_payee")
public class Payee {
	
	@Id
	@GeneratedValue
	@Column(name="payee_id")
	private int payeeId;
	
	@Column(name="payee_name")
	private String payeeName;
	
	@Column(name="payee_account_number")
	private long payeeAccountNumber;

	@Column(name="payee_nickname")
	private String nickName;
	
	@ManyToOne
	@JoinColumn(name="account_number")
	private Account account;

	public int getPayeeId() {
		return payeeId;
	}

	public void setPayeeId(int payeeId) {
		this.payeeId = payeeId;
	}

	public String getPayeeName() {
		return payeeName;
	}

	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}

	public long getPayeeAccountNumber() {
		return payeeAccountNumber;
	}

	public void setPayeeAccountNumber(long payeeAccountNumber) {
		this.payeeAccountNumber = payeeAccountNumber;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
 
	
	
}
