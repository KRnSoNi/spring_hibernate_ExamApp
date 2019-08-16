package com.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ques_info")
public class QuesBean 
{
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int Ques_id; 
		private String question;

		private String quesName;
		public String getQuesName() {
			return quesName;
		}

		public void setQuesName(String quesName) {
			this.quesName = quesName;
		}

		public String getQuestion() {
			return question;
		}

		public void setQuestion(String question) {
			this.question = question;
		}

		private String optA;
		private String optB;
		private String optC;
		private String optD;
		private String answer;
		
		
		

		public int getQues_id() {
			return Ques_id;
		}

		public void setQues_id(int ques_id) {
			Ques_id = ques_id;
		}

		public String getOptA() {
			return optA;
		}

		public void setOptA(String optA) {
			this.optA = optA;
		}

		public String getOptB() {
			return optB;
		}

		public void setOptB(String optB) {
			this.optB = optB;
		}

		public String getOptC() {
			return optC;
		}

		public void setOptC(String optC) {
			this.optC = optC;
		}

		public String getOptD() {
			return optD;
		}

		public void setOptD(String optD) {
			this.optD = optD;
		}

		public String getAnswer() {
			return answer;
		}

		public void setAnswer(String answer) {
			this.answer = answer;
		}

		
}
