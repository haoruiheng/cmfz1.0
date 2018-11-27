package com.service.impl;
//菜单模块
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dao.Cmfz_menuDao;
import com.entity.Cmfz_menu;
import com.service.Cmfz_menuService;

@Service("menuService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class Cmfz_menuServiceImpl implements Cmfz_menuService {
	//DI注入
	//@Autowired
	@Resource(name="cmfz_menuDao")
	private Cmfz_menuDao menuDao;
	//菜单查所有
	@Override
	public List<Cmfz_menu> findAll() {
		// TODO Auto-generated method stub
		return menuDao.selectAll();
	}

}
