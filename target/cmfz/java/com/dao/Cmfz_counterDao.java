package com.dao;

import java.util.List;

import com.entity.Cmfz_counter;
import org.apache.ibatis.annotations.Param;

//计数器模块
public interface Cmfz_counterDao extends BaseDao<Cmfz_counter>{
	//根据-用户id-功课id 查询所有
	List<Cmfz_counter> selectCounterAll(@Param("user_id")int user_id,@Param("course_id")int course_id);
} 
