package com.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;
//计数器表
public class Cmfz_counter {

	private Integer counter_id;
	private String counter_title;
	private Integer counter_count;//计数
	@DateTimeFormat(pattern="yyyy-MM-dd")//输入格式
	@JSONField(format="yyyy-MM-dd")//输出格式
	private Date counter_createTime;//创建时间
	//用户关系属性
	//功课关系属性
	public Cmfz_counter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_counter(Integer counter_id, String counter_title,
			Integer counter_count, Date counter_createTime) {
		super();
		this.counter_id = counter_id;
		this.counter_title = counter_title;
		this.counter_count = counter_count;
		this.counter_createTime = counter_createTime;
	}
	public Integer getCounter_id() {
		return counter_id;
	}
	public void setCounter_id(Integer counter_id) {
		this.counter_id = counter_id;
	}
	public String getCounter_title() {
		return counter_title;
	}
	public void setCounter_title(String counter_title) {
		this.counter_title = counter_title;
	}
	public Integer getCounter_count() {
		return counter_count;
	}
	public void setCounter_count(Integer counter_count) {
		this.counter_count = counter_count;
	}
	public Date getCounter_createTime() {
		return counter_createTime;
	}
	public void setCounter_createTime(Date counter_createTime) {
		this.counter_createTime = counter_createTime;
	}
	@Override
	public String toString() {
		return "Cmfz_counter [counter_id=" + counter_id + ", counter_title="
				+ counter_title + ", counter_count=" + counter_count
				+ ", counter_createTime=" + counter_createTime + "]";
	}
	
	
}
