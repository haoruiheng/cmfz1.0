package com.inte;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Cmfz_admin;

public class Interceptor implements HandlerInterceptor {
	//拦截器
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		//获取session
		HttpSession session = request.getSession();
		//取出对象
		Cmfz_admin  admin = (Cmfz_admin)session.getAttribute("admin");
		if(admin==null){
			response.sendRedirect(request.getContextPath()+"/login.jsp");
			//request.getDateHeader("/login.jsp").forward(request,response);
			return false;
		}else{
			return true;
		}
		 
		
	}
	
	//controller 执行之后 跳转执行之前  执行改方法
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub

	}

	//跳转页面后 执行
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
