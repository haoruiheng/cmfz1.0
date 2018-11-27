package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Cmfz_admin;
import com.service.Cmfz_adminService;

//管理员模块
@Controller//声明是控制层
@RequestMapping("adminController")
public class Cmfz_adminController {
	//DI注入
	@Resource(name="adminService")
	private Cmfz_adminService adminService;
	
	//登录功能
	@RequestMapping("login")
	public String login(String enCode,HttpServletRequest request,String password,String username){
		//获取session
		HttpSession session = request.getSession();
		//取出验证码
		String ServerCode= (String)session.getAttribute("ServerCode");
		System.out.println(ServerCode+"验证码");
		//判断验证码
		if(enCode.equals(ServerCode)){
			Cmfz_admin admin = adminService.findPwdUname(request,username, password);
			if(admin!=null){
				return "layout";
			}else{
				return "login";
			}
			
		}else{
			return "login";
		}
		
	}
	//退出模块
	@RequestMapping("deleteAd")
	public String deleteAd(HttpServletRequest request){
		//获取session
		HttpSession session = request.getSession();
		session.invalidate();
		return "login";
	}
	
}
