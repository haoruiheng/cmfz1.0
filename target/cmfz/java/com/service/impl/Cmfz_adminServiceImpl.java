package com.service.impl;
//管理员模块
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cmfz_adminDao;
import com.entity.Cmfz_admin;
import com.service.Cmfz_adminService;
@Service("adminService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class Cmfz_adminServiceImpl implements Cmfz_adminService {
	//DI注入(自动注入)
	//@Autowired
	@Resource(name="cmfz_adminDao")
	private Cmfz_adminDao adminDao;
	
	//登陆功能
	@Override
	public Cmfz_admin findPwdUname(HttpServletRequest request,String username, String password) {
		// TODO Auto-generated method stub
		Cmfz_admin admin = adminDao.selectPwdUname(username, password);
		//获取session
			HttpSession session = request.getSession();
		//把用户 存入作用域
			session.setAttribute("admin", admin);
		return adminDao.selectPwdUname(username, password);
	}
	
	
	public void setAdminDao(Cmfz_adminDao adminDao) {
		this.adminDao = adminDao;
	}

}
