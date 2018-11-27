package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Cmfz_userDao;
import com.dto.Cmfz_userDto;
import com.entity.Cmfz_guru;
import com.entity.Cmfz_user;
import com.service.Cmfz_userService;

//测试-用户
public class TestUser {
	//启动工厂
		 ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
		//创建dao 对象
		 Cmfz_userDao dao = (Cmfz_userDao)this.app.getBean("cmfz_userDao");
		 //创建service 
		 Cmfz_userService service = (Cmfz_userService)this.app.getBean("userService");

//TestService
	//测试修改状态
	@Test
	public void update1s(){
		service.modifyStatus(5, 0);
	}	 
	//测试分页查
	@Test
	public void fondUser(){
		Cmfz_userDto dto = service.find(1, 3);
		System.out.println(dto);
	}
//TestDao
	//测试登录
	@Test
	public void login(){
		Cmfz_user user = dao.selectUidPws("hrh", "123");
		System.out.println(user);
	}
	@Test
	//测试修状态
	public void updateStatus(){
		dao.updateStatus(5, 0);
	}
	@Test
	//测试删除
	public void delete(){
		dao.deleteDate(6);
	}
	@Test
	//测试修改
	public void update(){
		Cmfz_user user = new Cmfz_user();
		user.setUser_uid("测试修改");
		dao.updateData(user);
	}
	@Test
	//测试查一个
	public void selectOne(){
		Cmfz_user user = dao.selectOne(6);
		System.out.println(user);
	}
	@Test
	//测试添加数据
	public void insert(){
		Cmfz_guru guru = new Cmfz_guru();
		guru.setGuru_id(1);
		Cmfz_user user = new Cmfz_user();
		user.setUser_uid("qwqweqw");
		dao.insertData(user);
		
	}
	@Test
	//测试 所有条数
	public void sum(){
		int i = dao.Sum();
		System.out.println(i);
	}
	@Test
	//测试分页查
	public void selectUser(){
		List<Cmfz_user> list = dao.selectFYAll(1, 3);
		for (Cmfz_user cmfz_user : list) {
			System.out.println(cmfz_user);
		}
	}
	
}
