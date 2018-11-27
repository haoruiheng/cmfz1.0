package com.dto;

import java.util.List;

import com.entity.Cmfz_article;

//文章表
public class Cmfz_articleDto {
	
	private List<Cmfz_article> rows;//所有数据
	private Integer total;//总条数
	public Cmfz_articleDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_articleDto(List<Cmfz_article> rows, Integer total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public List<Cmfz_article> getRows() {
		return rows;
	}
	public void setRows(List<Cmfz_article> rows) {
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
		return "Cmfz_articleDto [rows=" + rows + ", total=" + total + "]";
	}
	
	
}
