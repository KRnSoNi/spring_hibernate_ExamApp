package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Admin_info")
public class AdminBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int admin_id;
	private String usernameA;
	private String passwordA;
	public String getUsernameA() {
		return usernameA;
	}
	public void setUsernameA(String usernameA) {
		this.usernameA = usernameA;
	}
	public String getPasswordA() {
		return passwordA;
	}
	public void setPasswordA(String passwordA) {
		this.passwordA = passwordA;
	}

}
