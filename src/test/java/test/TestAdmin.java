package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Cmfz_adminDao;
import com.entity.Cmfz_admin;
import com.service.Cmfz_adminService;

//测试连接
public class TestAdmin{
	//启动工厂
	 ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
	//创建dao 对象
	 Cmfz_adminDao dao = (Cmfz_adminDao)this.app.getBean("cmfz_adminDao");
	 //创建service 
	 Cmfz_adminService service = (Cmfz_adminService)this.app.getBean("adminService");
	 
//测试service
	 //登陆功能
	 @Test
	 public void findAll(){
		/* Cmfz_admin admin = service.findPwdUname("root", "123");
		 System.out.println(admin);*/
	 }
	
//测试dao
	 //账号密码查询
	 @Test
	 public void selectAll(){
		Cmfz_admin admin = dao.selectPwdUname("root", "123");
		System.out.println(admin);
	 }
}
