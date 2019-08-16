package com.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.DAO.UserDao;
import com.bean.ExamBean;
import com.bean.UserBean;

@Controller
public class UserController 
{

	@Autowired
	UserDao userDao;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET )
	public String signup(UserBean userBean, Model model)
	{
		model.addAttribute("userBean",userBean);
		return "login";
		
	}
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String loginUSer(@Validated UserBean userBean,BindingResult result,ExamBean examBean,Model model,HttpSession httpSession)
	{
		model.addAttribute("userBean",userBean);
		
		if(result.hasErrors())
		{
			return "login";         
			
		}else {
			userDao.insertUSer(userBean);
			int uid = userBean.getUser_id();
			System.out.println(uid);
			model.addAttribute("uid",uid);
			List<ExamBean>list=userDao.listExam();
			model.addAttribute("list",list);
			return "examCode";
			}
	}
	
	
	
 
	
}
