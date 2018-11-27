package com.service;

import java.util.List;

import com.dto.Cmfz_guruDto;
import com.entity.Cmfz_guru;

//上师模块
public interface Cmfz_guruService {
	//分页查所有
	Cmfz_guruDto findCmfz_guru(int page,int rows);
	//查所有
	List<Cmfz_guru> findGuru();
	//添加数据
	void addGuru(Cmfz_guru guru);
	//修改状态
	void modifyGuru(Cmfz_guru guru);
}
