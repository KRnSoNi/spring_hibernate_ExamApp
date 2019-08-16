package com.DAO;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.ExamBean;
import com.bean.ListUserExamBean;
import com.bean.QuesBean;
import com.bean.UserBean;
import com.bean.User_Exam_Bean;

@Repository
public class UserDao {

	@Autowired
	SessionFactory factory;

	public void insertUSer(UserBean userBean) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		try {

			session.save(userBean);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public List<ExamBean> getCode(String code) {
		Session session = factory.openSession();
		System.out.println(code);
		List<ExamBean> ls = session.createQuery("from ExamBean where examCode='" + code + "'").list();
		System.out.println(ls.size());
		session.close();
		return ls;
	}

	public List<QuesBean> getQuestion(int examId) {

		Session session = factory.openSession();
		List<QuesBean> ls = session.createQuery("from QuesBean where exam_id='" + examId + "' ").list();
		session.close();
		return ls;
	}

	public List<ExamBean> listExam() {

		Session session = factory.openSession();
		List<ExamBean> ex = session.createQuery("from ExamBean").list();
		session.close();
		return ex;
	}

	public List<UserBean> listUser() {
		Session session = factory.openSession();
		List<UserBean> usr = session.createQuery("from UserBean").list();
		session.close();
		return usr;

	}

	public void insertques(QuesBean quesBean) {
		Session session = factory.openSession();
		session.save(quesBean);
		session.close();
	}

	public ExamBean search(int exam_id) {
		Session session = factory.openSession();
		/*
		 * ExamBean bean = (ExamBean)
		 * session.createQuery("from ExamBean where examCode ='"+ code +"'" ).get(0);
		 */
		ExamBean bean=session.get(ExamBean.class,exam_id);
		session.close();

		/*
		 * query.setParameter("code",code); session.close(); ExamBean bean = (ExamBean)
		 * query.list().get(0);
		 */
		return bean;
		
	}

	public List<QuesBean> listQues(int id) {
		Session session = factory.openSession();
		List<QuesBean> list = (List<QuesBean>) session.createQuery("from QuesBean where exam_id ='"+ id +"'" ).list();	
		session.close();
		return list;
	}

	public User_Exam_Bean insertData(User_Exam_Bean bean) {

		Session session = factory.openSession();
		session.save(bean);
		session.close();
		return null;
		
	}

}
