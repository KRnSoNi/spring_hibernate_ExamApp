package com.Controller;

import java.util.List;

import javax.mail.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.DAO.UserDao;
import com.bean.ListUserExamBean;
import com.bean.QuesBean;
import com.bean.User_Exam_Bean;

@Controller
public class UserExamController {

	@Autowired
	UserDao userDao;

	@RequestMapping(value = "/examdata", method = RequestMethod.POST)
	public String examData(@ModelAttribute ListUserExamBean exams, Model model) {
		List<User_Exam_Bean> beans = exams.getUserexam();
		int marks=0;
		int questionCount=0;
		String message=null;

		for (User_Exam_Bean bean : beans) 
		{
			
			String answer = bean.getqBean().getAnswer();
			int ExamID= bean.geteBean().getExam_id();
			int QuesID= bean.getqBean().getQues_id();
			questionCount++;
			
			
			if(bean.getAnsOfUSer().equals(answer)) {
				bean.setStatus(true);	
				marks++;
			}
			else {
				bean.setStatus(false);
			}
			userDao.insertData(bean);
			model.addAttribute("data", bean);
		
		}
		
		if(marks>=questionCount/2) {
			message="Congo!You have passed this exam";
		}else {
		    message="Sorry!You have not passed this exam";
		}
		model.addAttribute("message",message);
		return "result";
		
	}
	/*
	 * int marks=0; //int ExamId =
	 * userexams.getUserexam().get(0).geteBean().getExam_id(); //ExamBean exam =
	 * session.get(ExamBean.class, ExamId); for (User_Exam_Bean bean :
	 * userexams.getUserexam()) { QuesBean qb = session.get(QuesBean.class,
	 * bean.getqBean().getQues_id()); if(qb.getAnswer().equals(bean.isAnsOfUSer()))
	 * { bean.setStatus(1); marks++; } session.save(bean); return bean; }
	 */
}
