package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cmfz_userDao;
import com.dto.Cmfz_userDto;
import com.entity.Cmfz_user;
import com.service.Cmfz_userService;
//用户模块
@Service("userService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class Cmfz_userServiceImpl implements Cmfz_userService {
	
	//DI注入
	@Resource(name="cmfz_userDao")
	private Cmfz_userDao userDao;
	
	//分页查所有
	@Override
	public Cmfz_userDto find(int page, int rows) {
		// TODO Auto-generated method stub
		return new Cmfz_userDto(userDao.selectFYAll(page, rows),userDao.Sum());
	}
	//添加数据
	@Override
	@Transactional
	public void addUser(Cmfz_user user) {
		// TODO Auto-generated method stub
		userDao.insertData(user);
	}
	//根据ID查询用户
	@Override
	public Cmfz_user findOneUser(int id) {
		// TODO Auto-generated method stub
		return userDao.selectOne(id);
	}
	//修改用户信息
	@Override
	@Transactional
	public void modifyUser(Cmfz_user user) {
		// TODO Auto-generated method stub
		userDao.updateData(user);
	}
	//删除用户
	@Override
	public void removeUser(int id) {
		// TODO Auto-generated method stub
		
	}
	//修改用户状态
	@Override
	@Transactional
	public void modifyStatus(int user_id, int status) {
		// TODO Auto-generated method stub
		//判断-状态
		if(status==1){
			userDao.updateStatus(user_id, 0);
		}else if(status==0){
			userDao.updateStatus(user_id, 1);
		}
		
	}
	//登录功能
	@Override
	public Cmfz_user findUidPws(String user_uid, String user_password) {
		// TODO Auto-generated method stub
		return userDao.selectUidPws(user_uid, user_password);
	}

}
