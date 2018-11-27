package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

//公共的dao接口
public interface BaseDao<T> {
	//查询所有
	List<T> selectAll();
	//easyUI 分页 查所有
	List<T> selectFYAll(@Param("page")int page,@Param("rows")int rows);
	//添加数据
	void insertData(T x);
	//单个查询
	T selectOne(@Param("id")int id);
	//修改数据
	void updateData(T x);
	//删除数据
	void deleteDate(@Param("id")int id);
	//总行数
	int Sum();
	
}
