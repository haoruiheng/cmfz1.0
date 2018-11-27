package com.service;

import java.util.List;

import com.entity.Cmfz_menu;

//菜单表
public interface Cmfz_menuService{
	//1.查所有
	List<Cmfz_menu> findAll();
	
}
