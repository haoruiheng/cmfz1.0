package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Cmfz_courseDto;
import com.entity.Cmfz_course;
import com.entity.Cmfz_user;
import com.service.Cmfz_courseService;

//功课模块
@Controller
@RequestMapping("courseController")
public class Cmfz_courseController {
	//DI注入
	@Resource(name="courseService")
	private Cmfz_courseService courseService;
	
	//查所有功课（状态）
	@RequestMapping("selectCourse")
	@ResponseBody
	public Cmfz_courseDto selectCourse(int page,int rows,int marking){
		return courseService.findCourseAll(page, rows, marking);
	}
	//根据用户id 查询所有功课
	@RequestMapping("selectCourseOne")
	@ResponseBody
	public List<Cmfz_course> selectCourseOne(int userId){
		return courseService.findCourseOne(userId);
	}
	//添加数据
	@RequestMapping("insertCourse")
	@ResponseBody
	public void insertCourse(Cmfz_course coures){
		courseService.addCoures(coures);
	}
	//删除数据
	@RequestMapping("deleteCoures")
	@ResponseBody
	public void deleteCoures(int coures_id){
		courseService.removeCoures(coures_id);
	}
}
