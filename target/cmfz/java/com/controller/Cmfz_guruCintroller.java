package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dto.Cmfz_guruDto;
import com.entity.Cmfz_guru;
import com.service.Cmfz_guruService;

//上师模块
@Controller
@RequestMapping("guruCintroller")
public class Cmfz_guruCintroller {
	
	//DI注入
	@Resource(name="guruService")
	private Cmfz_guruService guruService;
	
	//分页查所有
	@RequestMapping("selectGuru")
	@ResponseBody
	public Cmfz_guruDto selectGuru(int page,int rows){
		return guruService.findCmfz_guru(page, rows);
	}
	//查询所有
	@RequestMapping("selectGuruAll")
	@ResponseBody
	public List<Cmfz_guru> selectGuruAll(){
		return guruService.findGuru();
	}
	//添加数据
	@RequestMapping("insertGuru")
	@ResponseBody
	public void insertGuru(Cmfz_guru guru){
		guruService.addGuru(guru);
	}
	//修改状态
	@RequestMapping("updateGuru")
	@ResponseBody
	public void updateGuru(Cmfz_guru guru){
		guruService.modifyGuru(guru);
	}
}
