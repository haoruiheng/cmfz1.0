package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Cmfz_articleDto;
import com.entity.Cmfz_article;
import com.service.Cmfz_articleService;

//文章表
@Controller
@RequestMapping("articleController")
public class Cmfz_articleController {
	
	//DI注入
	@Resource(name="articleService")
	private Cmfz_articleService articleService;
	
	//分页查询
	@RequestMapping("selectArticle")
	@ResponseBody
	public Cmfz_articleDto selectArticle(int page,int rows){
		return articleService.findArticle(page, rows);
	}
	//添加数据
	@RequestMapping("insertArticle")
	@ResponseBody
	public void insertArticle(Cmfz_article article){
		articleService.addArticle(article);
	}
	//删除数据
	@RequestMapping("deleteArticle")
	@ResponseBody
	public void deleteArticle(int article_id){
		articleService.removeArticle(article_id);
	}
	
}
