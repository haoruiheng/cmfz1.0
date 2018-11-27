package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Cmfz_userDto;
import com.entity.Cmfz_user;
import com.service.Cmfz_userService;

//用户模块
@Controller
@RequestMapping("userController")
public class Cmfz_userController {
	
	//DI注入
	@Resource(name="userService")
	private Cmfz_userService userService;
	
	//分页查所有
	@RequestMapping("selectUser")
	@ResponseBody
	public Cmfz_userDto selectUser(int page,int rows){
		return userService.find(page, rows);
	}
	//修改用户状态	(用户id|状态)
	@RequestMapping("updateUserStatus")
	@ResponseBody
	public void updateUserStatus(int user_id,int status){
		userService.modifyStatus(user_id, status);
	}
	//添加数据
	@RequestMapping("insertUser")
	@ResponseBody
	public void insertUser(Cmfz_user user){
		userService.addUser(user);
	}
	//根据用户ID查一个
	@RequestMapping("selectOneUser")
	@ResponseBody
	public Cmfz_user selectOneUser(int user_id){
		return userService.findOneUser(user_id);
	}
	//修改用户数据
	@RequestMapping("updateUser")
	@ResponseBody
	public void updateUser(Cmfz_user user){
		userService.modifyUser(user);
	}
	//用户登录功能
	@RequestMapping("loginUser")
	@ResponseBody
	public String loginUser(String uid,String pow){
		Cmfz_user user = userService.findUidPws(uid, pow);
		if(user==null){
			return "login";
		}return "index";
	}
}
