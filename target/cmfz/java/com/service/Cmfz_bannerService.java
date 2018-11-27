package com.service;

import java.util.List;

import com.entity.Cmfz_banner;

//轮播图
public interface Cmfz_bannerService {
	//查询所有
	List<Cmfz_banner> findAll();
	//添加数据
	void addData(Cmfz_banner x);
	//单个查询
	Cmfz_banner findOne(int id);
	//修改数据
	void modifyData(Cmfz_banner x);
	//删除数据
	void removeDate(int id);
}
