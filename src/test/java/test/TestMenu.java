package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Cmfz_menuDao;
import com.entity.Cmfz_menu;
import com.service.Cmfz_menuService;

//测试连接
public class TestMenu{
	//启动工厂
	 ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
	//创建dao 对象
	 Cmfz_menuDao dao = (Cmfz_menuDao)this.app.getBean("cmfz_menuDao");
	 //创建service 
	 Cmfz_menuService service = (Cmfz_menuService)this.app.getBean("menuService");
	 
//测试service
	 //菜单查所有
	 @Test
	 public void findAll(){
		 List<Cmfz_menu> list = service.findAll();
		 for (Cmfz_menu cmfz_menu : list) {
			System.out.println(cmfz_menu);
		}
	 }
//测试dao
	 //菜单查询
	 @Test
	 public void selectAll(){
		 List<Cmfz_menu> list = dao.selectAll();
		 for (Cmfz_menu cmfz_menu : list) {
			System.out.println(cmfz_menu);
		}
	 }
}
