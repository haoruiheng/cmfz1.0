package com.service;

import org.apache.ibatis.annotations.Param;

import com.dto.Cmfz_userDto;
import com.entity.Cmfz_user;

//用户模块
public interface Cmfz_userService {
	//分页查所有
	Cmfz_userDto find(int page,int rows);
	//添加数据
	void addUser(Cmfz_user user);
	//单个查询
	Cmfz_user findOneUser(int id);
	//修改数据
	void modifyUser(Cmfz_user user);
	//删除数据(未实现)
	void removeUser(int id);
	//修改状态
	void modifyStatus(int user_id,int status);
	//登录功能
	Cmfz_user findUidPws(String user_uid,String user_password);

}
