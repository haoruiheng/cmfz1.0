package com.entity;
//上师表
public class Cmfz_guru {
	
	private Integer guru_id;
	private String guru_name;
	private String guru_profile;//头像
	private String guru_brief;//简介
	private Integer guru_status;//状态
	public Cmfz_guru() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_guru(Integer guru_id, String guru_name, String guru_profile,
			String guru_brief, Integer guru_status) {
		super();
		this.guru_id = guru_id;
		this.guru_name = guru_name;
		this.guru_profile = guru_profile;
		this.guru_brief = guru_brief;
		this.guru_status = guru_status;
	}
	public Integer getGuru_id() {
		return guru_id;
	}
	public void setGuru_id(Integer guru_id) {
		this.guru_id = guru_id;
	}
	public String getGuru_name() {
		return guru_name;
	}
	public void setGuru_name(String guru_name) {
		this.guru_name = guru_name;
	}
	public String getGuru_profile() {
		return guru_profile;
	}
	public void setGuru_profile(String guru_profile) {
		this.guru_profile = guru_profile;
	}
	public String getGuru_brief() {
		return guru_brief;
	}
	public void setGuru_brief(String guru_brief) {
		this.guru_brief = guru_brief;
	}
	public Integer getGuru_status() {
		return guru_status;
	}
	public void setGuru_status(Integer guru_status) {
		this.guru_status = guru_status;
	}
	@Override
	public String toString() {
		return "Cmfz_guru [guru_id=" + guru_id + ", guru_name=" + guru_name
				+ ", guru_profile=" + guru_profile + ", guru_brief="
				+ guru_brief + ", guru_status=" + guru_status + "]";
	}
	
	
	
}
