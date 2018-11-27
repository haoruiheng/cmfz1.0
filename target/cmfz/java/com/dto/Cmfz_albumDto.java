package com.dto;

import java.util.List;

import com.entity.Cmfz_album;


public class Cmfz_albumDto {
	
	private List<Cmfz_album> rows;//所有数据
	private Integer total;//总条数
	public Cmfz_albumDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_albumDto(List<Cmfz_album> rows, Integer total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public List<Cmfz_album> getRows() {
		return rows;
	}
	public void setRows(List<Cmfz_album> rows) {
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
		return "Cmfz_albumDto [rows=" + rows + ", total=" + total + "]";
	}
	
	
}
