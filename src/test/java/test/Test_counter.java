package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Cmfz_counterDao;
import com.entity.Cmfz_counter;

//测试-功课模块
public class Test_counter {
	//启动工厂
	ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
	//创建dao 对象
	Cmfz_counterDao dao = (Cmfz_counterDao)this.app.getBean("cmfz_counterDao");
	//创建service 
	//Cmfz_courseService service = (Cmfz_courseService)this.app.getBean("courseService");
	
//TestService
	
	
	
//TestDao
	
	//测试-根据用户id和课程id
	@Test
	public void selectid(){
		List<Cmfz_counter> list = dao.selectCounterAll(1, 2);
		for (Cmfz_counter cmfz_counter : list) {
			System.out.println(cmfz_counter);
		}
	}
}
