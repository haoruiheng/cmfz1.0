package com.entity;

import java.util.List;

//用户表
public class Cmfz_user {
	
	private Integer user_id;
	private String user_uid;//用户账号
	private String user_password;//用户密码
	private String user_farmington;//法名
	private String user_nickname;//姓名
	private String user_photo;//头像
	private String user_location;//所在地
	private String user_phone;//手机号
	private Integer user_status;//状态
	private Cmfz_guru user_guruId;//上师关系属性
	public Cmfz_user() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cmfz_user(Integer user_id, String user_uid, String user_password,
			String user_farmington, String user_nickname, String user_photo,
			String user_location, String user_phone, Integer user_status,
			Cmfz_guru user_guruId, List<Cmfz_course> course) {
		super();
		this.user_id = user_id;
		this.user_uid = user_uid;
		this.user_password = user_password;
		this.user_farmington = user_farmington;
		this.user_nickname = user_nickname;
		this.user_photo = user_photo;
		this.user_location = user_location;
		this.user_phone = user_phone;
		this.user_status = user_status;
		this.user_guruId = user_guruId;
	}

	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_uid() {
		return user_uid;
	}
	public void setUser_uid(String user_uid) {
		this.user_uid = user_uid;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_farmington() {
		return user_farmington;
	}
	public void setUser_farmington(String user_farmington) {
		this.user_farmington = user_farmington;
	}
	public String getUser_nickname() {
		return user_nickname;
	}
	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}
	public String getUser_photo() {
		return user_photo;
	}
	public void setUser_photo(String user_photo) {
		this.user_photo = user_photo;
	}
	public String getUser_location() {
		return user_location;
	}
	public void setUser_location(String user_location) {
		this.user_location = user_location;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public Integer getUser_status() {
		return user_status;
	}
	public void setUser_status(Integer user_status) {
		this.user_status = user_status;
	}
	public Cmfz_guru getUser_guruId() {
		return user_guruId;
	}
	public void setUser_guruId(Cmfz_guru user_guruId) {
		this.user_guruId = user_guruId;
	}

	@Override
	public String toString() {
		return "Cmfz_user [user_id=" + user_id + ", user_uid=" + user_uid
				+ ", user_password=" + user_password + ", user_farmington="
				+ user_farmington + ", user_nickname=" + user_nickname
				+ ", user_photo=" + user_photo + ", user_location="
				+ user_location + ", user_phone=" + user_phone
				+ ", user_status=" + user_status + ", user_guruId="
				+ user_guruId + "]";
	}

	
	
	
	
}
