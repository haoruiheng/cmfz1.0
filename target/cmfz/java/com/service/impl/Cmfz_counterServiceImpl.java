package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cmfz_counterDao;
import com.entity.Cmfz_counter;
import com.service.Cmfz_counterService;
//计数器模块
@Service("counterService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)//查询事物
public class Cmfz_counterServiceImpl implements Cmfz_counterService {
	//DI注入
	@Resource(name="cmfz_counterDao")
	private Cmfz_counterDao counterDao; 

	@Override
	public List<Cmfz_counter> findCounter(int user_id,int course_id) {
		// TODO Auto-generated method stub
		return counterDao.selectCounterAll(user_id, course_id);
	}

}
