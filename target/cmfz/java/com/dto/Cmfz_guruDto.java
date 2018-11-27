package com.dto;

import java.util.List;

import com.entity.Cmfz_guru;

//上师表
public class Cmfz_guruDto {
	
	private List<Cmfz_guru> rows;//所有数据
	private Integer total;//总条数
	public Cmfz_guruDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cmfz_guruDto(List<Cmfz_guru> rows, Integer total) {
		super();
		this.rows = rows;
		this.total = total;
	}
	public List<Cmfz_guru> getRows() {
		return rows;
	}
	public void setRows(List<Cmfz_guru> rows) {
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
		return "Cmfz_guruDto [rows=" + rows + ", total=" + total + "]";
	}
	
	
}
