package com.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

//轮播图模块
public class Cmfz_banner {
	
	private Integer banner_id;
	private String banner_title;
	private String banner_imgPath;//图片路径
	private Integer banner_status;//状态
	@DateTimeFormat(pattern="yyyy-MM-dd")//输入格式
	@JSONField(format="yyyy-MM-dd")//输出格式
	private Date banner_createTime;//创建时间 
	
	public Cmfz_banner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_banner(Integer banner_id, String banner_title,
			String banner_imgPath, Integer banner_status, Date banner_createTime) {
		super();
		this.banner_id = banner_id;
		this.banner_title = banner_title;
		this.banner_imgPath = banner_imgPath;
		this.banner_status = banner_status;
		this.banner_createTime = banner_createTime;
	}
	public Integer getBanner_id() {
		return banner_id;
	}
	public void setBanner_id(Integer banner_id) {
		this.banner_id = banner_id;
	}
	public String getBanner_title() {
		return banner_title;
	}
	public void setBanner_title(String banner_title) {
		this.banner_title = banner_title;
	}
	public String getBanner_imgPath() {
		return banner_imgPath;
	}
	public void setBanner_imgPath(String banner_imgPath) {
		this.banner_imgPath = banner_imgPath;
	}
	public Integer getBanner_status() {
		return banner_status;
	}
	public void setBanner_status(Integer banner_status) {
		this.banner_status = banner_status;
	}
	public Date getBanner_createTime() {
		return banner_createTime;
	}
	public void setBanner_createTime(Date banner_createTime) {
		this.banner_createTime = banner_createTime;
	}
	@Override
	public String toString() {
		return "Cmfz_banner [banner_id=" + banner_id + ", banner_title="
				+ banner_title + ", banner_imgPath=" + banner_imgPath
				+ ", banner_status=" + banner_status + ", banner_createTime="
				+ banner_createTime + "]";
	}
	
	
	
	
}
