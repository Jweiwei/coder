package com.weiwei.coder.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weiwei.coder.demo.dao.DemoUserDao;
import com.weiwei.coder.demo.model.DemoUser;
import com.weiwei.coder.demo.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private DemoUserDao demoUserDao;

	public int add(DemoUser demoUser) {
		return demoUserDao.save(demoUser);
	}

}
