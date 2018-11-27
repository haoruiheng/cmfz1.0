package com.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dto.Cmfz_courseDto;
import com.entity.Cmfz_course;
import com.entity.Cmfz_user;
//功课模块
public interface Cmfz_courseService {
	//分页查询-默认|用户功课
	Cmfz_courseDto findCourseAll(int page,int rows,int marking);
	//根据用户id查询功课
	List<Cmfz_course> findCourseOne(int user_id);
	//添加数据
	void addCoures(Cmfz_course coures);
	//删除数据
	void removeCoures(int id);
}
