package com.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.DAO.UserDao;
import com.bean.ExamBean;
import com.bean.ListUserExamBean;
import com.bean.QuesBean;
import com.bean.UserBean;
import com.bean.User_Exam_Bean;

@Controller
public class ExamController {

	@Autowired
	UserDao userDao;

	@RequestMapping(value = "/codeexam", method = RequestMethod.POST)
	public String selectExam(@ModelAttribute ExamBean bean, Model model, HttpSession httpSession) {

		int exam_id = bean.getExam_id();
		System.out.println("exam_id"+exam_id);
		
		ExamBean examBean = userDao.search(exam_id);
		System.out.println("Ob:"+examBean);

		List<QuesBean> questions = examBean.getQues();
		System.out.println("size:"+questions.size());
		ListUserExamBean userexamlist = new ListUserExamBean();
		List<User_Exam_Bean> userexams = new ArrayList<User_Exam_Bean>();
		
//		 String uid = (String)httpSession.getAttribute(uid);
//		 users.setUser_id(uid);
		
		for (QuesBean qb : questions) {
			User_Exam_Bean userExamBean = new User_Exam_Bean();
			userExamBean.seteBean(examBean);
			userExamBean.setqBean(qb);
			userexams.add(userExamBean);
			
		}
		userexamlist.setUserexam(userexams);
		model.addAttribute("exams",userexamlist);
		return "JAVA";
//		httpSession.setAttribute("exam", examBean);
//		httpSession.setAttribute("questions", questions);
		

	}

//	@RequestMapping(value = "/load", method = RequestMethod.GET)
//	public String load(@ModelAttribute User_Exam_Bean ue_bean, Model model, HttpSession httpSession) {
//
//		ExamBean examBean = (ExamBean) httpSession.getAttribute("exam");
//		ue_bean.seteBean(examBean);
//		List<QuesBean> ques = (List<QuesBean>) httpSession.getAttribute("questions");
//		System.out.println("size of list" + ques.size());
//		model.addAttribute("ques", ques);
//		model.addAttribute("uebean", ue_bean);
//
//		return "JAVA";
//
//	}
	
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String result(@ModelAttribute User_Exam_Bean ue_bean, Model model, HttpSession httpSession,
			@RequestParam("q1") int q1, @RequestParam("q2") int q2, @RequestParam("exam_id") int eid,
			@RequestParam("answer") String[] ans) {

		
		
		return "result";

	}
}