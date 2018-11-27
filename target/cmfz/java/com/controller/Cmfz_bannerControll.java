package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Cmfz_banner;
import com.service.Cmfz_bannerService;

//轮播图
@Controller//声明是控制层
@RequestMapping("bannerControll")
public class Cmfz_bannerControll {
	//DI注入
	@Resource(name="bannerService")
	private Cmfz_bannerService bannerService;
	
	//展示所有
	@RequestMapping("findBanner")
	@ResponseBody
	public List<Cmfz_banner> findBanner(){
		return bannerService.findAll();
	}
	//添加
	@RequestMapping("addBanner")
	@ResponseBody
	public void addBanner(Cmfz_banner x){
		bannerService.addData(x);
	}
	//删除
	@RequestMapping("deleteBanner")
	@ResponseBody
	public void  deleteBanner(int id){
		bannerService.removeDate(id);
	}
}
