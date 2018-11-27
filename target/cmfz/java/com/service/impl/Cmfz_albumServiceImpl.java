package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cmfz_albumDao;
import com.dto.Cmfz_albumDto;
import com.entity.Cmfz_album;
import com.service.Cmfz_albumService;


//专辑模块
@Service("albumService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class Cmfz_albumServiceImpl implements Cmfz_albumService {
	
	//DI注入
	@Resource(name="cmfz_albumDao")
	private Cmfz_albumDao albumDao;
	
	//分页查所有
	@Override
	public Cmfz_albumDto find(int page, int rows) {
		// TODO Auto-generated method stub
		return new Cmfz_albumDto(albumDao.selectFYAll(page, rows),albumDao.Sum());
	}
	//添加数据
	@Override
	public void addAlbum(Cmfz_album album) {
		// TODO Auto-generated method stub
		albumDao.insertData(album);
	}


}
