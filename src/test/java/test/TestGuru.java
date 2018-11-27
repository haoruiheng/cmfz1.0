package com.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.Cmfz_guruDao;
import com.dto.Cmfz_guruDto;
import com.entity.Cmfz_guru;
import com.service.Cmfz_guruService;


//测试-上师表
public class TestGuru {
	//启动工厂
	 ApplicationContext app = new ClassPathXmlApplicationContext("/spring.xml");
	//创建dao 对象
	 Cmfz_guruDao dao = (Cmfz_guruDao)this.app.getBean("cmfz_guruDao");
	 //创建service 
	 Cmfz_guruService service = (Cmfz_guruService)this.app.getBean("guruService");

//TestService
	 //测试分页查
	 @Test
	 public void selevtAll(){
		 Cmfz_guruDto dto = service.findCmfz_guru(1, 3);
		 System.out.println(dto);
	 }
//TestDao
	 //测试添加
	 @Test
	 public void insert(){
		 dao.insertData(new Cmfz_guru(null,"cesh",null,null,1));
	 }
	 //测试修改
	 @Test
	 public void updlic(){
		 dao.updateData(new Cmfz_guru(7,"cesh",null,null,0));
	 }
	 //测试查所有
	 @Test 
	 public void selectAl(){
		 List<Cmfz_guru> list = dao.selectAll();
		 for (Cmfz_guru cmfz_guru : list) {
			 System.out.println(cmfz_guru);
		}
	 }
	 //测试总行数
	 @Test
	 public void sum(){
		 int sum = dao.Sum();
		 System.out.println(sum);
	 }
	 //测试分页查所有
	 @Test
	 public void selectAll(){
		 List<Cmfz_guru> list = dao.selectFYAll(1, 3);
		 for (Cmfz_guru cmfz_guru : list) {
			 System.out.println(cmfz_guru);
		}
	 }
}
