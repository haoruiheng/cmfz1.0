package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cmfz_chapterDao;
import com.entity.Cmfz_chapter;
import com.service.Cmfz_chapterService;
//章节模块
@Service("chapterService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)

public class Cmfz_chapterServiceImpl implements Cmfz_chapterService {
	
	//DI注入
	@Resource(name="cmfz_chapterDao")
	private Cmfz_chapterDao chapterDao;
	
	//根据专辑id查询章节
	@Override
	public List<Cmfz_chapter> findId(int id) {
		// TODO Auto-generated method stub
		return chapterDao.selectId(id);
	}
	//添加数据
	@Override
	@Transactional
	public void addchapter(Cmfz_chapter chapter) {
		// TODO Auto-generated method stub
		chapterDao.insertData(chapter);
	}
	//删除数据
	@Override
	@Transactional
	public void removeChapter(int Chapter_id) {
		// TODO Auto-generated method stub
		chapterDao.deleteDate(Chapter_id);
	}

}
