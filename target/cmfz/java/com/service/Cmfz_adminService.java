package com.service;


import javax.servlet.http.HttpServletRequest;

import com.entity.Cmfz_admin;

//管理员模块
public interface Cmfz_adminService {
	//根据账户密码查询
	Cmfz_admin findPwdUname(HttpServletRequest request,String username,String password);

}
