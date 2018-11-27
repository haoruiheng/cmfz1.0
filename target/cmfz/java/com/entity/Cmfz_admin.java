package com.entity;
//管理员模块
public class Cmfz_admin {
	
	private Integer cmfz_id;
	private String cmfz_username;
	private String  cmfz_password;
	public Cmfz_admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_admin(Integer cmfz_id, String cmfz_username,
			String cmfz_password) {
		super();
		this.cmfz_id = cmfz_id;
		this.cmfz_username = cmfz_username;
		this.cmfz_password = cmfz_password;
	}
	public Integer getCmfz_id() {
		return cmfz_id;
	}
	public void setCmfz_id(Integer cmfz_id) {
		this.cmfz_id = cmfz_id;
	}
	public String getCmfz_username() {
		return cmfz_username;
	}
	public void setCmfz_username(String cmfz_username) {
		this.cmfz_username = cmfz_username;
	}
	public String getCmfz_password() {
		return cmfz_password;
	}
	public void setCmfz_password(String cmfz_password) {
		this.cmfz_password = cmfz_password;
	}
	@Override
	public String toString() {
		return "cmfz_admin [cmfz_id=" + cmfz_id + ", cmfz_username="
				+ cmfz_username + ", cmfz_password=" + cmfz_password + "]";
	}
	
	
}
//cmfz_id,cmfz_username,cmfz_password