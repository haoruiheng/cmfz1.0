package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Cmfz_articleDao;
import com.dto.Cmfz_articleDto;
import com.entity.Cmfz_article;
import com.entity.Cmfz_guru;
import com.service.Cmfz_articleService;

//测试文章表
public class TestArticle {
	//启动工厂
	 ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
	//创建dao 对象
	 Cmfz_articleDao dao = (Cmfz_articleDao)this.app.getBean("cmfz_articleDao");
	 //创建service 
	 Cmfz_articleService service = (Cmfz_articleService)this.app.getBean("articleService");

//TestService
	 //测试分页
	 @Test
	 public void findAll(){
		 Cmfz_articleDto dto = service.findArticle(1, 2);
		 System.out.println(dto);
	 }
//TestDao
	 //测试删除
	 @Test
	 public void delete(){
		 dao.deleteDate(7);
	 }
	 //test添加数据
	 @Test
	 public void insert(){
		 Cmfz_article article = new Cmfz_article();
		 article.setArticle_title("test1");
		 Cmfz_guru guru = new Cmfz_guru();
		 guru.setGuru_id(1);
		 article.setArticle_guruId(guru);
		dao.insertData(article);
	 }
	 //测试分页查所有
	 @Test
	 public void selectAll(){
		 List<Cmfz_article> list = dao.selectFYAll(1, 3);
		 for (Cmfz_article cmfz_article : list) {
			 System.out.println(cmfz_article);
		}
	 }
	 //测试查所有条数
	 @Test
	 public void sum(){
		 int i = dao.Sum();
		 System.out.println(i);
	 }
}
