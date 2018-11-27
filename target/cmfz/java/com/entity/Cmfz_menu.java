package com.entity;

import java.util.List;

//菜单表
public class Cmfz_menu {
	
	private Integer cmfz_id;
	private String cmfz_title;//标题
	private String cmfz_url;
	private String cmfz_iconCls;
	private List<Cmfz_menu> parent_idd;
	public Cmfz_menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_menu(Integer cmfz_id, String cmfz_title, String cmfz_url,
			String cmfz_iconCls, List<Cmfz_menu> parent_idd) {
		super();
		this.cmfz_id = cmfz_id;
		this.cmfz_title = cmfz_title;
		this.cmfz_url = cmfz_url;
		this.cmfz_iconCls = cmfz_iconCls;
		this.parent_idd = parent_idd;
	}
	public Integer getCmfz_id() {
		return cmfz_id;
	}
	public void setCmfz_id(Integer cmfz_id) {
		this.cmfz_id = cmfz_id;
	}
	public String getCmfz_title() {
		return cmfz_title;
	}
	public void setCmfz_title(String cmfz_title) {
		this.cmfz_title = cmfz_title;
	}
	public String getCmfz_url() {
		return cmfz_url;
	}
	public void setCmfz_url(String cmfz_url) {
		this.cmfz_url = cmfz_url;
	}
	public String getCmfz_iconCls() {
		return cmfz_iconCls;
	}
	public void setCmfz_iconCls(String cmfz_iconCls) {
		this.cmfz_iconCls = cmfz_iconCls;
	}
	public List<Cmfz_menu> getParent_idd() {
		return parent_idd;
	}
	public void setParent_idd(List<Cmfz_menu> parent_idd) {
		this.parent_idd = parent_idd;
	}
	@Override
	public String toString() {
		return "Cmfz_menu [cmfz_id=" + cmfz_id + ", cmfz_title=" + cmfz_title
				+ ", cmfz_url=" + cmfz_url + ", cmfz_iconCls=" + cmfz_iconCls
				+ ", parent_idd=" + parent_idd + "]";
	}
	
	
	
}
//cmfz_id,cmfz_title,cmfz_url,cmfz_iconCls,parent_id