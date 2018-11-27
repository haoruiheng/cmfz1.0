package com.dao;

import java.util.List;

import com.entity.Cmfz_course;
import org.apache.ibatis.annotations.Param;

//功课模块
public interface Cmfz_courseDao extends BaseDao<Cmfz_course>{
	
	//分页查询-默认|用户功课
	List<Cmfz_course> selectCourseAll(@Param("page")int page,@Param("rows")int rows,@Param("marking")int marking);
	//总条数
	int SumMarking(@Param("marking")int marking);
	//根据用户id查询功课
	List<Cmfz_course> selectCourseOne(@Param("user_id")int user_id);
	//添加功课
	//删除功课
}
