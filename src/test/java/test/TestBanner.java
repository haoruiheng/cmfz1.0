package com.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Cmfz_bannerDao;
import com.entity.Cmfz_banner;
import com.service.Cmfz_bannerService;

//测试轮播图
public class TestBanner {
	//启动工厂
	 ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
	//创建dao 对象
	 Cmfz_bannerDao dao = (Cmfz_bannerDao)this.app.getBean("cmfz_bannerDao");
	 //创建service 
	 Cmfz_bannerService service = (Cmfz_bannerService)this.app.getBean("bannerService");

//TestService
	 //删除
	 @Test
	 public void remove(){
		 service.removeDate(8);
	 }
	 //修改
	 @Test
	 public void modify(){
		 service.modifyData(new Cmfz_banner(8,"海角","8.jpg",0,new Date()));
	 }
	 //查一个
	 @Test
	 public void findOne(){
		 Cmfz_banner banner = service.findOne(8);
		 System.out.println(banner);
	 }
	 //添加数据
	 @Test
	 public void add(){
		 service.addData(new Cmfz_banner(null,"天涯海角","8.jpg",0,new Date()));
	 }
	 //查所有
	 @Test
	 public void find(){
		 List<Cmfz_banner> list = service.findAll();
		 for (Cmfz_banner cmfz_banner : list) {
			 System.out.println(cmfz_banner);
		}
	 }
//TestDao
	 //删除数据
	 @Test
	 public void deleteData(){
		 dao.deleteDate(7);
	 }
	 //修改数据
	 @Test
	 public void updateData(){
		 dao.updateData(new Cmfz_banner(7,"天涯","8.jpg",0,new Date()));
	 }
	 //查一个
	 @Test
	 public void selectOne(){
		 Cmfz_banner banner = dao.selectOne(7);
		 System.out.println(banner);
	 }
	 //添加数据
	 @Test
	 public void insertData(){
		 dao.insertData(new Cmfz_banner(null,"天涯海角","8.jpg",0,new Date()));
	 }
	 //测试查所有
	 @Test
	 public void selectAll(){
		 List<Cmfz_banner> list = dao.selectAll();
		 for (Cmfz_banner cmfz_banner : list) {
			System.out.println(cmfz_banner);
		}
	 }
	 
}
