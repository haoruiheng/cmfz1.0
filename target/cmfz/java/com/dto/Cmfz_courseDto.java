package com.dto;

import java.util.List;

import com.entity.Cmfz_course;

//课程模块
public class Cmfz_courseDto {
	
	private List<Cmfz_course> rows;//所有数据
	private Integer total;//总条数
	
	public Cmfz_courseDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_courseDto(List<Cmfz_course> rows, Integer total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public List<Cmfz_course> getRows() {
		return rows;
	}
	public void setRows(List<Cmfz_course> rows) {
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
		return "Cmfz_courseDto [rows=" + rows + ", total=" + total + "]";
	}
	
	
}
