package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Cmfz_albumDao;
import com.dto.Cmfz_albumDto;
import com.entity.Cmfz_album;
import com.service.Cmfz_albumService;

//测试专辑
public class TestAlbum {
	//启动工厂
	 ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
	//创建dao 对象
	 Cmfz_albumDao dao = (Cmfz_albumDao)this.app.getBean("cmfz_albumDao");
	 //创建service 
	 Cmfz_albumService service = (Cmfz_albumService)this.app.getBean("albumService");

	 
//TestService
	 //分页查所有
	 @Test
	 public void findAll(){
		 Cmfz_albumDto dto = service.find(1, 2);
		 System.out.println(dto);
	 }
//TestDao
	 //添加数据
	 @Test
	 public void insertDate(){
		 Cmfz_album album = new Cmfz_album();
		 album.setAlbum_title("test3");
		dao.insertData(album);
		 
	 }
	 //总条数
	 @Test
	 public void sum(){
		 int i = dao.Sum();System.out.println(i);
	 }
	 //测试分页查所有
	 @Test
	 public void selectFYAll(){
		 List<Cmfz_album> list = dao.selectFYAll(1, 2);
		 for (Cmfz_album cmfz_album : list) {
			
			 System.out.println(cmfz_album);
		}
	 }
}
