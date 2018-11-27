package com.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Cmfz_chapterDao;
import com.entity.Cmfz_album;
import com.entity.Cmfz_chapter;
import com.service.Cmfz_chapterService;

//章节模块
public class TestChapter {
	//启动工厂
	 ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
	//创建dao 对象
	 Cmfz_chapterDao dao = (Cmfz_chapterDao)this.app.getBean("cmfz_chapterDao");
	 //创建service 
	 Cmfz_chapterService service = (Cmfz_chapterService)this.app.getBean("chapterService");

//Service
	//测试添加章节
		 @Test
		 public void add(){
			 Cmfz_album album = new Cmfz_album();
			 album.setAlbum_id(1);
			 Cmfz_chapter chapter = new Cmfz_chapter(null,"asasqad","20MB",null,null,new Date(),album);
			 service.addchapter(chapter);
		 }
	 //id-查所有
	 @Test
	 public void selectid(){
		 List<Cmfz_chapter> list = service.findId(1);
		 for (Cmfz_chapter cmfz_chapter : list) {
			System.out.println(cmfz_chapter);
		}
	 }
//TestDao
	 //测试删除
	 @Test
	 public void delete(){
		 dao.deleteDate(19);
	 }
	 //测试添加章节
	 @Test
	 public void insert(){
		 Cmfz_album album = new Cmfz_album();
		 album.setAlbum_id(1);
		 Cmfz_chapter chapter = new Cmfz_chapter(null,"asasqad","10MB",null,null,new Date(),album);
		 dao.insertData(chapter);
	 }
	 //测试根据专辑查所有
	 @Test
	 public void selectId(){
		 List<Cmfz_chapter> list = dao.selectId(1);
		 for (Cmfz_chapter cmfz_chapter : list) {
			 System.out.println(cmfz_chapter);
		}
	 }
}
