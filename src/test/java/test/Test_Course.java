package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Cmfz_courseDao;
import com.dto.Cmfz_courseDto;
import com.entity.Cmfz_course;
import com.service.Cmfz_courseService;

//测试-功课模块
public class Test_Course {
	//启动工厂
	ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
	//创建dao 对象
	Cmfz_courseDao dao = (Cmfz_courseDao)this.app.getBean("cmfz_courseDao");
	//创建service 
	Cmfz_courseService service = (Cmfz_courseService)this.app.getBean("courseService");
	
//TestService
	
	//测试根据用户id查询 功课
	@Test
	public void findCourseOne(){
		List<Cmfz_course> list = service.findCourseOne(1);
		for (Cmfz_course cmfz_course : list) {
			System.out.println(cmfz_course);
		}
	}
	//测试查所有（类型）
	@Test
	public void findc(){
		Cmfz_courseDto dto = service.findCourseAll(1, 5, 0);
		System.out.println(dto);
	}
	
//TestDao
	//测试删除
	@Test
	public void delete(){
		dao.deleteDate(10);
	}
	//测试-添加数据
	@Test
	public void insert(){
		Cmfz_course course = new Cmfz_course();
		course.setCourse_title("ceshi");
		dao.insertData(course);
	}
	
	//测试-根据用户id查询功课
	@Test
	public void  selectOne(){
		List<Cmfz_course> list = dao.selectCourseOne(1);
		for (Cmfz_course cmfz_course : list) {
			System.out.println(cmfz_course);
		}
	}
	//测试-总条数
	@Test
	public void sum(){
		int i = dao.SumMarking(0);
		System.out.println(i);
	}
	//测试-默认|用户功课
	@Test
	public void selectCourse(){
		List<Cmfz_course> list = dao.selectCourseAll(1, 5, 1);
		for (Cmfz_course cmfz_course : list) {
			System.out.println(cmfz_course);
		}
	}
}
