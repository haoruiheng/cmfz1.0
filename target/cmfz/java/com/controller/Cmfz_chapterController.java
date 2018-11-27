package com.controller;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.entity.Cmfz_album;
import com.entity.Cmfz_chapter;
import com.service.Cmfz_chapterService;

//章节模块
@Controller
@RequestMapping("chapterController")
public class Cmfz_chapterController {
	
	//DI注入
	@Resource(name="chapterService")
	private Cmfz_chapterService chapterService;
	
	//专辑ID查所有
	@RequestMapping("selectIdChapter")
	@ResponseBody
	public List<Cmfz_chapter> selectIdChapter(int id){
		return chapterService.findId(id);
	}
	//添加章节（文件上传）
	@RequestMapping("insertChapter")
	@ResponseBody
	public void  insertChapter(int chapter_id,MultipartFile Chapter,HttpSession session) throws IllegalStateException, IOException{
		//获取真实路径
		ServletContext ctx = session.getServletContext();
		String string = ctx.getRealPath("/upload");
		//文件上传  
		//目标文件  真实路径 拼接 文件
		File file = new File(string+ "/" + Chapter.getOriginalFilename());
		Chapter.transferTo(file);
		//存入数据库
		Cmfz_album album = new Cmfz_album();
		album.setAlbum_id(chapter_id);//存入专辑id
		//Cmfz_chapter chapter2 = new Cmfz_chapter(null,Chapter.getOriginalFilename(),Chapter.getSize()+"KB",null,null,new Date(),album);
		Cmfz_chapter chapter2 = new Cmfz_chapter();
		chapter2.setChapter_title(Chapter.getOriginalFilename());//文件名
		chapter2.setChapter_size(Chapter.getSize()+"KB");//文件大小
		//上传路径
		String s1=(String)"E:\\pache-tomcat-7.0.6\\webapps\\cmfz\\upload\\"+Chapter.getOriginalFilename();
		System.out.println(s1+"==============================全路径=======");
		chapter2.setChapter_downloadPath("E:/apache-tomcat-7.0.6/webapps/cmfz_hrh/upload/");//下载路径
		chapter2.setChapter_uploadDate(new Date());
		chapter2.setChapter_albumId(album);//专辑id
		//调业务
		chapterService.addchapter(chapter2);
	}
	//文件的下载
	@RequestMapping("downloadController")
	@ResponseBody
	public void downloadController(String fname,HttpServletResponse response) throws IOException{
		//获取源文件的字节
		System.out.println(fname);
		     File file = new File("E:\\apache-tomcat-7.0.6\\webapps\\cmfz\\upload\\"+fname);
		     byte[] bs = FileUtils.readFileToByteArray(file);
		     
		//设置 响应头信息
		     response.setHeader("content-disposition", "attachment;filename="+URLEncoder.encode(fname, "utf-8"));
		//使用输出流往client输出
		     ServletOutputStream out = response.getOutputStream();
		     out.write(bs);
	}
	//删除数据
	@RequestMapping("deleteChapter")
	@ResponseBody
	public void deleteChapter(int Chapter_id){
		chapterService.removeChapter(Chapter_id);
	}
	
	
}
