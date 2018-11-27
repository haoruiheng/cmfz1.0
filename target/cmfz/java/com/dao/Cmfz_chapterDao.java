package com.dao;

import java.util.List;

import com.entity.Cmfz_chapter;

//章节模块
public interface Cmfz_chapterDao extends BaseDao<Cmfz_chapter>{
	//根据专辑id-查所有
	List<Cmfz_chapter> selectId(int id);
	//添加数据void insertData(T x); 
	//删除数据
	
}
