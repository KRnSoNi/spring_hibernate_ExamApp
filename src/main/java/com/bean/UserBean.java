package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "Users")
public class UserBean 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	
	@NotBlank(message = "User Name Required")
	private String userName;
	
	@NotBlank(message = "E-mail ID Required")
	private String email;
	
	@NotBlank(message = "Password Required")
	private String password;
	
	
	/*
	 * @OneToMany
	 * 
	 * @JoinColumn(name="user_id") private List<ExamBean> examlist;
	 * 
	 * @OneToMany
	 * 
	 * @JoinColumn(name="user_id") private List<QuesBean> queslist;
	 */
	/*
	 * public List<ExamBean> getExamlist() { return examlist; } public void
	 * setExamlist(List<ExamBean> examlist) { this.examlist = examlist; } public
	 * List<QuesBean> getQueslist() { return queslist; } public void
	 * setQueslist(List<QuesBean> queslist) { this.queslist = queslist; }
	 */
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
