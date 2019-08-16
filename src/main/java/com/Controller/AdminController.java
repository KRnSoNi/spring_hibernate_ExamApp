package com.Controller;

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
import com.bean.QuesBean;
import com.bean.UserBean;

@Controller
public class AdminController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = "/admin", method =RequestMethod.GET)
	public String adminLogin()
	{
		return "admin";
		
	}
	
	

	@RequestMapping(value = "/check", method = RequestMethod.GET)
	public String checkAdmin(@RequestParam("usernameA") String uname, @RequestParam("passwordA") String pwd) {
		if (uname.equals("admin") && pwd.equals("admin")) {
			return "admin2";
		} else
			return "admin";

	}

	@RequestMapping(value = "/listexams", method = RequestMethod.GET)
	public String listexam(ExamBean examBean, Model model) {
		List<ExamBean> ls = (List<ExamBean>)userDao.listExam();
		System.out.println(ls);
		model.addAttribute("exams", ls);
		return "listexams";

	}

	@RequestMapping(value = "/listusers", method = RequestMethod.GET)
	public String listuser(UserBean userBean, Model model) {
		List<UserBean> ls = (List<UserBean>)userDao.listUser();
		model.addAttribute("users", ls);
		return "listusers";

	}
	
	@RequestMapping(value = "/listques/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") int id,Model model) {
		List<QuesBean> ql = userDao.listQues(id);
		System.out.println("size of List Q:" +ql.size());
		model.addAttribute("qlist",ql);
		return "listques";

	}


	@RequestMapping(value = "/newquestion", method = RequestMethod.GET)
	public String newQues(@ModelAttribute ExamBean examBean, Model model) {
		QuesBean que = new QuesBean();
		List<ExamBean> listexam = userDao.listExam();
		model.addAttribute("listexam", listexam);
		model.addAttribute("que", que);

		return "newquestion";

	}
	
	@RequestMapping(value="/insertQues" , method = RequestMethod.POST)
	public String insertQues(@ModelAttribute("que")QuesBean quesBean ) {
		
		userDao.insertques(quesBean);
		return "admin";
	}
	
	/*
	 * @RequestMapping(value = "/newexam", method = RequestMethod.POST) public
	 * String newExam(@ModelAttribute ExamBean examBean, Model model) {
	 * model.addAttribute("listexam", listexam); model.addAttribute("que", que);
	 * 
	 * return "newquestion";
	 * 
	 * }
	 */

}
