package com.service;

import com.dto.Cmfz_articleDto;
import com.entity.Cmfz_article;

//文章模块
public interface Cmfz_articleService {

	//查所有
	Cmfz_articleDto findArticle(int page,int rows);
	//添加数据
	void addArticle(Cmfz_article article);
	//删除数据
	void removeArticle(int id);
}
