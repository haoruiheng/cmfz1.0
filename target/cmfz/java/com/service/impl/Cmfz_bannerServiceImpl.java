package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cmfz_bannerDao;
import com.entity.Cmfz_banner;
import com.service.Cmfz_bannerService;
//轮播图
@Service("bannerService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class Cmfz_bannerServiceImpl implements Cmfz_bannerService {
	
	//DI注入
	@Resource(name="cmfz_bannerDao")
	private Cmfz_bannerDao bannerDao;
	
	//查所有
	@Override
	public List<Cmfz_banner> findAll() {
		// TODO Auto-generated method stub
		return bannerDao.selectAll();
	}
	//查一个
	@Override
	public Cmfz_banner findOne(int id) {
		// TODO Auto-generated method stub
		return bannerDao.selectOne(id);
	}
	//修改数据
	@Override
	public void modifyData(Cmfz_banner x) {
		// TODO Auto-generated method stub
		bannerDao.updateData(x);
	}
	//删除数据
	@Override
	public void removeDate(int id) {
		// TODO Auto-generated method stub
		bannerDao.deleteDate(id);
	}
	//添加数据
	@Override
	public void addData(Cmfz_banner x) {
		// TODO Auto-generated method stub
		bannerDao.insertData(x);
	}

}
