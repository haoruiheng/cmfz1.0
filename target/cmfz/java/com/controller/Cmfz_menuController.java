package com.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Cmfz_admin;
import com.entity.Cmfz_menu;
import com.service.Cmfz_menuService;

//菜单模块
@Controller
@RequestMapping("/menuController")
public class Cmfz_menuController {
	//DI注入
	@Resource(name="menuService")
	private Cmfz_menuService menuService;
	
	//展示所有菜单
	@RequestMapping("/findAll")
	@ResponseBody
	public List<Cmfz_menu> findAll(){
		return menuService.findAll();
	} 
	
	
	
	public void setMenuService(Cmfz_menuService menuService) {
		this.menuService = menuService;
	} 
	
}
