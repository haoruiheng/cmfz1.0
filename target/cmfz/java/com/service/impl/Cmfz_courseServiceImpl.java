package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cmfz_courseDao;
import com.dto.Cmfz_courseDto;
import com.entity.Cmfz_course;
import com.entity.Cmfz_user;
import com.service.Cmfz_courseService;
//功课模块
@Service("courseService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class Cmfz_courseServiceImpl implements Cmfz_courseService {
	//DI注入
	@Resource(name="cmfz_courseDao")
	private Cmfz_courseDao courseDao;

	//分页查所有
	@Override
	public Cmfz_courseDto findCourseAll(int page, int rows, int marking) {
		// TODO Auto-generated method stub
		return new Cmfz_courseDto(courseDao.selectCourseAll(page, rows, marking),courseDao.SumMarking(marking));
	}
	//根据用户id查询功课
	@Override
	public List<Cmfz_course> findCourseOne(int user_id) {
		// TODO Auto-generated method stub
		return courseDao.selectCourseOne(user_id);
	}
	//添加数据
	@Override
	@Transactional
	public void addCoures(Cmfz_course coures) {
		// TODO Auto-generated method stub
		courseDao.insertData(coures);
		
	}
	//删除数据
	@Transactional
	@Override
	public void removeCoures(int id) {
		// TODO Auto-generated method stub
		courseDao.deleteDate(id);
	}
}
