package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "User_Exam")
public class User_Exam_Bean 

{
 	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 	private int user_exam_id;
 	
 	@ManyToOne
 	UserBean uBean;
 	
 	@ManyToOne
 	ExamBean eBean;
 	
 	@ManyToOne
 	QuesBean qBean;
 	
	
 	private String ansOfUSer;
 	private boolean status;
	public int getUser_exam_id() {
		return user_exam_id;
	}
	public void setUser_exam_id(int user_exam_id) {
		this.user_exam_id = user_exam_id;
	}
	public UserBean getuBean() {
		return uBean;
	}
	public void setuBean(UserBean uBean) {
		this.uBean = uBean;
	}
	public ExamBean geteBean() {
		return eBean;
	}
	public void seteBean(ExamBean eBean) {
		this.eBean = eBean;
	}
	public QuesBean getqBean() {
		return qBean;
	}
	public void setqBean(QuesBean qBean) {
		this.qBean = qBean;
	}
	public String getAnsOfUSer() {
		return ansOfUSer;
	}
	public void setAnsOfUSer(String ansOfUSer) {
		this.ansOfUSer = ansOfUSer;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean b) {
		this.status = b;
	}

}