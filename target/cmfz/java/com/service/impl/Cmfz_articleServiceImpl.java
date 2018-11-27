package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cmfz_articleDao;
import com.dto.Cmfz_articleDto;
import com.entity.Cmfz_article;
import com.service.Cmfz_articleService;
//文章表
@Service("articleService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class Cmfz_articleServiceImpl implements Cmfz_articleService {
	//DI注入
	@Resource(name="cmfz_articleDao")
	private Cmfz_articleDao articleDao;
	
	//分页查所有
	@Override
	public Cmfz_articleDto findArticle(int page, int rows) {
		// TODO Auto-generated method stub
		return new Cmfz_articleDto(articleDao.selectFYAll(page, rows),articleDao.Sum());
	}
	//添加数据
	@Override
	@Transactional
	public void addArticle(Cmfz_article article) {
		// TODO Auto-generated method stub
		articleDao.insertData(article);
		
	}
	//删除数据
	@Override
	@Transactional
	public void removeArticle(int id) {
		// TODO Auto-generated method stub
		articleDao.deleteDate(id);
	}

}
