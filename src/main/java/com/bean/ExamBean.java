package com.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Exam_info")
public class ExamBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int exam_id;
	private String examTitle;
	private String examDate;
	private String totalMarks;
	private String duration;
	private String examCode;

	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="exam_id")
	private List<QuesBean> ques;
	
	
	 
	public List<QuesBean> getQues() {
		return ques;
	}

	public void setQues(List<QuesBean> ques) {
		this.ques = ques;
	}

	public String getExamCode() {
		return examCode;
	}

	public void setExamCode(String examCode) {
		this.examCode = examCode;
	}

	public int getExam_id() {
		return exam_id;
	}

	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}

	public String getExamTitle() {
		return examTitle;
	}

	public void setExamTitle(String examTitle) {
		this.examTitle = examTitle;
	}

	public String getExamDate() {
		return examDate;
	}

	public void setExamDate(String examDate) {
		this.examDate = examDate;
	}

	public String getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(String totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
