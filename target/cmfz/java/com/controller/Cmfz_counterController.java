package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Cmfz_counter;
import com.service.Cmfz_counterService;

//计数器模块
@Controller
@RequestMapping("counterController")
public class Cmfz_counterController {
	
	//DI注入
	@Resource(name="counterService")
	private Cmfz_counterService counterService;
	
	//根据用户id-课程id查询所有
	@RequestMapping("selectUidCid")
	@ResponseBody
	public List<Cmfz_counter> selectUidCid(int user_id,int course_id){
		return counterService.findCounter(user_id, course_id);
	}
}
