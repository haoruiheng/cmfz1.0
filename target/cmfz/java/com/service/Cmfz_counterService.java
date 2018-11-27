package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.Cmfz_counter;

//计数器模块
public interface Cmfz_counterService {
	//根据用户id-课程id查询所有
	List<Cmfz_counter> findCounter(int user_id,int course_id);
}
