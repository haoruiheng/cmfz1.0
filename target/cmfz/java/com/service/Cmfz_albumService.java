package com.service;

import com.dto.Cmfz_albumDto;
import com.entity.Cmfz_album;

//专辑表
public interface Cmfz_albumService {
	//分页查所有
	Cmfz_albumDto find(int page,int rows);
	//添加数据
	void addAlbum(Cmfz_album album);
}
