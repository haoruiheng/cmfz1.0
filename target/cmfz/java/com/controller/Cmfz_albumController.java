package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Cmfz_albumDto;
import com.entity.Cmfz_album;
import com.service.Cmfz_albumService;

//专辑模块
@Controller
@RequestMapping("albumController")
public class Cmfz_albumController {
	
	//DI注入
	@Resource(name="albumService")
	private Cmfz_albumService albumService;
	
	//分页查询
	@RequestMapping("selectalbum")
	@ResponseBody
	public Cmfz_albumDto selectalbum(int page,int rows){
		return albumService.find(page, rows);
	}
	//添加专辑
	@RequestMapping("insertAlbum")
	@ResponseBody
	public void insertAlbum(Cmfz_album labum){
		albumService.addAlbum(labum);
	}
}
