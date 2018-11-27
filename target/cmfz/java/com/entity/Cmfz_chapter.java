package com.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

//章节表
public class Cmfz_chapter {
	
	private Integer chapter_id;
	private String chapter_title;
	private String chapter_size;//文件大小
	private String chapter_duration;//时长
	private String chapter_downloadPath;//下载路径
	@DateTimeFormat(pattern="yyyy-MM-dd")//输入格式
	@JSONField(format="yyyy-MM-dd")//输出格式
	private Date chapter_uploadDate;//上传时间
	//private Integer chapter_albumIdd;//关系属性--专辑
	private Cmfz_album chapter_albumId;//关系属性对象--专辑
	
	public Cmfz_chapter() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cmfz_chapter(Integer chapter_id, String chapter_title,
			String chapter_size, String chapter_duration,
			String chapter_downloadPath, Date chapter_uploadDate,
			Cmfz_album chapter_albumId) {
		super();
		this.chapter_id = chapter_id;
		this.chapter_title = chapter_title;
		this.chapter_size = chapter_size;
		this.chapter_duration = chapter_duration;
		this.chapter_downloadPath = chapter_downloadPath;
		this.chapter_uploadDate = chapter_uploadDate;
		this.chapter_albumId = chapter_albumId;
	}

	public Integer getChapter_id() {
		return chapter_id;
	}
	public void setChapter_id(Integer chapter_id) {
		this.chapter_id = chapter_id;
	}
	public String getChapter_title() {
		return chapter_title;
	}
	public void setChapter_title(String chapter_title) {
		this.chapter_title = chapter_title;
	}
	public String getChapter_size() {
		return chapter_size;
	}
	public void setChapter_size(String chapter_size) {
		this.chapter_size = chapter_size;
	}
	public String getChapter_duration() {
		return chapter_duration;
	}
	public void setChapter_duration(String chapter_duration) {
		this.chapter_duration = chapter_duration;
	}
	public String getChapter_downloadPath() {
		return chapter_downloadPath;
	}
	public void setChapter_downloadPath(String chapter_downloadPath) {
		this.chapter_downloadPath = chapter_downloadPath;
	}
	
	public Date getChapter_uploadDate() {
		return chapter_uploadDate;
	}

	public void setChapter_uploadDate(Date chapter_uploadDate) {
		this.chapter_uploadDate = chapter_uploadDate;
	}

	
	public Cmfz_album getChapter_albumId() {
		return chapter_albumId;
	}
	public void setChapter_albumId(Cmfz_album chapter_albumId) {
		this.chapter_albumId = chapter_albumId;
	}

	@Override
	public String toString() {
		return "Cmfz_chapter [chapter_id=" + chapter_id + ", chapter_title="
				+ chapter_title + ", chapter_size=" + chapter_size
				+ ", chapter_duration=" + chapter_duration
				+ ", chapter_downloadPath=" + chapter_downloadPath
				+ ", chapter_uploadDate=" + chapter_uploadDate
				+ ", chapter_albumId=" + chapter_albumId + "]";
	}
	
	
	
}
