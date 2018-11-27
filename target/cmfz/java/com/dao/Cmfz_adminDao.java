package com.dao;

import com.entity.Cmfz_admin;
import org.apache.ibatis.annotations.Param;

//管理员模块
public interface Cmfz_adminDao{
	//根据密码 查询账户
	Cmfz_admin selectPwdUname(@Param("username")String username, @Param("password")String password);
	//修改密码
}
