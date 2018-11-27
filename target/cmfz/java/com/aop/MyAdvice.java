package com.aop;

import java.lang.reflect.Method;
import java.util.Date;

import javax.servlet.http.HttpSession;

import com.entity.Cmfz_admin;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

//前置通知
public class MyAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		// TODO Auto-generated method stub
		ServletRequestAttributes  request1 =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		//获取session
		HttpSession session = request1.getRequest().getSession();
		//取出对象
		Method method=null;
			Cmfz_admin admin = (Cmfz_admin)session.getAttribute("admin");
			System.out.println(admin);
			
			try {
				//执行原始方法
				Object ret = mi.proceed();
				//什么人
				System.out.println(admin.getCmfz_username());
				//什么是时间
				System.out.println(new Date()+"执行了");
				//执行了什么方法
				System.out.println(mi.getMethod().getName()+"方法");
				
				return ret;
			} catch (Exception e) {
				// TODO: handle exception
				return null;
			}
			
			
			
		
	}
	
	
	/*@Override
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		ServletRequestAttributes  request1 =(ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		//获取session
		HttpSession session = request1.getRequest().getSession();
		//取出对象
			Cmfz_admin  admin = (Cmfz_admin)session.getAttribute("admin");
			System.out.println(admin);
		
		 * Method:目标方法
		 * args:目标方法的实参列表
		 * target:目标类的对像
		 * 
		//什么时间
		//调用什么方法
		System.out.println("前置通知开始");
		//调用什么方法
		//System.out.println(admin.getCmfz_username());
		System.out.println(new Date()+"执行一下方法");
		System.out.println("目标方法名称:"+method.getName());
		System.out.println("实参列表:");
		for (Object object : args) {
			System.out.println(object+"--");
		}
		System.out.println("目标类的对像:"+target.getClass());
		System.out.println("前置通知结束");
	}
*/
}
