package com.dao;

import com.entity.Cmfz_user;
import org.apache.ibatis.annotations.Param;

//用户模块
public interface Cmfz_userDao extends BaseDao<Cmfz_user>{
	//分页查所有
	//查总条数
	//添加
	//修改
	//删除
	//修改状态
	void updateStatus(@Param("user_id")int user_id,@Param("status")int status);
	//用户登录
	Cmfz_user selectUidPws(@Param("user_uid")String user_uid,@Param("user_password")String user_password);
}
