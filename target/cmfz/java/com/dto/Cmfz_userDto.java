package com.dto;

import java.util.List;

import com.entity.Cmfz_user;

//用户表
public class Cmfz_userDto {
	
	private List<Cmfz_user> rows;//所有数据
	private Integer total;//总条数
	
	public Cmfz_userDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_userDto(List<Cmfz_user> rows, Integer total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public List<Cmfz_user> getRows() {
		return rows;
	}
	public void setRows(List<Cmfz_user> rows) {
		this.rows = rows;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Cmfz_userDto [rows=" + rows + ", total=" + total + "]";
	}
	
	
	
}
