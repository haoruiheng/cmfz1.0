package com.entity;

import java.util.List;

//功课表
public class Cmfz_course {
	
	private Integer course_id;
	private String course_title;//功课名称
	private Integer course_marking;//功课类型
	private List<Cmfz_user> course_user;//用户关系属性
	
	public Cmfz_course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_course(Integer course_id, String course_title,
			List<Cmfz_user> course_user, Integer course_marking) {
		super();
		this.course_id = course_id;
		this.course_title = course_title;
		this.course_user = course_user;
		this.course_marking = course_marking;
	}
	public Integer getCourse_id() {
		return course_id;
	}
	public void setCourse_id(Integer course_id) {
		this.course_id = course_id;
	}
	public String getCourse_title() {
		return course_title;
	}
	public void setCourse_title(String course_title) {
		this.course_title = course_title;
	}
	public List<Cmfz_user> getCourse_user() {
		return course_user;
	}
	public void setCourse_user(List<Cmfz_user> course_user) {
		this.course_user = course_user;
	}
	public Integer getCourse_marking() {
		return course_marking;
	}
	public void setCourse_marking(Integer course_marking) {
		this.course_marking = course_marking;
	}
	@Override
	public String toString() {
		return "Cmfz_course [course_id=" + course_id + ", course_title="
				+ course_title + ", course_marking=" + course_marking
				+ ", course_user=" + course_user + "]";
	}
	
	
	
}
