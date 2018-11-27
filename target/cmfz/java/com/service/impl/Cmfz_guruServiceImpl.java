package com.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cmfz_guruDao;
import com.dto.Cmfz_guruDto;
import com.entity.Cmfz_guru;
import com.service.Cmfz_guruService;
//上师模块
@Service("guruService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class Cmfz_guruServiceImpl implements Cmfz_guruService {
	//DI注入
	@Resource(name="cmfz_guruDao")
	private Cmfz_guruDao guruDao;
	
	//分页查所有
	@Override
	public Cmfz_guruDto findCmfz_guru(int page, int rows) {
		// TODO Auto-generated method stub
		return new Cmfz_guruDto(guruDao.selectFYAll(page, rows),guruDao.Sum());
	}
	//查所有
	@Override
	@Transactional
	public List<Cmfz_guru> findGuru() {
		// TODO Auto-generated method stub
		return guruDao.selectAll();
	}
	//添加数据
	@Override
	@Transactional
	public void addGuru(Cmfz_guru guru) {
		// TODO Auto-generated method stub
		guruDao.insertData(guru);
	}
	//修改状态
	@Override
	@Transactional
	public void modifyGuru(Cmfz_guru guru) {
		// TODO Auto-generated method stub
		guruDao.updateData(guru);
	}

}
