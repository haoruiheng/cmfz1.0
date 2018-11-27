package com.service;

import java.util.List;

import com.entity.Cmfz_chapter;

//章节模块
public interface Cmfz_chapterService {
	//根据专辑id查询所有
	List<Cmfz_chapter> findId(int id);
	// 添加章节
	void addchapter(Cmfz_chapter chapter);
	//删除数据
	void removeChapter(int Chapter_id);
}
